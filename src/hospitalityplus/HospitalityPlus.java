/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalityplus;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import db.DBHelper;
import java.sql.Connection;
import java.util.ArrayList;
/**
 *
 * @author idref
 */
public class HospitalityPlus extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MemilihKamar.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setTitle("Hospitality Plus");
        stage.setScene(scene);
        stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
        
    }
    
}
