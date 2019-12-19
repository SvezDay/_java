/*
Classe mère
*/

package td9;

//import java.util.*;

public class Media {
    private String titre;
    private String cote;
    private int annee;

    // CONSTRUCTEURS
    protected Media(){
        this.titre = "Tutoriel des Médias";
        this.cote = "premium";
        this.annee = 2019;
    }
    protected Media(Media m){
        this.titre = m.titre;
        this.cote = m.cote;
        this.annee = m.annee;
    }
    protected Media(String t, String c, int a){
        this.titre = t;
        this.cote = c;
        this.annee = a;
    }

    // ACCESSEURS
    public String getTitre(){ return this.titre; }
    public String getCote(){ return this.cote; }
    public int getAnnée(){ return this.annee; }

    // MODIFIEURS
    public void setTitre(String t){ this.titre = t; }
    public void setCote(String c){ this.cote = c; }
    public void setAnnee(int a){ this.annee = a; }

    // Masquage des méthodes toString, equals, clone
    
    public String toString(){
        return String.format("Le film " + this.titre + " de " + this.annee + " a une cote de " + this.cote);
    }
    public boolean equals(Object obj){
        if(this == obj){ return true; }
        if(obj instanceof Media){
            Media cp = (Media) obj;
            if(this == cp){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public Media clone(){
        return new Media(this);
    }


}