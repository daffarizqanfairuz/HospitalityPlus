package hospitalityplus;

import db.DBHelper;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Observable;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class MemilihKamarController implements Initializable{

    @FXML
    private TextField tfNomorRuangan;

    @FXML
    private TableView<kamar> tvData;

    @FXML
    private TableColumn<kamar, String> colNomorKamar;

    @FXML
    private TableColumn<kamar, String> colJenisKamar;

    @FXML
    private TableColumn<kamar, String> colKetersediaan;

    @FXML
    private Button btnPilih;

    @FXML
    void handleButtonAction(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
            showKamar();
    }
    
//    public ObservableList<kamar> getKamar(){
//        ObservableList<kamar> kmr = FXCollections.observableArrayList();
//        Connection conn = DBHelper.getConnection();
//        String query = "SELECT * FROM `kamar`";
//        Statement st;
//        ResultSet rs;
//        
//        try {
//            st = conn.createStatement();
//            rs = st.executeQuery(query);
//            kamar temp;
//            while(rs.next()){
//                temp = new kamar(rs.getString("nomor_kamar"), rs.getString("jenis_kamar"), rs.getString("ketersediaan"));
//                kmr.add(temp);
//            }
//        }catch (SQLException ex){
//            ex.printStackTrace();
//        }
//        return kmr;
//    }
    
    public void showKamar(){
        kamarDB kmr1 = new kamarDB();
        ObservableList<kamar> list = (ObservableList<kamar>) kmr1.getKamar();
        
        colNomorKamar.setCellValueFactory(new PropertyValueFactory<>("nomor_kamar"));
        colJenisKamar.setCellValueFactory(new PropertyValueFactory<>("jenis_kamar"));
        colKetersediaan.setCellValueFactory(new PropertyValueFactory<>("ketersediaan"));
        tvData.setItems(list);
    }
   
}
