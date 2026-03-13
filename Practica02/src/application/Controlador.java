package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class Controlador {
	@FXML TextField n1;
	@FXML TextField n2;
	@FXML Label resultado;
	
	@FXML public void clickSuma() {
		try {
			int num1 = Integer.parseInt(n1.getText());
			int num2 = Integer.parseInt(n2.getText());
			int res = num1 + num2;
			resultado.setText(String.valueOf(res));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
