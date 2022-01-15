package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ControllerDiagnostique implements Initializable{
	Parent parent;
	Stage stage;
	Scene scene;

	@FXML
	private Button btnDiagnostique;
	@FXML
	private Label AffichageDiagnostique;	
	
	
	public void AfficherAnalyse(String txt) {
		AffichageDiagnostique.setText(txt);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	/*@FXML
	public void handleCloseButtonAction(ActionEvent event) throws IOException {
	    ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
	}
	
	@FXML
	public void diagnostiqueVERSinitiale(MouseEvent e) throws IOException {
		parent = FXMLLoader.load(getClass().getResource("PageInitiale.fxml"));
		stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		scene = new Scene(parent);
		stage.setScene(scene);
		stage.show();

	}*/
	
	@FXML
	public void quitterDiagnostique(ActionEvent e) {
		((Node)e.getSource()).getScene().getWindow().hide();
	}
}
