package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controlador implements Initializable{
	
 @FXML TextField txtCantidad;
 @FXML ComboBox<String> cmbMoneda;
 @FXML Label lblResultado;
	
 @Override
 public void initialize(URL arg0, ResourceBundle arg1) {
  cmbMoneda.getItems().addAll("Pesos a dólares", "Dólares a pesos", "Pesos a euros", "Euros a pesos");
  cmbMoneda.getSelectionModel().selectFirst();
 }

 @FXML public void clickCalcular() {
	double resultado = 0;
	double cantidad;
	String moneda;
	
	try {
		cantidad = Double.parseDouble(txtCantidad.getText());
		moneda = cmbMoneda.getValue();
		
		switch(moneda) {
		case "Pesos a dólares":
			resultado = cantidad * 0.056;
			break;
		case "Dólares a pesos":
			resultado = cantidad * 17.87;
			break;
			
		case "Pesos a euros":
			resultado = cantidad * 0.048;
			break;
			
		case "Euros a pesos":
			resultado = cantidad * 20.65;
			break;
		}
		lblResultado.setText("La conversion es " + String.format("$%.2f", resultado));
	} catch(NumberFormatException e) {
		lblResultado.setText("Error, ingresa solo numeros");
	}
 }
 
}