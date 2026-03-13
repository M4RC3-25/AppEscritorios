package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class Controlador {
	@FXML TextField nombre;
	@FXML Label saludo;
	
	@FXML public void clickSaludar() {
		try {
			String n = nombre.getText();
			saludo.setText("Hola " + n);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
