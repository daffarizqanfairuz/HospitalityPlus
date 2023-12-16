package hospitalityplus;

import db.DBHelper;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class MemilihKamarController implements Initializable {

    @FXML
    private TextField tfNomorKamar;

    @FXML
    private TableView<kamar> tvData; // Assuming your kamar class is named 'Kamar'

    @FXML
    private TableColumn<kamar, String> colNomorKamar;

    @FXML
    private TableColumn<kamar, String> colJenisKamar;

    @FXML
    private Button btnPilih;

    @FXML
    void handleButtonAction(ActionEvent event) throws IOException {
        kamar kmr = new kamar(tfNomorKamar.getText());
       
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TelusuriProduk.fxml"));
        
        Parent root = loader.load();

        TelusuriProdukController produk = loader.getController();
        produk.showValue(kmr);

        Stage stage = (Stage) btnPilih.getScene().getWindow();
        stage.setScene(new Scene(root));
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        showKamar();
    }

    public ObservableList<kamar> getKamar() {
        ObservableList<kamar> kmr = FXCollections.observableArrayList();
        Connection conn = DBHelper.getConnection();
        String query = "SELECT * FROM `kamar`";
        Statement st;
        ResultSet rs;

        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);
            kamar temp;
            while (rs.next()) {
                temp = new kamar(rs.getString("nomorKamar"), rs.getString("jenisKamar"));
                kmr.add(temp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return kmr;
    }

    public void showKamar() {
        ObservableList<kamar> list = getKamar();

        colNomorKamar.setCellValueFactory(new PropertyValueFactory<>("nomorKamar"));
        colJenisKamar.setCellValueFactory(new PropertyValueFactory<>("jenisKamar"));
        
        tvData.setItems(list);
    }
}

