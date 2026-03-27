package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class Controlador implements Initializable{
	
	@FXML private ToggleGroup bebidas;
	@FXML private ComboBox<String> cmbPlatos;
	@FXML private ChoiceBox<String> cmbPostres;
	@FXML private CheckBox cmbComp1;
	@FXML private CheckBox cmbComp2;
	@FXML private TextArea orden;
	
	
 @Override
 public void initialize(URL arg0, ResourceBundle arg1) {
	 cmbPlatos.getItems().addAll("Chilaquiles", "Omelet", "Milanea", "Empanadas", "Huarache");
	 cmbPlatos.getSelectionModel().selectFirst();
	 
	 cmbPostres.getItems().addAll("Coctel de frutas", "Waffles", "Helado", "Pay");
	 cmbPostres.getSelectionModel().selectFirst();
 }
 @FXML public void clickOrdenar() {
	 String bebida, complemento = "", pedido;
	 
	 //Recuperar bebida
	 RadioButton bebidaSeleccionada = (RadioButton) bebidas.getSelectedToggle();
	 bebida = (bebidaSeleccionada != null) ? bebidaSeleccionada.getText():"Ninguna";
	 
	 //Recuperar complementos
	 if(cmbComp1.isSelected())
		 complemento += cmbComp1.getText();
	 
	 if(cmbComp2.isSelected())
		 complemento += cmbComp2.getText();
	 
	 if(complemento.isEmpty())
		 complemento = "Ninguno";
	 
	 pedido = "bebida:" + bebida + 
			 "\nPlato fuerte: " + cmbPlatos.getValue() +
			 "\nPostre: " + cmbPostres.getValue() +
			 "\nComplementos: " + complemento;
	 
	 orden.setText(pedido);
 }

}