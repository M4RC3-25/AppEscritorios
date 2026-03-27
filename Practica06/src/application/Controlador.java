package application;

import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class Controlador implements Initializable{
	
 @FXML private DatePicker dpFecha;
 @FXML private Label lblSalida;
 
 
 @Override
 public void initialize(URL arg0, ResourceBundle arg1) {
  
 }
 
 @FXML public void clickGuardar() {
     lblSalida.setText("Fecha seleccionada: " + Date.valueOf(dpFecha.getValue()));
 }
 

}