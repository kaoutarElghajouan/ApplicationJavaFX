package application;

public class GestErreurs {
	
	

	public String[] GstErreur(int T[][],int Resultats[] ) {
		
		 String[] R=new String [2];
		 
		 R[0]=". Essaie de faire attention pour tes prochaines operations aux poinx suivants. \n";
		 
		 Diagnostique D=new Diagnostique();
		 
		//erreur1
			if( T[0][2]==10 && T[2][1]==1 && Resultats[1]==0 ) { 
				R[0]+=" \n Colonne 2 : \n "+"\n vous avez un probleme de soustraction 0-N,"
								      + " vous n'arrivez pas a emprenter la deuxieme fois. ";
				
				R[1]= D.diagnostiques(1);
			}
			//erreur2
			else if(T[0][2]==10 && T[2][1]==1 && Resultats[1]==T[3][1] && T[3][1]!=1) {
				R[0]+= " \n Colonne 2 : \n "+"\n vous n'empruntez pas ; "
					      + " vous �crivez le chiffre du bas comme r�ponse � cette colonne. ";;
				R[1]= D.diagnostiques(2);
				
			}
			//erreur3
			else if(T[0][2]==10 && T[2][1]==1 && T[3][1]==1 && Resultats[1]==1) {
				R[0]+=" \n Colonne 2 : \n "+"\n  ce colonne comprend des 1 en haut comme en bas; "
					      + " vous �crivez le chiffre 1 comme r�ponse � cette colonne.";
				
				R[1]= D.diagnostiques(3);
					
				
			}
			 // Erreur 4
			else if(T[0][2]==10 && T[2][1]==1 && Resultats[1]==9-T[3][1]) { 
				R[0]=" \n Colonne 2 : \n "+"\n vous considere emprunt 1 comme 10 et vous le d�cr�mente � 9 \n";
				R[1]=D.diagnostiques(4);
					     
			}
			 // Erreur 5
			else if(T[0][2]==10 && T[2][1]==1 && Resultats[1]==10-T[3][1]) { 
				R[0]+=" \n Colonne 2 : \n "+"\n Quand vous emprunte d�un 1,vous le change en 10 au lieu de 0\n"; 
				
				R[1]=D.diagnostiques(5);
					     
			}
			 // Erreur 6
			else if(T[2][2]==1 && Resultats[0]==10-T[3][2]) { 
				R[0]+=" \n Colonne 1 : \n "+"\n Quand vous emprunte d�un 1, vous avez le change en 10 au lieu de lui ajouter \r\n"
						+ "10 .\n";
				R[1]= D.diagnostiques(6);
					     
			}
			 // Erreur 7
			else if(T[0][2]==10 && T[2][1]==1 && Resultats[1]==9-T[3][1] && Resultats[2]==T[4][0]) { 
				R[0]+=" \n Colonne 2 : \n "+"\n vous considere emprunt 1 comme 0 et vous le changer en 9 et d�cr�mente le nombre � sa gauche \n";
				R[1]= D.diagnostiques(7);
					     
			}
			 // Erreur 8
			else if(T[0][2]==10 && T[2][1]==1 && Resultats[1]==11-T[3][1]) { 
				R[0]+=" \n colonne 2 : \n"+"\n Au lieu de d�cr�menter le 1 de l'emprunt ,vous avez le change en un 11 ";
				R[1]= D.diagnostiques(8);
					     
			}
			 // Erreur 9
			else if(T[0][2]==10 && T[2][1]==0 && T[3][1]==0 && Resultats[1]==0 && T[4][0]==Resultats[2]+1) { 
				R[0]+=" \n Colonne 2 : \n "+"\n Quand vous emprunte sur un 0 au-dessus d�un autre 0, vous avez pas change le premier 0, \r\n"
						+ "mais d�cr�mente plut�t la colonne suivante � gauche. \r\n"
						+ " \r\n";
				R[1]=D.diagnostiques(9);
					     
			}
			 // Erreur 10
			else if(T[0][2]==10 && T[2][1]==0 && T[3][1]==0 && Resultats[1]==1 && Resultats[2]-1==T[4][0]) { 
				R[0]+=" \n Colonne 2 : \n "+"\n Quand vous emprunte sur un 0 au-dessus d�un autre 0, vous avez pas change le premier 0, \r\n"
						+ "mais ne d�cr�mente aucune colonne � \r\n"
						+ "gauche. \r\n"
						+ " \r\n";
				R[1]=D.diagnostiques(10);
					     
			}
		    // Erreur 11
			else if(T[0][2]==10 && T[2][1]==0 && T[3][1]==0 && Resultats[1]==0 && Resultats[2]==T[4][0]) { 
				R[0]+=" \n colonne 2 : \n"+"\n Quand vous emprunte sur un 0 qui surmonte un autre 0 ,vous avez saute par-dessus le premier \r\n"
						+ "0 et diminue le chiffre suivant � gauche. ";
				R[1]=D.diagnostiques(11);
					     
			}
		    // Erreur 12
			else if(T[0][2]==10 && T[2][1]==0 && T[3][1]==0 && Resultats[1]==0 && Resultats[2]==T[2][0]-T[3][0]+1) { 
				R[0]+= "\n colonne 2 : \n"+" Quand 10 cr�� est au-dessus d�un 0, vous avez fait une retenue au \r\n"
						+ "lieu d�essayer d��crire 10 dans la r�ponse.";
				R[1]=D.diagnostiques(12);
					     
			}
			// Erreur 13
			else if(T[0][2]==10 && T[2][1]==0 && Resultats[1]==0 && Resultats[2]==T[2][0]-1 && Resultats[2]!=T[4][0]) { 
				R[0]+= "\n colonne 2 : \n"+"Quand vous emprunte sur un 0 surmontant un vide, "
						+ "l�apprenant saute � la colonne suivante pour d�cr�menter";
				R[1]= D.diagnostiques(13);
					     
			}
			// Erreur 14
			else if(T[0][2]==10 && T[2][1]==0 && T[3][1]==0 && Resultats[1]==T[2][0]-1) { 
				R[0]+=" \n Colonne 2 : \n "+"\n vous considere emprunte sur un 0 au-dessus d�un vide,et la colonne o� il y a \r\n"
						+ "ce 0 comme si elle n�existait pas.";
				R[1]= D.diagnostiques(14);
					     
			}
			// Erreur 15
			else if(T[0][2]==0 && T[0][2]==0 &&T[0][1]==10 && T[3][0]==0 &&T[2][0]==Resultats[2]) { 
				R[0]+= " \n Colonne 3 : \n "+"\n vous ne d�cr�mente pas une colonne qui a un chiffre au-dessus d�un vide";
				R[1]= D.diagnostiques(15);
					     
			}
			// Erreur 16(pas diagnostique)
			else if(T[2][0]==1 && T[3][0]==0 && Resultats[2]==0) { 
				R[0]+=" \n Colonne 2 : \n "+"\n vous considere Quand la colonne � l�extr�me gauche comprend un 1 au-dessus d�un vide, \r\n"
						+ "vous ignore la colonne\n";
				R[1]= D.diagnostiques(16);
			}     
			
			 // Erreur 17(pas diagnostique)
			else if(T[3][0]==0 && T[3][1]==0 && Resultats[1]==0 && Resultats[2]==0 && Resultats[0] ==T[4][2] ) { 
				R[0]+= " \n Colonne 2 : \n "+". vous considere Quand le nombre du bas comporte moins de chiffre que celui du haut, vous arr�te \r\n"
						+ " � la colonne o� s�arr�te le nombre du bas.\n";
				R[1]= D.diagnostiques(17);
					     
			}
			/*// Erreur 18(pas diagnostique)
			else if(T[0][2]==10 && T[2][1]==1 && Resultat2==9-T[3][1]) { 
				erreur_diag[0]=err_scri + " \n Colonne 2 : \n "+"\n .vous considere  Quand il y a des vides dans le nombre du bas vous soustrait le chiffre le plus � gauche 
                  du nombre du bas des chiffres du haut des colonnes o� se trouvent ces vide.\n";
				erreur_diag[1]= "Diagnostique18";
					     
			}*/
			 // Erreur 19(pas diagnostique)
			else if(T[3][0]==0 && T[3][1]==0 && Resultats[1]== T[2][1]-1 && Resultats[2]== T[2][0]-1 && Resultats[0] ==T[4][2]) { 
				R[0]+=" \n Colonne 2 : \n "+"\n vous considere Quand il y a des vides dans le nombre du bas, vous soustrait 1 des chiffres du haut \n";
				R[1]= D.diagnostiques(19);
					     
			}
			// Erreur 20(pas diagnostique)
			else if(T[3][0]==0 && T[3][1]==0 && Resultats[1]== T[2][0] && Resultats[0] ==T[4][2]) { 
				R[0]+= " \n Colonne 2 : \n "+"\n  vous ignore toute colonne de la forme 0 sur un vide.  \n";
				R[1]= D.diagnostiques(20);
					     
			}
		    // Erreur 21(diagnostique)
			else if(T[3][1]==0 &&  Resultats[0]==T[2][1]-T[3][2]) { 
				R[0]+=" \n Colonne 1 : \n "+"\n . vous aligne les colonnes de gauche � droite au lieu de \r\n"
						+ "droite � gauche. \n";
				R[1]= D.diagnostiques(21);
					     
			}
			// Erreur 22(diagnostique)
			else if(T[0][2]==10 && Resultats[1]==T[2][1]-T[3][1] && T[2][1]>T[3][1] && Resultats[2]==T[4][0]-1) { 
				R[0]+="\n colonne 2 : \n"+"Vous emprunte toujours de la colonne � l�extr�me gauche "
						+ "plut�t que de celle imm�diatement � gauche.";
				R[1]= D.diagnostiques(22);
					     
			}
			// Erreur 23(diagnostique)
			else if(T[0][2]==10 && T[2][2]<T[3][2] && Resultats[0]==0 && Resultats[1]==T[2][1]-T[3][1]-(T[3][2]-T[2][2])) { 
				R[0]+=" \n Colonne 1 : \n "+"\n . vous emprunte la diff�rence entre le chiffre du haut et celui du bas de la colonne o� \r\n"
						+ "il op�re. , vous emprunte juste assez pour faire la soustraction dans cette \r\n"
						+ "colonne o� il obtient toujours un 0.\n";
				R[1]= D.diagnostiques(23);
					     
			}
			 // Erreur 24(diagnostique)
			else if(T[0][2]==0 && Resultats[0]==T[4][2] && Resultats[1]==0 && Resultats[2]==0) { 
				R[0]+=" \n Colonne 2 : \n "+"\n . vous arr�te l�exercice d�s qu�un emprunt est requis \n";
				R[1]= D.diagnostiques(24);
					     
			}
			// Erreur 25(diagnostique)
			else if(T[0][2]==0 && T[0][1]==10 && Resultats[0]==T[4][2] && Resultats[1]==T[2][0]-T[2][1]&& Resultats[2]==0) { 
				R[0]+=" \n Colonne 2 : \n "+"\n  vous consid�re Quand un emprunt est requis, vous  saute simplement par-dessus la colonne et vas � la \r\n"
						+ "colonne suivante. \n";
				R[1]= D.diagnostiques(25);
					     
			}
			// Erreur 26(diagnostique)
			else if(T[0][2]==10 && Resultats[1]==T[1][1]-T[3][1] && Resultats[0]==T[3][2]-T[2][2]) { 
				R[0]+=" \n Colonne 1 : \n "+"\n Quand vous emprunte, vous d�cr�mente correctement, puis, colonne par colonne, vous\r\n"
						+ "soustrait le plus petit chiffre du plus grand comme vous n�avait pas emprunt�. \n";
				R[1]= D.diagnostiques(26);
					     
			}
			 // Erreur 27(diagnostique)
			else if(T[0][2]==10 && Resultats[0]==0 && T[1][1]-T[3][1]==Resultats[1]) { 
				R[0]+=" \n Colonne 1 : \n "+"\n Quand une colonne demande un emprunt, vous d�cr�mente correctement, mais vous �crivez 0 \r\n"
						+ "comme r�ponse. \n";
				R[1]= D.diagnostiques(27);
					     
			}
			 // Erreur 28(diagnostique)
			else if(T[0][2]==10 && T[2][1]==T[3][1] && Resultats[1]==0 && T[1][0]-T[3][0]==T[4][0]) { 
				R[0]+="\n colonne 2 : \n"+"Quand vous emprunte, Vous avez saute les colonnes "
						+ "dans lesquelles le nombre du haut et du bas sont �gaux.";
				R[1]= D.diagnostiques(28);
					     
			}
			// Erreur 29(pas traiter)
			else if(T[2][2]!=0 && T[3][2]==0 && Resultats[0]==0 && T[2][1]-T[3][1]==Resultats[1]) { 
				R[0]+=" \n Colonne 1 : \n "+"\n  vous pensez que N � 0 = 0 \n";
				R[1]= D.diagnostiques(29);
					     
			}
			// Erreur 30(pas traiter)
			else if(T[2][2]==T[3][2] && Resultats[1]==T[4][1]-1 && T[0][2]==0 && Resultats[0]==9) { 
				R[0]+=" \n Colonne 1 : \n "+"\n  vous consid�re Quand une colonne est de la forme N-N, vous �crit 9 comme r�ponse et d�cr�mente la \r\n"
						+ "colonne suivante � gauche bien que l�emprunt ne soit pas n�cessaire . \n";
				R[1]= D.diagnostiques(30);
					     
			}
		 			//Erreur 35
		 			if(T[2][2]==T[2][1] &&  T[2][2]==0 && Resultats[1]==9-T[3][1]) {
		 				R[0]+="\n colonne 1 : \n"+"Quand vous emprunte sur un 0 et que cet emprunt est caus� par un autre 0, vous avez change \r\n"
		 						+ "le z�ro de droite en 9 au lieu de le changer en 10.";
		 				
		 				R[1]=D.diagnostiques(35) ;
		 			}
		 			// Erreur 39
		 			
		 			if(T[0][2]==10 && Resultats[0]==T[2][2]-T[3][2]+9) {
		 				R[0]+="\n colonne 1 : \n"+"La premi�re colonne qui demande un emprunt est "
		 						+ "d�cr�ment�e avant de soustraire.";
		 				R[1]=D.diagnostiques(39) ;
		 			}
		 			//Erreur 43
		 			if(T[2][2]==T[2][1] &&  T[2][2]==0 && Resultats[1]==10-T[3][1] ) {
		 				R[0]+="\n colonne 2 : \n"+". Quand il doit emprunter sur un 0 et que cet emprunt est caus� par un autre 0,"
		 						+ "vous avez change le 0 duquel il emprunte en un 10 au lieu d�un 9.";
		 				
		 				R[1]=D.diagnostiques(43) ;
		 			}
		 			
		 			
		
		return R;
		
		
	}
}