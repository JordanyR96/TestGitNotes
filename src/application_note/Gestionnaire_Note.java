package application_note;
import java.util.ArrayList;
public class Gestionnaire_Note {
    // ArrayList<Note> listeNotes li stoker ansamb note ke ou gen pou antre
    private ArrayList<Note> listeNotes = new ArrayList<Note>();
    
    //Ajoute yon nouvo note avek listeNotes 
    public void ajouterNote(String titre, String contenu) {
        Note nouvelleNote = new Note(titre, contenu);
        listeNotes.add(nouvelleNote);
    }
    
    
    public boolean supprimerNote(int id) {
        for(int i = 0; i < listeNotes.size(); i++){
            if(listeNotes.get(i).getId() == id) {
                listeNotes.remove(i);
                return true;
            }
        }
        return false;
    }
    
    //.size() li presente taille listeNoets la mw itilize set pou modifier et get(i) pou dim numero id a et getId() pou banm position li nan memwa a.
    public boolean modifierNote(int id, String nouvoTitre, String nouvoContenu) {
        for(int i = 0; i < listeNotes.size(); i++){
            if(listeNotes.get(i).getId() == id){
                listeNotes.get(i).setTitre(nouvoTitre);
                listeNotes.get(i).setContenu(nouvoContenu);
                return true;
            }
        }
        return false;
    }
    
    
    //type retou fonction sa se ArrayList<Note> le retounen yon ti liste
    public ArrayList<Note> rechercherNote(String motCle) {
        ArrayList<Note> listeRecherche = new ArrayList<Note>();
        for(int i = 0; i < listeNotes.size(); i++){
            if(listeNotes.get(i).getTitre().contains(motCle) || listeNotes.get(i).getContenu().contains(motCle)){
                listeRecherche.add(listeNotes.get(i));      
            }
        } 
        return listeRecherche;
    }
}
