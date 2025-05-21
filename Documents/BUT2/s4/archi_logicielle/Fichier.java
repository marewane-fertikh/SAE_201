import java.io.*;	// importe tout ce qui est dans la bibliothèque io
import java.util.*;	// utile pour ArrayList (aussi Map, HashMap etc)
public class Fichier {
	
	public void lire() {	// énoncé : pas d'argument, ne retourne rien
	
		try {
			InputStream inStream = new FileInputStream("donnees.txt"); // ouvrir le fichier de données
			InputStreamReader streamReader = new InputStreamReader(inStream); 
			BufferedReader reader = new BufferedReader(streamReader);	// lit ligne par ligne  
			
			String ligne;	// initialise la chaine de caractère ligne
			while ((ligne = reader.readLine()) != null) {	// tant que ligne (suivante) n'est pas nulle ..
				System.out.println("[" + ligne + "]");	// afficher ..
			}
			
			reader.close(); // toujours fermer le fichier
		} catch (IOException e) {	// je ne sais pas 
			System.out.println("Erreur : " + e.getMessage());	// affiche Erreur : je ne sais pas
		}
	}
	
	public void ecrire() {
	
		try {
			OutputStream os = new FileOutputStream("donnees.txt", true); // le true signifie "append"
			OutputStreamWriter output = new OutputStreamWriter(os);
			
			String data[] = {
						"boule, bill",
						"donald, picsou",
						"homere, bugs bunny"
					};
			for (String ligne : data) {
				output.write(ligne + "\n");
			}
			
			output.close();
		} catch (IOException e) {
			System.out.println("Erreur : " + e.getMessage());
		}
	}	
	
	public String lireFichier(){
		
	
}
