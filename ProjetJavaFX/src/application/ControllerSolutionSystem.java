package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerSolutionSystem implements Initializable{
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
	
 
   

public void afficher(int T[][]) {
	
	emp0.setText(Integer.toString(T[0][2]));
	emp1.setText(Integer.toString(T[0][1]));
	remp0.setText(Integer.toString(T[1][1]));
	remp1.setText(Integer.toString(T[1][0]));
	NH1.setText(Integer.toString(T[2][2]));
	NH2.setText(Integer.toString(T[2][1]));
	NH3.setText(Integer.toString(T[2][0]));
	NB1.setText(Integer.toString(T[3][2]));
	NB2.setText(Integer.toString(T[3][1]));
	NB3.setText(Integer.toString(T[3][0]));
	R1.setText(Integer.toString(T[4][2]));
	R2.setText(Integer.toString(T[4][1]));
	R3.setText(Integer.toString(T[4][0]));
	
	
}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
