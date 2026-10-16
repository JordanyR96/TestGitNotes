package application_note;

import java.time.LocalDate;

public class Note {

    //static la se yon variable ki kouvri tout klas note la
    private static int compID = 1;
    public int id;
    public String titre;
    public String contenu;
    public LocalDate dateCreation;

    Note(String titre, String contenu) {
        this.id = compID++;
        this.titre = titre;
        this.contenu = contenu;
        this.dateCreation = LocalDate.now();
    }

    //getter et setter
    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getContenu() {
        return contenu;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

}
