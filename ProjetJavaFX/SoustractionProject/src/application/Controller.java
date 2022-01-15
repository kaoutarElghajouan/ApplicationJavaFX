package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Controller {
Parent parent;
Stage stage;
Scene scene;
	public void BienvenueVERSInitiale(MouseEvent e) throws IOException {
		parent=FXMLLoader.load(getClass().getResource("PageInitiale.fxml"));
		stage=(Stage)((Node)e.getSource()).getScene().getWindow();
		scene=new Scene(parent);
		stage.setScene(scene);
		stage.show();
		
	}
}
