/*
la class Mediatheque est un ensemble de Media
*/

package td9;
import td9.*;

public class Mediatheque {
    private Vector<Media> media;
    private String proprietaire;

    // CONSTRUCTEURS
    public Mediatheque(){
        this.media = new Vector<Media>();
        this.proprietaire = "The Mayor";
    }
    public Mediatheque(String p){
        this.proprietaire = p;
    }

    // ACCESSEURS


    // MODIFIERS


    // METHODES

        //@override
        public String toString(){
            return String.format(super.toString() + ", il est réalisé par " + this.realisateur + " et il est joué par: ");
        }
        public boolean equals(Object obj){
            if(this == obj){
                return true;
            }else if(obj instanceof Film){
                Film cp = (Film) obj;
                if(this == cp){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        public Film clone(){
            return new Film(this);
        }
}