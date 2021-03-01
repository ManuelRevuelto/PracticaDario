package Controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import DAO.BuilderClienteDao;
import DAO.ClienteDao;
import EXCEPCIONES.MisExcepciones;
import MODEL.Cliente;
import MODEL.misDocumentos;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ClienteController {
	@FXML
	TextField textId, textNombre, textApellido, textTlf, textCiudad, textCodPost, textEmail, textPass, textDocumento;
	@FXML
	RadioButton dni, nie;
	@FXML
	Button crearBtn;

	static List<Cliente> misClientes = new ArrayList<Cliente>();
	static ClienteDao clienteDao = new ClienteDao(misClientes);
	Cliente c2;

	public Cliente crearCliente() throws MisExcepciones {
		c2 = new Cliente(misDocumentos.DNI, "25359770W", "email1@gmail.com", "pass1", 1, "nom1", "Carlos", "si",
				601393403, 0, null, null, null, null, null, 0, 0, 0);
		clienteDao.guardar(c2);
		int id = Integer.parseInt(textId.getText());
		String nombre = textNombre.getText();
		String ape = textApellido.getText();
		int tlf = Integer.parseInt(textTlf.getText());
		String city = textCiudad.getText();
		int codPost = Integer.parseInt(textCodPost.getText());
		String email = textEmail.getText();
		String documento = textDocumento.getText();
		String pass = textPass.getText();
		misDocumentos t = dni.isSelected() ? misDocumentos.DNI : misDocumentos.NIE;
		Cliente c = BuilderClienteDao.build(t, documento, email, pass, id, nombre, ape, pass, tlf, codPost, city, pass,
				pass, pass, pass, id, id, id, null, false);
		clienteDao.guardar(c);
		return c;

	}

	@FXML
	public void crearCli(ActionEvent actionEvent) throws MisExcepciones {
		Cliente c = null;
		c = crearCliente();

		clienteDao.guardar(c);

		for (Cliente cliente : misClientes) {
			System.out.println(cliente.toString());
		}
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle(" MENSAJE ");
		alert.setContentText("CLIENTE AÑADIDO CORRECTAMENTE");
		alert.showAndWait();
	}

	public void closeWindowsCliente() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/Views/Menu.fxml"));
			Parent root = loader.load();
			MenuController controlador = loader.getController();
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
			stage.setOnCloseRequest(e -> controlador.closeWindowsMenu());
			Stage mystage = (Stage) this.crearBtn.getScene().getWindow();
			mystage.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
