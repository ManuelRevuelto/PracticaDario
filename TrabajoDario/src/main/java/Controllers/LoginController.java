package Controllers;

import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

	@FXML
	Button btnConfirm;

	@FXML
	TextField textUser;

	@FXML
	PasswordField textPassw;

	int contador = 0;

	@FXML
	public void confirm(ActionEvent event) {
		String user = textUser.getText();
		String pass = this.textPassw.getText();
		if (!(contador == 3)) {

			if (!user.equals("Dam") && !pass.equals("Dam")) {
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setTitle(" ERROR ");
				alert.setContentText("Usuario o Password INCORRECTO");
				alert.showAndWait();
				contador++;
			} else {
				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("/Views/Menu.fxml"));
					Parent root = loader.load();
					MenuController controlador = loader.getController();
					Scene scene = new Scene(root);
					Stage stage = new Stage();
					stage.setScene(scene);
					stage.show();
					stage.setOnCloseRequest(e -> controlador.closeWindowsMenu());
					Stage mystage = (Stage) this.btnConfirm.getScene().getWindow();
					mystage.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} else {
			Alert alert = new Alert(Alert.AlertType.WARNING);
			alert.setTitle("SEGURIDAD");
			alert.setContentText(" POR SEGURIDAD SE VA A CERRAR LA APLICACION\n RAZON: INTENTOS FALLIDOS SUPERADOS");
			alert.showAndWait();
			Platform.exit();
		}

	}

}
