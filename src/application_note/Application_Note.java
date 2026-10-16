package application_note;
import java.util.ArrayList;
import java.util.Scanner;
public class Application_Note {
      private static Scanner sc = new Scanner(System.in);
      private static Gestionnaire_Note gestionnaireNote = new Gestionnaire_Note();
      
      public static void menuAjouter(){
                    System.out.println("Entrez le titre : ");
                    String titre = sc.nextLine();
                    System.out.println("Entrez le contenu : ");
                    String contenu = sc.nextLine();
                    gestionnaireNote.ajouterNote(titre, contenu);
                    System.out.println("Note ajoute avec succes !");
      }
      
      public static void menuSupprimer(){
                   System.out.println("Entrez l'id de la note à supprimer : ");
                    int idSuppr = sc.nextInt();
                    boolean supprime = gestionnaireNote.supprimerNote(idSuppr);
                    if(supprime){
                        System.out.println("Note supprimée avec succès !");
                    } else {
                        System.out.println("Note introuvable.");
                    }
      }
      
       
      public static void menuModifier(){
                 System.out.println("Entrez l'id de la note à modifier : ");
                    int idModif = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Entrez le nouveau titre : ");
                    String nouvoTitre = sc.nextLine();
                    System.out.println("Entrez le nouveau contenu : ");
                    String nouvoContenu = sc.nextLine();
                    boolean modifie = gestionnaireNote.modifierNote(idModif, nouvoTitre, nouvoContenu);
                    if(modifie){
                        System.out.println("Note modifiée avec succès !");
                    } else {
                        System.out.println("Note introuvable.");
                    }
      }
      
      
      
       public static void menuRechercher(){
                    System.out.println("Entrez un mot-clé à rechercher : ");
                    String motCle = sc.nextLine();
                    ArrayList<Note> resultats = gestionnaireNote.rechercherNote(motCle);
                    if(resultats.isEmpty()){
                        System.out.println("Aucune note trouvée.");
                    } else {
                        for(int i = 0; i < resultats.size(); i++){
                            System.out.println("ID: " + resultats.get(i).getId() 
                                + " | Titre: " + resultats.get(i).getTitre() 
                                + " | Contenu: " + resultats.get(i).getContenu()
                                + " | Date Creation: " + resultats.get(i).getDateCreation());
                        }
                    }
      }
    public static void main(String[] args) { 
       int chwa = 0;
            while(chwa != 5){
                System.out.println("*****************************************");
                System.out.println("*********** Gestionnaire de notes ***********");
                System.out.println("************ MENU PRINCIPALE ************");
                System.out.println("1 - Ajouter une note");
                System.out.println("2 - Supprimer une note");
                System.out.println("3 - Modifier une note");
                System.out.println("4 - Rechercher une note");
                System.out.println("5 - Quitter le programme");
                System.out.println("*****************************************");
                chwa = sc.nextInt();
                sc.nextLine();
                
                switch(chwa){
                    case 1:
                        menuAjouter();
                        break;
                    case 2:
                        menuSupprimer();
                        break;
                    case 3:
                        menuModifier();
                        break;
                    case 4:
                        menuRechercher();
                        break;
                    case 5:
                         System.out.println("Orevwa.");
                        break;
                    default:
                        System.out.println("Chwa invalid, eseye anko.");
                        break;
                }
            }
    }
    
}





