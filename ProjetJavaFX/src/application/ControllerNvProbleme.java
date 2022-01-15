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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ControllerNvProbleme implements Initializable{
	@FXML
	private TextField emp0;	
	@FXML
	private TextField emp1;
	@FXML
	private TextField remp0;
	@FXML
	private TextField remp1;
	@FXML
	private TextField NH1;
	@FXML
	private TextField NH2;
	@FXML
	private TextField NH3;
	@FXML
	private TextField NB1;
	@FXML
	private TextField NB2;
	@FXML
	private TextField NB3;
	@FXML
	private TextField R1;
	@FXML
	private TextField R2;
	@FXML
	private TextField R3;
	@FXML
	private Button OK;
	@FXML 
	private ComboBox choix;
	@FXML 
	private CheckBox system;
	@FXML 
	private CheckBox utilisateur;
	int[][] T =new  int[5][3];
	
@Override
public void initialize(URL location, ResourceBundle resources) {
	// TODO Auto-generated method stub
	
}

@FXML 
public void handleSystem(){
	if(system.isSelected()) {
		utilisateur.setSelected(false);
	}
}

@FXML 
public void handleUtilisateur(){
	if(utilisateur.isSelected()) {
		system.setSelected(false);
		choix.setDisable(true);
	}
}

@FXML
public void verrouiller(MouseEvent e) {
	choix.setDisable(true);
	if(system.isSelected() && !utilisateur.isSelected()) {
		choix.setDisable(false);
	}
}
@FXML
public void choixversinitiale(ActionEvent e) throws IOException  {
	choix.setDisable(false);
	if(system.isSelected() && !utilisateur.isSelected() ) {	
	String CHOIX=choix.getSelectionModel().getSelectedItem().toString();	
	if(CHOIX.equals("Problème arbitraire")) {
		System.out.println("hello :"+CHOIX);
		((Node)e.getSource()).getScene().getWindow().hide();
		FXMLLoader loader=new FXMLLoader(getClass().getResource("/application/PageInitiale.fxml"));
		Parent root = (Parent)loader.load();
		Controller sc=loader.getController();
		sc.afficher1(T);
		Stage stage = new Stage();
		stage.setTitle("Problème arbitraire");
		stage.setScene(new Scene(root));
		stage.show();

		

	
	}if(CHOIX.equals("Probléme sans emprunt")) {
		System.out.println("hello :"+CHOIX);
		((Node)e.getSource()).getScene().getWindow().hide();
		FXMLLoader loader=new FXMLLoader(getClass().getResource("/application/PageInitiale.fxml"));
		Parent root = (Parent)loader.load();
		Controller sc=loader.getController();
		sc.afficher2(T);
		Stage stage = new Stage();
		stage.setTitle("Probléme sans emprunt");
		stage.setScene(new Scene(root));
		stage.show();
	
	}if(CHOIX.equals("Probléme avec un seul emprunt")) {
		System.out.println("hello :"+CHOIX);
		((Node)e.getSource()).getScene().getWindow().hide();
		FXMLLoader loader=new FXMLLoader(getClass().getResource("/application/PageInitiale.fxml"));
		Parent root = (Parent)loader.load();
		Controller sc=loader.getController();
		sc.afficher3(T);
		Stage stage = new Stage();
		stage.setTitle("Probléme avec un seul emprunt");
		stage.setScene(new Scene(root));
		stage.show();
	
	}if(CHOIX.equals("Probléme avec deux emprunt")) {
		System.out.println("hello :"+CHOIX);
		((Node)e.getSource()).getScene().getWindow().hide();
		FXMLLoader loader=new FXMLLoader(getClass().getResource("/application/PageInitiale.fxml"));
		Parent root = (Parent)loader.load();
		Controller sc=loader.getController();
		sc.afficher4(T);
		Stage stage = new Stage();
		stage.setTitle("Probléme avec deux emprunt");
		stage.setScene(new Scene(root));
		stage.show();
	
	}if(CHOIX.equals("Probléme avec un zéro en haut")) {
		System.out.println("hello :"+CHOIX);
		((Node)e.getSource()).getScene().getWindow().hide();
		FXMLLoader loader=new FXMLLoader(getClass().getResource("/application/PageInitiale.fxml"));
		Parent root = (Parent)loader.load();
		Controller sc=loader.getController();
		sc.afficher5(T);
		Stage stage = new Stage();
		stage.setTitle("Probléme avec un zéro en haut");
		stage.setScene(new Scene(root));
		stage.show();
	
	}if(CHOIX.equals("Probléme avec des zéros en haut")) {
		System.out.println("hello :"+CHOIX);
		((Node)e.getSource()).getScene().getWindow().hide();
		FXMLLoader loader=new FXMLLoader(getClass().getResource("/application/PageInitiale.fxml"));
		Parent root = (Parent)loader.load();
		Controller sc=loader.getController();
		sc.afficher6(T);
		Stage stage = new Stage();
		stage.setTitle("Probléme avec des zéros en haut");
		stage.setScene(new Scene(root));
		stage.show();
	
	}if(CHOIX.equals("Probléme avec un zéro en bas")) {
		System.out.println("hello :"+CHOIX);
		((Node)e.getSource()).getScene().getWindow().hide();
		FXMLLoader loader=new FXMLLoader(getClass().getResource("/application/PageInitiale.fxml"));
		Parent root = (Parent)loader.load();
		Controller sc=loader.getController();
		sc.afficher7(T);
		Stage stage = new Stage();
		stage.setTitle("Probléme avec un zéro en bas");
		stage.setScene(new Scene(root));
		stage.show();
	
	}if(CHOIX.equals("Probléme avec des zéros en bas")) {
		System.out.println("hello :"+CHOIX);
		((Node)e.getSource()).getScene().getWindow().hide();
		FXMLLoader loader=new FXMLLoader(getClass().getResource("/application/PageInitiale.fxml"));
		Parent root = (Parent)loader.load();
		Controller sc=loader.getController();
		sc.afficher8(T);
		Stage stage = new Stage();
		stage.setTitle("Probléme avec des zéros en bas");
		stage.setScene(new Scene(root));
		stage.show();
	
	}
	}else if(!system.isSelected() && utilisateur.isSelected()){
		((Node)e.getSource()).getScene().getWindow().hide();
		FXMLLoader loader=new FXMLLoader(getClass().getResource("/application/PageInitiale.fxml"));
		Parent root = (Parent)loader.load();
		Stage stage = new Stage();
		stage.setTitle("Utilisateur");
		stage.setScene(new Scene(root));
		stage.show();
	}
}
	
}
