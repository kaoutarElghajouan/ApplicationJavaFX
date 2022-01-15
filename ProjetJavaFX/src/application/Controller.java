package application;


import java.io.IOException;

import java.util.Optional;

import java.util.stream.Collectors;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Controller {
	Parent parent;
	Stage stage;
	Scene scene;
	
	@FXML 
	private ComboBox choix;
	@FXML 
	private CheckBox system;
	@FXML
	private TextField nbrhaut1;
	@FXML
	private TextField nbrhaut2;
	@FXML
	private TextField nbrhaut3;
	@FXML
	private TextField nbrbas1;
	@FXML
	private TextField nbrbas2;
	@FXML
	private TextField nbrbas3;
	@FXML
    private TextField empreintB1; 
	@FXML
    private TextField empreintB2; 
	@FXML
    private TextField empreintL1; 
	@FXML
    private TextField empreintL2;
	@FXML
	private TextField resultat1;
	@FXML
	private TextField resultat2;
	@FXML
	private TextField resultat3; 	
	@FXML
	private String arbitraire;
	
	@FXML
	private Label LblAffichage;
	@FXML 
	private Button quitter;
	
	@FXML
	public void Quitter(ActionEvent e) {
		System.exit(0);
	}
		
	int[][] T =new  int[5][3];
	int [] Resultats=new int [3];
	
	public int[] nouveau_probléme() {
		int Min=100,Max=999,nombreAleatoireh=0,nombreAleatoireb=0;
        do {
        	nombreAleatoireh = Min + (int)(Math.random() * ((Max - Min) + 1));
		    nombreAleatoireb = Min + (int)(Math.random() * ((Max - Min) + 1));
		}while(nombreAleatoireb>nombreAleatoireh);
        int a[]= {nombreAleatoireh,nombreAleatoireb};
		  return a ;   
		}	

	public void afficher1(int T[][]) {
		
		int a[]= {0,0};
	    String nh ;
	    char rh1 ,rh2,rh3;
	    int  rh1n,rh2n,rh3n;
	    String nb;
	    char rb1,rb2,rb3;
	    int  rb1n,rb2n,rb3n;
	    boolean test = true;
	    do {
	    	a= nouveau_probléme();
	        System.out.println(a[0] +" "+ a[1] +" " );
	         nh = ""+a[0];
	         rh1=nh.charAt(2);
	         rh2=nh.charAt(1);
	         rh3=nh.charAt(0);
	         nb = ""+a[1];
	         rb1=nb.charAt(2);
	         rb2=nb.charAt(1);
	         rb3=nb.charAt(0);
	    }while((rh1<=rb1) || (rh1<=rb1) || (rh1<=rb1) && (rh1+rh2*10+rh3*100)<(rb1+rb2*10+rb3*100));
			nbrhaut1.setText(""+rh1);nbrhaut2.setText(""+rh2);nbrhaut3.setText(""+rh3);
			nbrbas1.setText(""+rb1);nbrbas2.setText(""+rb2);nbrbas3.setText(""+rb3);
	}
	
public void afficher2(int T[][]) {
	int a[]= {0,0};
    String nh ;
    char rh1 ,rh2,rh3;
    int  rh1n,rh2n,rh3n;
    String nb;
    char rb1,rb2,rb3;
    int  rb1n,rb2n,rb3n;
    boolean test = true;
	do {
		a= nouveau_probléme();
        nh = ""+a[0];
        rh1=nh.charAt(2);
        rh2=nh.charAt(1);
        rh3=nh.charAt(0);
    
        rh1n =Integer.parseInt(""+rh1);
        rh2n =Integer.parseInt(""+rh2);
        rh3n =Integer.parseInt(""+rh3);
        
        nb = ""+a[1];
        rb1=nb.charAt(2);
        rb2=nb.charAt(1);
        rb3=nb.charAt(0);
       
        rb1n =Integer.parseInt(""+rb1);
        rb2n =Integer.parseInt(""+rb2);
        rb3n =Integer.parseInt(""+rb3);
        
		}while(rb1n>=rh1n || rb2n>=rh2n || rb3n>=rh3n);
		 nbrhaut1.setText(""+rh1);nbrhaut2.setText(""+rh2);nbrhaut3.setText(""+rh3);
			nbrbas1.setText(""+rb1);nbrbas2.setText(""+rb2);nbrbas3.setText(""+rb3);
	
	
}
public void afficher3(int T[][]) {
	int a[]= {0,0};
    String nh ;
    char rh1 ,rh2,rh3;
    int  rh1n,rh2n,rh3n;
    String nb;
    char rb1,rb2,rb3;
    int  rb1n,rb2n,rb3n;
    boolean test = true;
    do {
		a= nouveau_probléme();
        nh = ""+a[0];
        rh1=nh.charAt(2);
        rh2=nh.charAt(1);
        rh3=nh.charAt(0);
    
        rh1n =Integer.parseInt(""+rh1);
        rh2n =Integer.parseInt(""+rh2);
        rh3n =Integer.parseInt(""+rh3);
        
        nb = ""+a[1];
        rb1=nb.charAt(2);
        rb2=nb.charAt(1);
        rb3=nb.charAt(0);
       
        rb1n =Integer.parseInt(""+rb1);
        rb2n =Integer.parseInt(""+rb2);
        rb3n =Integer.parseInt(""+rb3);
        if((rb1n>rh1n && rb2n<rh2n && rb3n<rh3n)||(rb1n<rh1n && rb2n>rh2n && rb3n<rh3n)) {
        	test = false ;
        }
		}while(test==true);
		 System.out.println(rh1+"  "+ rh2+"  "+ rh3);
		 System.out.println(rh1n+"  "+ rh2n+"  "+ rh3n);
		 System.out.println(rb1+"  "+ rb2+"  "+ rb3);
		 System.out.println(rb1n+"  "+ rb2n+"  "+ rb3n);
		nbrhaut1.setText(""+rh1n);nbrhaut2.setText(""+rh2n);nbrhaut3.setText(""+rh3n);
		nbrbas1.setText(""+rb1n);nbrbas2.setText(""+rb2n);nbrbas3.setText(""+rb3n);
	
}

public void afficher4(int T[][]) {
	int a[]= {0,0};
    String nh ;
    char rh1 ,rh2,rh3;
    int  rh1n,rh2n,rh3n;
    String nb;
    char rb1,rb2,rb3;
    int  rb1n,rb2n,rb3n;
    boolean test = true;
	do {
		a= nouveau_probléme();
        nh = ""+a[0];
        rh1=nh.charAt(2);
        rh2=nh.charAt(1);
        rh3=nh.charAt(0);
    
        rh1n =Integer.parseInt(""+rh1);
        rh2n =Integer.parseInt(""+rh2);
        rh3n =Integer.parseInt(""+rh3);
        
        nb = ""+a[1];
        rb1=nb.charAt(2);
        rb2=nb.charAt(1);
        rb3=nb.charAt(0);
       
        rb1n =Integer.parseInt(""+rb1);
        rb2n =Integer.parseInt(""+rb2);
        rb3n =Integer.parseInt(""+rb3);
        if(rb1n>rh1n && rb2n>rh2n && rb3n<rh3n) {
        	test = false ;
        }
		}while(test==true);
		nbrhaut1.setText(""+rh1n);nbrhaut2.setText(""+rh2n);nbrhaut3.setText(""+rh3n);
		nbrbas1.setText(""+rb1n);nbrbas2.setText(""+rb2n);nbrbas3.setText(""+rb3n);
	
}
public void afficher5(int T[][]) {
	int a[]= {0,0};
    String nh ;
    char rh1 ,rh2,rh3;
    int  rh1n,rh2n,rh3n;
    String nb;
    char rb1,rb2,rb3;
    int  rb1n,rb2n,rb3n;
    boolean test = true;
    
    a= nouveau_probléme();
    System.out.println(a[0] +" "+ a[1] +" " );
     nh = ""+a[0];
     rh1=nh.charAt(2);
     rh2=nh.charAt(1);
     rh3=nh.charAt(0);
     nb = ""+a[1];
     rb1=nb.charAt(2);
     rb2=nb.charAt(1);
     rb3=nb.charAt(0);
	System.out.println(rh1+"  "+ rh2+"  "+ rh3);
	System.out.println(rb1+"  "+ rb2+"  "+ rb3);

	nbrhaut1.setText(""+0);nbrhaut2.setText(""+rh2);nbrhaut3.setText(""+rh3);
	nbrbas1.setText(""+rb1);nbrbas2.setText(""+rb2);nbrbas3.setText(""+rb3);
	
}
public void afficher6(int T[][]) {
	int a[]= {0,0};
    String nh ;
    char rh1 ,rh2,rh3;
    int  rh1n,rh2n,rh3n;
    String nb;
    char rb1,rb2,rb3;
    int  rb1n,rb2n,rb3n;
    boolean test = true;
    
  
    	a= nouveau_probléme();
        System.out.println(a[0] +" "+ a[1] +" " );
         nh = ""+a[0];
         rh1=nh.charAt(2);
         rh2=nh.charAt(1);
         rh3=nh.charAt(0);
         nb = ""+a[1];
         rb1=nb.charAt(2);
         rb2=nb.charAt(1);
         rb3=nb.charAt(0);

     

	nbrhaut1.setText(""+0);nbrhaut2.setText(""+0);nbrhaut3.setText(""+rh3);
	nbrbas1.setText(""+rb1);nbrbas2.setText(""+rb2);nbrbas3.setText(""+rb3);
	
}
public void afficher7(int T[][]) {
	int a[]= {0,0};
    String nh ;
    char rh1 ,rh2,rh3;
    int  rh1n,rh2n,rh3n;
    String nb;
    char rb1,rb2,rb3;
    int  rb1n,rb2n,rb3n;
    boolean test = true;
    
	a= nouveau_probléme();
    System.out.println(a[0] +" "+ a[1] +" " );
     nh = ""+a[0];
     rh1=nh.charAt(2);
     rh2=nh.charAt(1);
     rh3=nh.charAt(0);
     nb = ""+a[1];
     rb1=nb.charAt(2);
     rb2=nb.charAt(1);
     rb3=nb.charAt(0);

     

	nbrhaut1.setText(""+rh1);nbrhaut2.setText(""+rh2);nbrhaut3.setText(""+rh3);
	nbrbas1.setText(""+0);nbrbas2.setText(""+rb2);nbrbas3.setText(""+rb3);
	
}
public void afficher8(int T[][]) {
	int a[]= {0,0};
    String nh ;
    char rh1 ,rh2,rh3;
    int  rh1n,rh2n,rh3n;
    String nb;
    char rb1,rb2,rb3;
    int  rb1n,rb2n,rb3n;
    boolean test = true;
    
	a= nouveau_probléme();
    System.out.println(a[0] +" "+ a[1] +" " );
     nh = ""+a[0];
     rh1=nh.charAt(2);
     rh2=nh.charAt(1);
     rh3=nh.charAt(0);
     nb = ""+a[1];
     rb1=nb.charAt(2);
     rb2=nb.charAt(1);
     rb3=nb.charAt(0);

     

	nbrhaut1.setText(""+rh1);nbrhaut2.setText(""+rh2);nbrhaut3.setText(""+rh3);
	nbrbas1.setText(""+0);nbrbas2.setText(""+0);nbrbas3.setText(""+rb3);
	
}
	@FXML
	public void NouveauProbleme(MouseEvent e) throws IOException {
		
		
		FXMLLoader loader=new FXMLLoader(getClass().getResource("/application/choixTache.fxml"));
		Parent root = (Parent)loader.load();
		ControllerNvProbleme sc=loader.getController();		
		stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	
	@FXML
	public void AffichageSystem(ActionEvent e)  {
		
		try {
			FXMLLoader loader=new FXMLLoader(getClass().getResource("/application/AffichageSystem.fxml"));
			Parent root = (Parent)loader.load();
			ControllerSolutionSystem sc=loader.getController();
			sc.afficher(T);
			Stage stage = new Stage();
			stage.setTitle("Affichage Systeme");
			//stage.initModality(Modality.WINDOW_MODAL);
			//stage.initOwner(stage);
			stage.setScene(new Scene(root));
			stage.show();
			
		}catch(IOException ex) {
			ex.printStackTrace();
			
		}
	
		
	}

	
		@FXML
		public void handle1(KeyEvent arg0) {
			
			
		    int a = nbrhaut1.getText().length();
		     addTextLimiter(nbrhaut1,1);
			 char ch = nbrhaut1.getText().charAt(0);
               if (a == 1) {
               	if(Character.isDigit(ch)) {
               	javafx.application.Platform.runLater(()->nbrhaut2.requestFocus());
               	}
               	else {
               		Alert caractere= new Alert(Alert.AlertType.WARNING);
               		caractere.setTitle("Erreur");
               		caractere.setContentText("erreur caractère, il faut entrer un nombre");
               		caractere.setHeaderText(null);
               		caractere.showAndWait();
               	}
               }
                
		}		
		@FXML
		public void handle2(KeyEvent arg0) {
			
		     int a = nbrhaut2.getText().length();
		     addTextLimiter(nbrhaut2,1);
			 char ch = nbrhaut2.getText().charAt(0);
                if (a == 1) {
                	if(Character.isDigit(ch)) {
                	javafx.application.Platform.runLater(()->nbrhaut3.requestFocus());
                	}
                	else {
                		Alert caractere= new Alert(Alert.AlertType.WARNING);
                		caractere.setTitle("Erreur");
                		caractere.setContentText("erreur caractère, il faut entrer un nombre");
                		caractere.setHeaderText(null);
                		caractere.showAndWait();
                	}
                }
		}

		@FXML
		public void clicked1(MouseEvent arg0) {
                		
             
                	if(nbrhaut1.getText().isEmpty()) {
                		Alert caractere= new Alert(Alert.AlertType.WARNING);
                		caractere.setTitle("Erreur");
                		caractere.setContentText("Un ou deux élèments des unités ne sont pas remplis");
                		caractere.setHeaderText(null);
                		caractere.showAndWait();
                		
                		Platform.runLater(()->nbrhaut1.requestFocus());
                		
                	}
                		
        }
		@FXML
		public void handle3(KeyEvent arg0) {
		     int a = nbrhaut3.getText().length();
		     addTextLimiter(nbrhaut3,1);
			 char ch = nbrhaut3.getText().charAt(0);
                if (a == 1) {
                	if(Character.isDigit(ch)) {
                	javafx.application.Platform.runLater(()->nbrbas1.requestFocus());
                	}
                	else {
                		Alert caractere= new Alert(Alert.AlertType.WARNING);
                		caractere.setTitle("Erreur");
                		caractere.setContentText("erreur caractère, il faut entrer un nombre");
                		caractere.setHeaderText(null);
                		caractere.showAndWait();
                	}
                }
		}
		@FXML
		public void clicked2(MouseEvent arg0) {        		          
                	if(nbrhaut2.getText().isEmpty()) {
                		
                		Alert caractere= new Alert(Alert.AlertType.WARNING);
                		caractere.setTitle("Erreur");
                		caractere.setContentText("Un ou deux élèments des unités ne sont pas remplis");
                		caractere.setHeaderText(null);
                		caractere.showAndWait();
                		Platform.runLater(()->nbrhaut2.requestFocus());
                		if(nbrhaut1.getText().isEmpty()) {	
                    		Platform.runLater(()->nbrhaut1.requestFocus());    		
                    	}
                	}       		
        }
		@FXML
		public void handle4(KeyEvent arg0) {
		     int a = nbrbas1.getText().length();
		     addTextLimiter(nbrbas1,1);
			 char ch = nbrbas1.getText().charAt(0);
                if (a == 1) {
                	if(Character.isDigit(ch)) {
                	javafx.application.Platform.runLater(()->nbrbas2.requestFocus());
                	}
                	else {
                		Alert caractere= new Alert(Alert.AlertType.WARNING);
                		caractere.setTitle("Erreur");
                		caractere.setContentText("erreur caractère, il faut entrer un nombre");
                		caractere.setHeaderText(null);
                		caractere.showAndWait();
                	}
                }
		}
		public void clicked3(MouseEvent arg0) {
    		
            
        	if(nbrbas1.getText().isEmpty()) {
        		Alert caractere= new Alert(Alert.AlertType.WARNING);
        		caractere.setTitle("Erreur");
        		caractere.setContentText("Un ou deux élèments des unités ne sont pas remplis");
        		caractere.setHeaderText(null);
        		caractere.showAndWait();
        		
        		Platform.runLater(()->nbrbas1.requestFocus());
        		
        	}
        		
}
		@FXML
		public void handle5(KeyEvent arg0) {
		     int a = nbrbas2.getText().length();
		     addTextLimiter(nbrbas2,1);
			 char ch = nbrbas2.getText().charAt(0);
                if (a == 1) {
                	if(Character.isDigit(ch)) {
                	javafx.application.Platform.runLater(()->nbrbas3.requestFocus());
                	}
                	else {
                		Alert caractere= new Alert(Alert.AlertType.WARNING);
                		caractere.setTitle("Erreur");
                		caractere.setContentText("erreur caractère, il faut entrer un nombre");
                		caractere.setHeaderText(null);
                		caractere.showAndWait();
                	}
                }
		}
		@FXML
		public void clicked4(MouseEvent arg0) {        		          
                	if(nbrbas2.getText().isEmpty()) {
                		Alert caractere= new Alert(Alert.AlertType.WARNING);
                		caractere.setTitle("Erreur");
                		caractere.setContentText("Un ou deux élèments des unités ne sont pas remplis");
                		caractere.setHeaderText(null);
                		caractere.showAndWait();         		
                		Platform.runLater(()->nbrbas2.requestFocus());
                		if(nbrbas1.getText().isEmpty()) {	                   		
                    		Platform.runLater(()->nbrbas1.requestFocus());
                    		
                    	}
                	}
                		
        }
		@FXML
		public void handle6(KeyEvent arg0) {
		     int a = nbrbas3.getText().length();
		     addTextLimiter(nbrbas3,1);
			 char ch = nbrbas3.getText().charAt(0);
                if (a == 1) {
                	if(Character.isDigit(ch)) {
                	javafx.application.Platform.runLater(()->resultat1.requestFocus());
                	}
                	else {
                		Alert caractere= new Alert(Alert.AlertType.WARNING);
                		caractere.setTitle("Erreur");
                		caractere.setContentText("erreur caractère, il faut entrer un nombre");
                		caractere.setHeaderText(null);
                		caractere.showAndWait();
                	}
                }
		}
		@FXML
		public void handle7(KeyEvent arg0) {
		     addTextLimiter(resultat1,1);
		     int a = resultat1.getText().length();
		     if(a==1 || a==2) {
				 boolean isNumeric = resultat1.getText().chars().allMatch( Character::isDigit );
				 
				 javafx.application.Platform.runLater(()->resultat2.requestFocus());
					if(!isNumeric) {
	                	
	                		Alert caractere= new Alert(Alert.AlertType.WARNING);
	                		caractere.setTitle("Erreur");
	                		caractere.setContentText("erreur caractère, il faut entrer un nombre");
	                		caractere.setHeaderText(null);
	                		caractere.showAndWait();
	                	}
			//if (a==2)   javafx.application.Platform.runLater(()->resultat2.requestFocus());             
		     }
		}
		@FXML
		public void handle8(KeyEvent arg0) {
		     addTextLimiter(resultat2,1);
		     int a = resultat2.getText().length();
		     if(a==1 || a==2) {
				 boolean isNumeric = resultat2.getText().chars().allMatch( Character::isDigit );
				 javafx.application.Platform.runLater(()->resultat3.requestFocus());
					if(!isNumeric) {
	                	
	                		Alert caractere= new Alert(Alert.AlertType.WARNING);
	                		caractere.setTitle("Erreur");
	                		caractere.setContentText("erreur caractère, il faut entrer un nombre");
	                		caractere.setHeaderText(null);
	                		caractere.showAndWait();
	                	}
				   //  if(a==2)	javafx.application.Platform.runLater(()->resultat3.requestFocus());
			              
		     }
		}
	@FXML
	public void ResultatSoustraction(MouseEvent e) throws IOException {
		boolean t13=resultat1.getText().isEmpty(),t12=resultat2.getText().isEmpty();
		boolean t11=resultat3.getText().isEmpty();
		boolean t5=nbrhaut3.getText().isEmpty(),t6=nbrhaut2.getText().isEmpty();
	    boolean t7=nbrhaut1.getText().isEmpty(),t8=nbrbas3.getText().isEmpty();
		boolean t9=nbrbas2.getText().isEmpty(),t10=nbrbas1.getText().isEmpty();
		
				if(t5 && t8 && t11 && !t13 && !t12 && !t6 && !t7 && !t10 && !t9 ) {
					nbrbas3.setText("0");nbrhaut3.setText("0");resultat3.setText("0");
				}
				if(!t5 && t8 && !t11 && !t13 && !t12 && !t6 && !t7 && !t10 && t9 ) {
					nbrbas3.setText("0");nbrbas2.setText("0");
				}
				if(!t5 && t8 && t11 && !t13 && !t12 && !t6 && !t7 && !t10 && t9 ) {
					nbrbas3.setText("0");nbrbas2.setText("0");resultat3.setText("0");
				}
				if(!t5 && t8 && !t11 && !t13 && !t12 && !t6 && !t7 && !t10 && !t9 ) {
					nbrbas3.setText("0");
				}
				if(!t5 && t8 && t11 && !t13 && !t12 && !t6 && !t7 && !t10 && !t9 ) {
					nbrbas3.setText("0");resultat3.setText("0");
				}
				if(!t5 && t8 && t11 && !t13 && t12 && !t6 && !t7 && !t10 && t9 ) {
					nbrbas3.setText("0");resultat3.setText("0");nbrbas2.setText("0");resultat2.setText("0");
				}
				if(t5 && t8 && t11 && !t13 && t12 && !t6 && !t7 && !t10 && t9 ) {
					nbrbas3.setText("0");resultat3.setText("0");nbrbas2.setText("0");resultat2.setText("0");
					nbrhaut3.setText("0");
				}
				if(!t5 && !t8 && t11 && !t13 && t12 && !t6 && !t7 && !t10 && !t9 ) {
					resultat3.setText("0");resultat2.setText("0");
				}
				if(!t5 && !t8 && t11 && !t13 && !t12 && !t6 && !t7 && !t10 && !t9 ) {
					resultat3.setText("0");
				}
			
		
		//traitement si champs vide
		if(resultat1.getText().isEmpty() && resultat2.getText().isEmpty() && resultat3.getText().isEmpty()) {
			Alert a2= new Alert(Alert.AlertType.WARNING);
			a2.setTitle("Erreur");
			a2.setContentText("Veuillez faire votre opération de soustraction SVP et donner le résultat");
			a2.setHeaderText(null);
			a2.showAndWait();
			return;
		}
		int Nbrhaut1=0;
		if(!nbrhaut1.getText().isEmpty()) {
			Nbrhaut1=Integer.parseInt(nbrhaut1.getText());	
			T[2][2]=Integer.parseInt(nbrhaut1.getText());	
		}
		int Nbrhaut2=0;
		if(!nbrhaut2.getText().isEmpty()) {
			Nbrhaut2=Integer.parseInt(nbrhaut2.getText());	
			T[2][1]=Integer.parseInt(nbrhaut2.getText());	
		}
		int Nbrhaut3=0;
		if(!nbrhaut3.getText().isEmpty()) {
			Nbrhaut3=Integer.parseInt(nbrhaut3.getText());	
			T[2][0]=Integer.parseInt(nbrhaut3.getText());	
		}
		int Nbrbas1=0;
		if(!nbrbas1.getText().isEmpty()) {
			Nbrbas1=Integer.parseInt(nbrbas1.getText());
			T[3][2]=Integer.parseInt(nbrbas1.getText());
		}
		int Nbrbas2=0;
		if(!nbrbas2.getText().isEmpty()) {
			Nbrbas2=Integer.parseInt(nbrbas2.getText());
			T[3][1]=Integer.parseInt(nbrbas2.getText());
		}
		int Nbrbas3=0;
		if(!nbrbas3.getText().isEmpty()) {
			Nbrbas3=Integer.parseInt(nbrbas3.getText());
			T[3][0]=Integer.parseInt(nbrbas3.getText());
		}		
	
		int Resultat1=0;
		if(!resultat1.getText().isEmpty()) {
			Resultat1=Integer.parseInt(resultat1.getText());
			Resultats[0]=Integer.parseInt(resultat1.getText());
			
		}		
		int Resultat2=0;
		if(!resultat2.getText().isEmpty()) {
			Resultat2=Integer.parseInt(resultat2.getText());
			Resultats[1]=Integer.parseInt(resultat2.getText());
		}	
		int Resultat3=0;
		if(!resultat3.getText().isEmpty()) {
			Resultat3=Integer.parseInt(resultat3.getText());
			Resultats[2]=Integer.parseInt(resultat3.getText());
		}	
		
		
		

		//soustraction système 
		int Resultatsystem= (Nbrhaut1+Nbrhaut2*10+Nbrhaut3*100)-(Nbrbas1+Nbrbas2*10+Nbrbas3*100);
		//Le nombre du haut doit etre supérieur au nombre du bas
		if(Resultatsystem>0) { 
			
		int resultSize1 =resultat1.getText().chars().boxed().collect(Collectors.toList()).size();		
		int resultSize2 =resultat2.getText().chars().boxed().collect(Collectors.toList()).size();
		int resultSize3 =resultat3.getText().chars().boxed().collect(Collectors.toList()).size();
		
		
		String ResultatUtilisateur = Resultats[2]+""+Resultats[1]+""+Resultats[0];
		int result = Integer.parseInt(ResultatUtilisateur);
		

		if (result==Resultatsystem) {
			parent = FXMLLoader.load(getClass().getResource("Felicitation.fxml"));
			stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			scene = new Scene(parent);
			stage.setScene(scene);
			stage.show();
		}else {
			int nbrHaut=Nbrhaut1+Nbrhaut2*10+Nbrhaut3*100;
			int nbrBas=Nbrbas1+Nbrbas2*10+Nbrbas3*100;
			
			 LblAffichage.setText("------------------------- \n Nombre du Haut : "+nbrHaut+"\n Nombre du Bas : "+nbrBas+
						" \n Resultat Correct  : "+Resultatsystem+" \n Resultat d'utilisateur : "+ResultatUtilisateur);
			
			Alert a2= new Alert(Alert.AlertType.WARNING);
			a2.setTitle("Erreur");
			a2.setContentText("votre resultat est faux, \n Si vous voulez faire l'analyse clique sur OK");
			a2.setHeaderText(null);

			
			
			
			
			
			
		//  fenetre Analyse 
			
					 Optional<ButtonType> r1 =a2.showAndWait();
					 if(r1.get()==ButtonType.OK) {
							
								 soustraction();
								 GestErreurs GE= new GestErreurs();
								 String [] erreurType= GE.GstErreur(T, Resultats);	

								try {
									FXMLLoader loader=new FXMLLoader(getClass().getResource("/application/Analyse.fxml"));
									Parent root = (Parent)loader.load();
									ControllerAnalyse ac=loader.getController();
									ac.AfficherAnalyse("Le resultat juste est :"+Resultatsystem+erreurType[0],erreurType[1]);
									Stage stage = new Stage();
									stage.setTitle("Analyse Systeme");
									stage.setScene(new Scene(root));
									stage.show();
									
								}catch(IOException ex) {
									ex.printStackTrace();
									
								}

				}
				
	
}
	}else {
			Alert a1= new Alert(Alert.AlertType.WARNING);
			a1.setTitle("Erreur");
			a1.setContentText("Le nombre du haut doit etre supérieur au nombre du bas");
			a1.setHeaderText(null);
			a1.showAndWait();
		}
	
		
		
		
	}
	
	
	@FXML
	public void BienvenueVERSInitiale(MouseEvent e) throws IOException {
		parent = FXMLLoader.load(getClass().getResource("PageInitiale.fxml"));
		stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		scene = new Scene(parent);
		stage.setScene(scene);
		stage.show();

	}
	

	@FXML
	public void FelicitationVERSinitiale(MouseEvent e) throws IOException {
		parent = FXMLLoader.load(getClass().getResource("PageInitiale.fxml"));
		stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		scene = new Scene(parent);
		stage.setScene(scene);
		stage.show();

	
	}
	public static void addTextLimiter(TextField tf, int maxLength) {
	    tf.textProperty().addListener(new ChangeListener<String>() {
	        @Override
	        public void changed(final ObservableValue<? extends String> ov, final String oldValue, final String newValue) {
	            if (tf.getText().length() > maxLength) {
	                String s = tf.getText().substring(0, maxLength);
	                tf.setText(s);
	            }
	        }
	    });
	}
	
	
	
	public void soustraction() {
		int i,j,emp=0;
		for (j=2,i=2; j>=0 ;j--) {
			
			
				int a=T[i][j];
			    int b=T[i+1][j];

			if(emp==1) {
				a=a-1;
				T[i-1][j]=a;
			}
			
			if(a<b) {
				T[i+2][j]=a+10-b;
				emp=1;
				T[i-2][j]=10;
			}
			else {
				T[i+2][j]=a-b;
				emp=0;
					}
				
			
		}		

	}
	
	 
	


	
}
