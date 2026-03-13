package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class Controlador implements Initializable{
	
 @FXML ComboBox<String> cmbMoneda;
	
 @Override
 public void initialize(URL arg0, ResourceBundle arg1) {
  cmbMoneda.getItems().addAll("Pesos a dólares", "Dólares a pesos");
  cmbMoneda.getSelectionModel().select(0);
 }

}