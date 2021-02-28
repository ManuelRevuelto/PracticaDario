package SceneBuilder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controlador {

	@FXML
	Button startButton;
	@FXML
	PasswordField passwordField;
	@FXML
	TextField startTextField;
	
	String usuario, password;
	
	@FXML
	public void enviar() {
		
		usuario = startTextField.getText();
		password = passwordField.getText();
		
		if (usuario == "Hola") {
			System.out.println("tonto");
		}
		
	}
	
}