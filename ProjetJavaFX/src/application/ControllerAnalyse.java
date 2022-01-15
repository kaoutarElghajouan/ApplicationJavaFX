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
import javafx.stage.Stage;

public class ControllerAnalyse implements Initializable{

	@FXML
	private Button btnAnalyse;
	@FXML
	private Label AffichageAnalyse;	
	
	private String txtDiagnostique;
	  
	public void AfficherAnalyse(String txt,String txtDiagnostique) {
		AffichageAnalyse.setText(txt);
		this.txtDiagnostique=txtDiagnostique;
	}
	
	@FXML
	public void AffichageDiagnostique(ActionEvent e) {
		
		try {
			((Node)e.getSource()).getScene().getWindow().hide();
			FXMLLoader loader=new FXMLLoader(getClass().getResource("/application/Diagnostique.fxml"));
			Parent root = (Parent)loader.load();
			ControllerDiagnostique cd=loader.getController();
			cd.AfficherAnalyse(txtDiagnostique);
			Stage stage = new Stage();
			stage.setTitle("Diagnostique Systeme");
			stage.setScene(new Scene(root));
			stage.show();
			
		}catch(IOException ex) {
			ex.printStackTrace();
			
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
