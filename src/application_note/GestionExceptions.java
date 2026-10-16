package application_note;

import static application_note.Application_Note.sc;
import java.util.InputMismatchException;

/**
 *
 * @author Samael
 */
public class GestionExceptions extends Exception {

     public GestionExceptions(String message) {
        super(message);
    }
    
    public static int lireChoix() {
        int chwa = -1;
        System.out.println("Choisi une option : ");
        try {
            chwa = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException exception) {
            sc.next();
        }
        return chwa;
    }
}
