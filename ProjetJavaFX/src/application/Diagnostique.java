package application;
public class Diagnostique {

	public String  diagnostiques(int n) {
		
		String diagnostique="";
		switch(n) {
		case 1: 
			diagnostique+="- Vous avez utilisé une erreur de « ne pas soustraire de 0 », vous considèrez que c’est \n une soustraction d’un nombre du rien.\r \n \n"
					+ "- Vous ne connaissez pas l’empreinte dans le cas de 0 en haut, "
					+ "  et vous avez écrit 0 comme \n  résultat.\r\n \n"
					+ "- Vous ne savez pas quand le nombre haut est inferieur du nombre bas. il faut emprunter 10 et de \n l’ajouter  au 0, puis décrémente 1 du nombre  haut suivant. \r\n"
					+ "";
		break;
		
		case 2: 
			diagnostique+="- Vous avez utilisé une erreur de « ne pas soustraire de 0 », vous considère que \n c’est une soustraction d’un nombre du rien.\r\n"
					+ "- Vous ne connaissez pas l’empreinte dans le cas de 0 en haut et vous avez écrit le nombre bas  \n  comme résultat.\r\n"
					+ "- Vous ne savez pas quand le nombre haut est inferieur du nombre bas.il faut emprunter 10 et de \n l’ajouter au 0, puis décrémente 1 du nombre haut suivant. \r\n"
					+ "";
			break;
			
		case 3: 
			diagnostique+="- Vous avez utilisé une erreur de « de ne pas soustraire du grand nombre du petit nombre ».\r\n"
					+ "\r\n"
					+ "- Vous considère qu’après la décrémentation de 1 de l’emprunt, vous devez soustraire le nombre \n bas de 0 et pas l’inverse. \r\n"
					+ "\r\n"
					+ "- Vous ne respectez pas les dispositions des chiffres de la colonne.\r\n"
					+ "";
			break;
			
		case 4: 
			diagnostique+="- Vous avez un problème de considération des nombres après l’empreinte.\r\n"
					+ "- Quand vous emprunte d’un 1, vous le considère comme s’il était 10 et le décrémente à 9. \r\n"
					+ "- Vous ne savez pas quand le nombre haut est inferieur du nombre bas.il faut emprunter 10 et de \n l’ajouter au nombre haut, puis décrémente 1 du nombre haut suivant. \r\n"
					+ "";
			break;
			
		case 5: 
			diagnostique+="- Vous avez un problème d’empreinte, quand vous empruntez la première fois d’un 1, vous \n le change en 10 au lieu de 0.\r\n"
					+ "- Vous ne savez pas qui il faut emprunter 10 et de l’ajouter au nombre haut, puis décrémente 1 \n de nombre haut suivant. \r\n"
					+ "";
			break;
			
		case 6: 
			diagnostique+="- Vous avez un problème d’empreinte, quand un emprunt est causé par un 1, vous avez le change \n en 10 au lieu de lui ajouter 10.\r\n"
					+ "- Vous ne savez pas quand le nombre haut est inferieur du nombre bas.il faut emprunter 10 et de \n l’ajouter au 1, puis décrémente 1 du nombre haut suivant. \r\n"
					+ "";
			break;
			
		case 7: 
			diagnostique+="- Vous avez un problème d’empreinte, quand un emprunt est causé par un 1, vous avez le change en \n 10 au lieu de changer en  9.\r\n"
					+ "Vous ne savez pas quand le nombre haut est inferieur du nombre bas.il faut emprunter 10 et de l’ajouter \n au 0, puis décrémente 1 du nombre haut suivant. \r\n"
					+ "";
			break;
			
		case 8 :
			diagnostique+="- Vous avez un problème de décrémentation après l’empreinte, existence de 1 dans le nombre haut \n suivant vous avez perturbe \r\n"
					+ "car vous faite une concaténation de 1 d’emprunt \n et 1 de la colonne haut,\r\n"
					+ " Au lieu de soustraire les deux. ";
			break;
			
		case 9 :
			diagnostique+= "- Vous avez un problème d’empreinte, quand un emprunt est causé par un 0, vous avez le change \n en -1 au lieu de lui ajouter 0.\r\n"
					+ "- Vous ne savez pas quand le nombre haut est inferieur du nombre bas aprés l'ajout de -1.il faut  \n emprunter 10 et de l’ajouter au -1, puis décrémente 1 du nombre haut suivant. \r\n"
					+ "";
			break;
			
		case 10 :
				diagnostique+= "- Vous avez un problème d’empreinte, quand un emprunt est causé par un 0, vous avez le change \n en -1 au lieu de lui ajouter 0.\r\n"
						+ "- Vous ne savez pas quand le nombre haut est inferieur du nombre bas aprés l'ajout de -1.il faut \n emprunter 10 et de l’ajouter au -1, puis décrémente 1 du nombre haut suivant. \r\n"
						+ "";
				break;
				
		case 11 :
				diagnostique+="- Vous avez un problème d’empreinte, vous perturbe quand vous êtes entré en collision avec \n les deux 0  et vous n’arrive pas d’empruntez de 0 haut. Vous donnez 0 comme résultat a cette colonne. \r\n"
						+ "- Vous ne savez pas qu’il faut traitez 0 comme n’importe quel nombre, et de  \n l’emprunter même  s’il est   dupliqué dans colonne bas. Il faut juste faire juste attention \n quand vous emprunter la deuxième fois.\r\n"
						+ "- Ainsi, On ne peut pas saute pour décrémenter d’une autre colonne.\r\n"
						+ "";
				break;
				
			case 12 :
				diagnostique+="- Vous avez un problème d’empreinte, vous perturbe quand vous êtes entré en collision avec \n les deux 0 et vous n’arrive pas d’empruntez de 0 haut. Vous faite une retenue au lieu d’essayer d’écrire 10 dans la réponse.\r\n"
						+ "- Vous ne savez pas qu’il faut traitez 0 comme n’importe quel nombre, et de \n l’emprunter même s’il est dupliqué dans colonne bas. Il faut juste faire juste attention quand \n vous emprunter la deuxième fois.\r\n"
						+ "- Ainsi, On ne peut pas saute à une autre colonne pour faire retenue, dans le \n cas d’emprunt, on doit toujours décrémenter de la colonne suivante \r\n"
						+ "";
				break;
				
			case 13 :
				diagnostique+="- Vous avez un problème quand vous emprunter d’un vide,\n vous saute à la colonne suivante pour décrémenter.\r\n"
						+ "- Vous ne savez pas qu’il faut considère le vide comme un 0, vous pouvez \n l’écrire pour éviter ce type de perturbation.\r\n"
						+ "";
				break ;
				
			case 14 :
				
				diagnostique+="- Vous avez un problème quand vous emprunter d’un vide, vous saute à \n la colonne suivante pour décrémenter.\r\n"
				      + "- Vous ne savez pas qu’il faut considère le vide comme un 0, vous \n  pouvez l’écrire pour éviter ce type de perturbation.\r\n"
				      + "";
				 break;
			case 15 :
				diagnostique+="- Vous avez un problème quand vous emprunter d’un vide"
					+ "- Vous ne savez pas qu’il faut considère le vide comme un 0, vous pouvez \n l’écrire pour éviter ce type de perturbation.\r\n"
					+ "";
				
				break;
				
			case 16 :
				diagnostique+="- Vous avez ignoré le 1 quand vous avez trouvé le vide en bas.\r\n"
						+ "- Vous ne savez pas qu’il faut considère le vide comme un 0, vous pouvez \n l’écrire pour éviter ce type de perturbation.\r\n"
						+ "";
				 break;
				 
			case 17 :
				diagnostique+="- Vous avez un problème quand vous emprunter d’un vide, vous arrête \n l’exercice à la colonne où s’arrête le nombre du bas.\r\n"
						+ "- Vous ne savez pas qu’il faut considère le vide comme un 0, vous pouvez \n l’écrire pour éviter ce type de perturbation.\r\n"
						+ "";
				break ;
				
			case 18 :
				break;
				
			case 19:
				diagnostique+="- Vous avez un problème quand vous emprunter d’un vide, soustrait 1 \n des chiffres du haut.\r\n"
						+ "- Vous ne savez pas qu’il faut considère le vide comme un 0,\n vous pouvez l’écrire pour éviter ce type de perturbation.\r\n"
						+ "";
				break;
			case 20 :
				diagnostique+="- Vous avez un problème quand vous emprunter d’un 0, ignore toute colonne \n de la forme 0 sur un vide.\r\n"
						+ "- Vous ne savez pas qu’il faut traitez 0 comme n’importe quel nombre,\n et de l’emprunter. \r\n"
						+ "";
				break;
			case 21 :
				diagnostique+="- Vous avez un problème d’alignement quand vous écrit l’exercice, vous alignez \n les colonnes de gauche à droite au lieu de droite à gauche.\r\n"
						+ "- Faite attention la deuxième fois, il faut toujours prendre en considération \n l’emplacements des colonnes.\r\n"
						+ "";
				break;
				
			case 22:
				diagnostique+="- Vous avez un problème de décrémentation après l’empreinte, vous emprunte \n de la colonne à l’extrême gauche plutôt que de celle immédiatement à gauche.\r\n"
						+ "- Faite attention quand vous voulez emprunter, on ne peut pas saute \n sur la colonne correspondante pour décrémenter de l’autre, parce que le résultat change \n et il ne reste pas le même.\r\n"
						+ "";
				break;
				
			case 23 :
				diagnostique+="- Vous avez un problème dans le concept d’emprunte, Vous emprunte la différence \n entre le chiffre du haut et celui du bas de la colonne où vous opère. En d’autres mots, vous emprunte juste assez pour faire la soustraction dans cette colonne où il obtient toujours un 0.\r\n"
						+ "- Vous ne savez pas quand le nombre haut est inferieur du nombre bas.\n il faut emprunter 10 et de l’ajouter au nombre du colonne haut, puis décrémente 1 \n du nombre haut suivant. \r\n"
						+ "";
				break;
			case 24 :
				diagnostique+="- Vous avez un problème d’empreinte, vous perturbez quand vous êtes entré en collisions \n avec nombre haut inferieure à celui de bas, donc vous arrête l’exercice dès \n qu’un emprunt est requis.\r\n"
						+ "- Vous ne savez pas quand le nombre haut est inferieur du nombre bas.il faut \n emprunter 10 et de l’ajouter au nombre du colonne haut, puis décrémente \n 1 du nombre haut suivant. \r\n"
						+ "";
				break;
			case 25 :
				diagnostique+="Vous avez un problème d’empreinte, Quand un emprunt est requis, vous saute par-dessus \n la colonne et va à la colonne suivante.\r\n"
						+ "Vous ne savez pas quand le nombre haut est inferieur du nombre bas.il faut emprunter 10 et \n de l’ajouter au nombre du colonne haut, puis décrémente 1 du nombre haut suivant. \r\n"
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
				diagnostique+="- Vous avez un problème d’empreinte, Quand une colonne demande un emprunt, vous \n décrémente correctement, mais écrit 0 comme réponse.\r\n"
						+ "- Vous ne savez pas quand le nombre haut est inferieur du nombre bas.il faut \n  emprunter 10 et de l’ajouter au nombre du colonne haut, puis décrémente 1 du nombre haut suivant. \r\n"
						+ "";
				break;
		     
				
			case 28 :
				diagnostique+="- Vous avez un problème de décrémentation après l’empreinte, l’apprenant \n saute les colonnes dans lesquelles le nombre du haut et du bas sont égaux.\r\n"
						+ "- Vous perturbe quand vous êtes entré en collision avec les deux nombres \n dupliques dans la même colonne et vous n’arrive pas de soustraire l’un de l’autre.\n - Vous passe à la deuxième colonne pour décrémenter.\r\n"
						+ "- Vous ne savez pas qu’il faut traitez les nombres égaux dans la colonne \n de même façon d’empreinte et décrémentation.\r\n"
						+ "";
				break ;
				
			case 29 :
				diagnostique+="- Vous avez un problème d’empreinte, vous pense que N – 0 = 0.\r\n"
						+ "- Vous ne savez pas qu’il faut traitez 0 comme n’importe quel nombre, et de \n  faire soustraction entre nombre N de lui, cad N-0=N.\r\n"
						+ "";
				break;
				
			case 30 :
				diagnostique+="- Vous avez un problème d’empreinte, Quand une colonne est de la forme N-N,"
						+ "\n vous écrit 9 comme réponse et décrémente la colonne suivante \n"
						+ " à gauche bien que l’emprunt ne soit pas nécessaire";
				break;
			
			case 35 :
				diagnostique+="- Vous avez un problème dans le concept d’emprunte, quand vous vous rencontre \n 0 deux fois dans les colonnes hautes, vous change le zéro de droite en 9 au lieu de \n  le changer en 10.\r\n"
						+ "- Vous ne savez pas qu’il faut traitez 0 comme n’importe quel nombre, et de \n l’emprunter même s’il est dupliqué dans colonne haut suivante. Il faut juste faire juste \n  attention quand vous emprunter la deuxième fois.\r\n"
						+ "";
		         break;
		         
			case 39 :
				diagnostique+="Vous avez un problème dans le concept d’emprunte, vous avez intégré les \n deux opérations : l’emprunte et décrémentation dans s’une seule colonne.\r\n"
						+ "Vous ne savez pas quand le nombre haut est inferieur du nombre bas.il \n faut emprunter 10 et de l’ajouter au nombre du colonne haut, puis décrémente 1 \n  du nombre haut suivant. \r\n"
						+ "";
				break;
				
			case 43:
				diagnostique+="Vous avez un problème de décrémentation après l’empreinte, Vous perturbe \n quand vous êtes entré en collision avec deux 0 en hauts, vous change \n  le deuxième 0 duquel il emprunte en un 10 au lieu d’un 9.\r\n"
						+ "Vous ne savez pas qu’il faut traitez 0 comme n’importe quel nombre,\n et de l’emprunter même s’il est dupliqué dans deuxième colonne haut.\r\n"
						+ "Faite attention quand vous emprunter deuxième fois, on respecte \n toujours la règle de décrémentation sur colonne correspondante.\r\n"
						+ "";
				break;
				
		
		}
		 return diagnostique;
		
		
	}
	
}