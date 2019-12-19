// import java.util.*;
package td9;
import td9.Media;
import java.lang.Class;

public class Livre{
    private String auteur;
    private String ISBN;

    // CONSTRUCTEURS
    public Livre(){
        super();
        this.auteur = "La médiatèque";
        this.ISBN = "FOOBAR42";
    }
    public Livre(Livre l){
        //super(l.getClass().getSuperclass());
        //super(l.titre, l.cote, l.annee);
        super();
        this.auteur = l.auteur;
        this.ISBN = l.ISBN;
    }
    public Livre(String titre, String cote, int annee, String auteur, String ISBN){
        //super(titre, cote, annee);
        super();
        this.auteur = auteur;
        this.ISBN = ISBN;
    }
}