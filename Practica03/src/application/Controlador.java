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
	
	@FXML public void clickResta() {
		try {
			int num1 = Integer.parseInt(n1.getText());
			int num2 = Integer.parseInt(n2.getText());
			int res = num1 - num2;
			if(res < 0) {
				res = num2 - num1;
			}
			resultado.setText(String.valueOf(res));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML public void clickMultiplicar() {
		try {
			int num1 = Integer.parseInt(n1.getText());
			int num2 = Integer.parseInt(n2.getText());
			int res = num1 * num2;
			resultado.setText(String.valueOf(res));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML public void clickDividir() {
		try {
			int num1 = Integer.parseInt(n1.getText());
			int num2 = Integer.parseInt(n2.getText());
			if(num1 != 0 && num2 != 0) {
				int res = num1 / num2;
				resultado.setText(String.valueOf(res));
			}
			else {
				resultado.setText("Intenta con numeros diferentes a 0");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
