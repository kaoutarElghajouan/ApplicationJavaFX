package application;
public class Diagnostique {

	public String  diagnostiques(int n) {
		
		String diagnostique="";
		switch(n) {
		case 1: 
			diagnostique+="- Vous avez utilis� une erreur de � ne pas soustraire de 0 �, vous consid�rez que c�est \n une soustraction d�un nombre du rien.\r \n \n"
					+ "- Vous ne connaissez pas l�empreinte dans le cas de 0 en haut, "
					+ "  et vous avez �crit 0 comme \n  r�sultat.\r\n \n"
					+ "- Vous ne savez pas quand le nombre haut est inferieur du nombre bas. il faut emprunter 10 et de \n l�ajouter  au 0, puis d�cr�mente 1 du nombre  haut suivant. \r\n"
					+ "";
		break;
		
		case 2: 
			diagnostique+="- Vous avez utilis� une erreur de � ne pas soustraire de 0 �, vous consid�re que \n c�est une soustraction d�un nombre du rien.\r\n"
					+ "- Vous ne connaissez pas l�empreinte dans le cas de 0 en haut et vous avez �crit le nombre bas  \n  comme r�sultat.\r\n"
					+ "- Vous ne savez pas quand le nombre haut est inferieur du nombre bas.il faut emprunter 10 et de \n l�ajouter au 0, puis d�cr�mente 1 du nombre haut suivant. \r\n"
					+ "";
			break;
			
		case 3: 
			diagnostique+="- Vous avez utilis� une erreur de � de ne pas soustraire du grand nombre du petit nombre �.\r\n"
					+ "\r\n"
					+ "- Vous consid�re qu�apr�s la d�cr�mentation de 1 de l�emprunt, vous devez soustraire le nombre \n bas de 0 et pas l�inverse. \r\n"
					+ "\r\n"
					+ "- Vous ne respectez pas les dispositions des chiffres de la colonne.\r\n"
					+ "";
			break;
			
		case 4: 
			diagnostique+="- Vous avez un probl�me de consid�ration des nombres apr�s l�empreinte.\r\n"
					+ "- Quand vous emprunte d�un 1, vous le consid�re comme s�il �tait 10 et le d�cr�mente � 9. \r\n"
					+ "- Vous ne savez pas quand le nombre haut est inferieur du nombre bas.il faut emprunter 10 et de \n l�ajouter au nombre haut, puis d�cr�mente 1 du nombre haut suivant. \r\n"
					+ "";
			break;
			
		case 5: 
			diagnostique+="- Vous avez un probl�me d�empreinte, quand vous empruntez la premi�re fois d�un 1, vous \n le change en 10 au lieu de 0.\r\n"
					+ "- Vous ne savez pas qui il faut emprunter 10 et de l�ajouter au nombre haut, puis d�cr�mente 1 \n de nombre haut suivant. \r\n"
					+ "";
			break;
			
		case 6: 
			diagnostique+="- Vous avez un probl�me d�empreinte, quand un emprunt est caus� par un 1, vous avez le change \n en 10 au lieu de lui ajouter 10.\r\n"
					+ "- Vous ne savez pas quand le nombre haut est inferieur du nombre bas.il faut emprunter 10 et de \n l�ajouter au 1, puis d�cr�mente 1 du nombre haut suivant. \r\n"
					+ "";
			break;
			
		case 7: 
			diagnostique+="- Vous avez un probl�me d�empreinte, quand un emprunt est caus� par un 1, vous avez le change en \n 10 au lieu de changer en  9.\r\n"
					+ "Vous ne savez pas quand le nombre haut est inferieur du nombre bas.il faut emprunter 10 et de l�ajouter \n au 0, puis d�cr�mente 1 du nombre haut suivant. \r\n"
					+ "";
			break;
			
		case 8 :
			diagnostique+="- Vous avez un probl�me de d�cr�mentation apr�s l�empreinte, existence de 1 dans le nombre haut \n suivant vous avez perturbe \r\n"
					+ "car vous faite une concat�nation de 1 d�emprunt \n et 1 de la colonne haut,\r\n"
					+ " Au lieu de soustraire les deux. ";
			break;
			
		case 9 :
			diagnostique+= "- Vous avez un probl�me d�empreinte, quand un emprunt est caus� par un 0, vous avez le change \n en -1 au lieu de lui ajouter 0.\r\n"
					+ "- Vous ne savez pas quand le nombre haut est inferieur du nombre bas apr�s l'ajout de -1.il faut  \n emprunter 10 et de l�ajouter au -1, puis d�cr�mente 1 du nombre haut suivant. \r\n"
					+ "";
			break;
			
		case 10 :
				diagnostique+= "- Vous avez un probl�me d�empreinte, quand un emprunt est caus� par un 0, vous avez le change \n en -1 au lieu de lui ajouter 0.\r\n"
						+ "- Vous ne savez pas quand le nombre haut est inferieur du nombre bas apr�s l'ajout de -1.il faut \n emprunter 10 et de l�ajouter au -1, puis d�cr�mente 1 du nombre haut suivant. \r\n"
						+ "";
				break;
				
		case 11 :
				diagnostique+="- Vous avez un probl�me d�empreinte, vous perturbe quand vous �tes entr� en collision avec \n les deux 0  et vous n�arrive pas d�empruntez de 0 haut. Vous donnez 0 comme r�sultat a cette colonne. \r\n"
						+ "- Vous ne savez pas qu�il faut traitez 0 comme n�importe quel nombre, et de  \n l�emprunter m�me  s�il est   dupliqu� dans colonne bas. Il faut juste faire juste attention \n quand vous emprunter la deuxi�me fois.\r\n"
						+ "- Ainsi, On ne peut pas saute pour d�cr�menter d�une autre colonne.\r\n"
						+ "";
				break;
				
			case 12 :
				diagnostique+="- Vous avez un probl�me d�empreinte, vous perturbe quand vous �tes entr� en collision avec \n les deux 0 et vous n�arrive pas d�empruntez de 0 haut. Vous faite une retenue au lieu d�essayer d��crire 10 dans la r�ponse.\r\n"
						+ "- Vous ne savez pas qu�il faut traitez 0 comme n�importe quel nombre, et de \n l�emprunter m�me s�il est dupliqu� dans colonne bas. Il faut juste faire juste attention quand \n vous emprunter la deuxi�me fois.\r\n"
						+ "- Ainsi, On ne peut pas saute � une autre colonne pour faire retenue, dans le \n cas d�emprunt, on doit toujours d�cr�menter de la colonne suivante \r\n"
						+ "";
				break;
				
			case 13 :
				diagnostique+="- Vous avez un probl�me quand vous emprunter d�un vide,\n vous saute � la colonne suivante pour d�cr�menter.\r\n"
						+ "- Vous ne savez pas qu�il faut consid�re le vide comme un 0, vous pouvez \n l��crire pour �viter ce type de perturbation.\r\n"
						+ "";
				break ;
				
			case 14 :
				
				diagnostique+="- Vous avez un probl�me quand vous emprunter d�un vide, vous saute � \n la colonne suivante pour d�cr�menter.\r\n"
				      + "- Vous ne savez pas qu�il faut consid�re le vide comme un 0, vous \n  pouvez l��crire pour �viter ce type de perturbation.\r\n"
				      + "";
				 break;
			case 15 :
				diagnostique+="- Vous avez un probl�me quand vous emprunter d�un vide"
					+ "- Vous ne savez pas qu�il faut consid�re le vide comme un 0, vous pouvez \n l��crire pour �viter ce type de perturbation.\r\n"
					+ "";
				
				break;
				
			case 16 :
				diagnostique+="- Vous avez ignor� le 1 quand vous avez trouv� le vide en bas.\r\n"
						+ "- Vous ne savez pas qu�il faut consid�re le vide comme un 0, vous pouvez \n l��crire pour �viter ce type de perturbation.\r\n"
						+ "";
				 break;
				 
			case 17 :
				diagnostique+="- Vous avez un probl�me quand vous emprunter d�un vide, vous arr�te \n l�exercice � la colonne o� s�arr�te le nombre du bas.\r\n"
						+ "- Vous ne savez pas qu�il faut consid�re le vide comme un 0, vous pouvez \n l��crire pour �viter ce type de perturbation.\r\n"
						+ "";
				break ;
				
			case 18 :
				break;
				
			case 19:
				diagnostique+="- Vous avez un probl�me quand vous emprunter d�un vide, soustrait 1 \n des chiffres du haut.\r\n"
						+ "- Vous ne savez pas qu�il faut consid�re le vide comme un 0,\n vous pouvez l��crire pour �viter ce type de perturbation.\r\n"
						+ "";
				break;
			case 20 :
				diagnostique+="- Vous avez un probl�me quand vous emprunter d�un 0, ignore toute colonne \n de la forme 0 sur un vide.\r\n"
						+ "- Vous ne savez pas qu�il faut traitez 0 comme n�importe quel nombre,\n et de l�emprunter. \r\n"
						+ "";
				break;
			case 21 :
				diagnostique+="- Vous avez un probl�me d�alignement quand vous �crit l�exercice, vous alignez \n les colonnes de gauche � droite au lieu de droite � gauche.\r\n"
						+ "- Faite attention la deuxi�me fois, il faut toujours prendre en consid�ration \n l�emplacements des colonnes.\r\n"
						+ "";
				break;
				
			case 22:
				diagnostique+="- Vous avez un probl�me de d�cr�mentation apr�s l�empreinte, vous emprunte \n de la colonne � l�extr�me gauche plut�t que de celle imm�diatement � gauche.\r\n"
						+ "- Faite attention quand vous voulez emprunter, on ne peut pas saute \n sur la colonne correspondante pour d�cr�menter de l�autre, parce que le r�sultat change \n et il ne reste pas le m�me.\r\n"
						+ "";
				break;
				
			case 23 :
				diagnostique+="- Vous avez un probl�me dans le concept d�emprunte, Vous emprunte la diff�rence \n entre le chiffre du haut et celui du bas de la colonne o� vous op�re. En d�autres mots, vous emprunte juste assez pour faire la soustraction dans cette colonne o� il obtient toujours un 0.\r\n"
						+ "- Vous ne savez pas quand le nombre haut est inferieur du nombre bas.\n il faut emprunter 10 et de l�ajouter au nombre du colonne haut, puis d�cr�mente 1 \n du nombre haut suivant. \r\n"
						+ "";
				break;
			case 24 :
				diagnostique+="- Vous avez un probl�me d�empreinte, vous perturbez quand vous �tes entr� en collisions \n avec nombre haut inferieure � celui de bas, donc vous arr�te l�exercice d�s \n qu�un emprunt est requis.\r\n"
						+ "- Vous ne savez pas quand le nombre haut est inferieur du nombre bas.il faut \n emprunter 10 et de l�ajouter au nombre du colonne haut, puis d�cr�mente \n 1 du nombre haut suivant. \r\n"
						+ "";
				break;
			case 25 :
				diagnostique+="Vous avez un probl�me d�empreinte, Quand un emprunt est requis, vous saute par-dessus \n la colonne et va � la colonne suivante.\r\n"
						+ "Vous ne savez pas quand le nombre haut est inferieur du nombre bas.il faut emprunter 10 et \n de l�ajouter au nombre du colonne haut, puis d�cr�mente 1 du nombre haut suivant. \r\n"
						+ "";
				break;
			case 26 :
				diagnostique+="- vous avez generalise une conception correcte dans certains cas particulliers,\n"
						+ "mais qui ne supporte pas le moindre de changement situation. vous avez \n"
						+ " applique ici une regle qui dit: ne pas soustraire le grand nombre du petit \n nombre"
						+ " - Vous ne connaisez pas la signification de la disposition algorithme. "
						+ " Vous ne respectez pas les dispositions des chiffres de la colonne traitee.\n"
						+ "- vous nous voyez pas le nombre comme un tout,vous le tarite sans aucune \n"
						+ "prise en consideration des certaines,dizaines et unites";
				break;
			case 27 :
				diagnostique+="- Vous avez un probl�me d�empreinte, Quand une colonne demande un emprunt, vous \n d�cr�mente correctement, mais �crit 0 comme r�ponse.\r\n"
						+ "- Vous ne savez pas quand le nombre haut est inferieur du nombre bas.il faut \n  emprunter 10 et de l�ajouter au nombre du colonne haut, puis d�cr�mente 1 du nombre haut suivant. \r\n"
						+ "";
				break;
		     
				
			case 28 :
				diagnostique+="- Vous avez un probl�me de d�cr�mentation apr�s l�empreinte, l�apprenant \n saute les colonnes dans lesquelles le nombre du haut et du bas sont �gaux.\r\n"
						+ "- Vous perturbe quand vous �tes entr� en collision avec les deux nombres \n dupliques dans la m�me colonne et vous n�arrive pas de soustraire l�un de l�autre.\n - Vous passe � la deuxi�me colonne pour d�cr�menter.\r\n"
						+ "- Vous ne savez pas qu�il faut traitez les nombres �gaux dans la colonne \n de m�me fa�on d�empreinte et d�cr�mentation.\r\n"
						+ "";
				break ;
				
			case 29 :
				diagnostique+="- Vous avez un probl�me d�empreinte, vous pense que N � 0 = 0.\r\n"
						+ "- Vous ne savez pas qu�il faut traitez 0 comme n�importe quel nombre, et de \n  faire soustraction entre nombre N de lui, cad N-0=N.\r\n"
						+ "";
				break;
				
			case 30 :
				diagnostique+="- Vous avez un probl�me d�empreinte, Quand une colonne est de la forme N-N,"
						+ "\n vous �crit 9 comme r�ponse et d�cr�mente la colonne suivante \n"
						+ " � gauche bien que l�emprunt ne soit pas n�cessaire";
				break;
			
			case 35 :
				diagnostique+="- Vous avez un probl�me dans le concept d�emprunte, quand vous vous rencontre \n 0 deux fois dans les colonnes hautes, vous change le z�ro de droite en 9 au lieu de \n  le changer en 10.\r\n"
						+ "- Vous ne savez pas qu�il faut traitez 0 comme n�importe quel nombre, et de \n l�emprunter m�me s�il est dupliqu� dans colonne haut suivante. Il faut juste faire juste \n  attention quand vous emprunter la deuxi�me fois.\r\n"
						+ "";
		         break;
		         
			case 39 :
				diagnostique+="Vous avez un probl�me dans le concept d�emprunte, vous avez int�gr� les \n deux op�rations : l�emprunte et d�cr�mentation dans s�une seule colonne.\r\n"
						+ "Vous ne savez pas quand le nombre haut est inferieur du nombre bas.il \n faut emprunter 10 et de l�ajouter au nombre du colonne haut, puis d�cr�mente 1 \n  du nombre haut suivant. \r\n"
						+ "";
				break;
				
			case 43:
				diagnostique+="Vous avez un probl�me de d�cr�mentation apr�s l�empreinte, Vous perturbe \n quand vous �tes entr� en collision avec deux 0 en hauts, vous change \n  le deuxi�me 0 duquel il emprunte en un 10 au lieu d�un 9.\r\n"
						+ "Vous ne savez pas qu�il faut traitez 0 comme n�importe quel nombre,\n et de l�emprunter m�me s�il est dupliqu� dans deuxi�me colonne haut.\r\n"
						+ "Faite attention quand vous emprunter deuxi�me fois, on respecte \n toujours la r�gle de d�cr�mentation sur colonne correspondante.\r\n"
						+ "";
				break;
				
		
		}
		 return diagnostique;
		
		
	}
	
}