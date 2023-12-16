package hospitalityplus;

import db.DBHelper;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class TelusuriProdukController implements Initializable {

    @FXML
    private Label lblNomorKamar;

    @FXML
    private TableView<layanan_tambahan> tvProduk;

    @FXML
    private TableColumn<layanan_tambahan, String> colIdLayanan;

    @FXML
    private TableColumn<layanan_tambahan, String> colNamaLayanan;

    @FXML
    private TableColumn<layanan_tambahan, String> colDeskripsi;

    @FXML
    private TableColumn<layanan_tambahan, Double> colHarga;

    @FXML
    private Button btnPilih;

    @FXML
    private TextField tfLayananTambahan;

    @FXML
    private Button btnSkip;

    private kamar selectedKamar; // Store the selected kamar

    public void showValue(kamar kmr) {
        lblNomorKamar.getText();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialization code
    }

    public ObservableList<layanan_tambahan> getLayanan_Tambahan() {
        ObservableList<layanan_tambahan> produk = FXCollections.observableArrayList();
        Connection conn = DBHelper.getConnection();
        String query = "SELECT * FROM `layanan_tambahan`";
        Statement st;
        ResultSet rs;

        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);
            layanan_tambahan temp;
            while (rs.next()) {
                temp = new layanan_tambahan(rs.getString("idLayanan"), rs.getString("namaLayanan"), rs.getString("deskripsi"), rs.getDouble("harga"));
                produk.add(temp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return produk;
    }

    public void showLayanan() {
        ObservableList<layanan_tambahan> list = getLayanan_Tambahan();

        colIdLayanan.setCellValueFactory(new PropertyValueFactory<>("idLayanan"));
        colNamaLayanan.setCellValueFactory(new PropertyValueFactory<>("namaLayanan"));
        colDeskripsi.setCellValueFactory(new PropertyValueFactory<>("deskripsi"));
        colHarga.setCellValueFactory(new PropertyValueFactory<>("harga"));
        tvProduk.setItems(list);
    }
    
    // Add methods to handle button actions, e.g., btnPilih and btnSkip
    // You may want to update the logic here to interact with your kamar and layanan_tambahan objects.
}
