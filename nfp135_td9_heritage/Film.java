/*
*/
package td9;

import java.util.Vector;
import java.util.Enumeration;
import java.util.ArrayList;

import td9.Media;

public class Film extends Media{
    private String realisateur;
    private Vector<String> acteurs;

    // CONSTRUCTEURS
    public Film(){
        super();
        this.realisateur = "La Mediateque";
        this.acteurs = new Vector<String>();
        this.acteurs.add("Mayor");
    }
    public Film(Film f){
        super(f);
        this.realisateur = f.realisateur;
        this.acteurs = new Vector<String>();
        for(int i = 0; i < f.acteurs.size(); i++){
            this.acteurs.add(f.acteurs.get(i));
        }
    }
    // La propriété acteurs étant privé, les acteurs ne seront pas copié à l'initialisation
    public Film(String titre, String cote, int annee, String realisateur){
        super(titre, cote, annee);
        this.realisateur = realisateur;
        this.acteurs = new Vector<String>();
    }

    // ACCESSEURS
    public String getRealisateur(){ return this.realisateur; }
    
    // MODIFIERS
    public void setRealisateur(String r){ this.realisateur = r; }
    
    // METHODES
    public ArrayList getActeurs(){ 
        ArrayList<String> arr = new ArrayList<>(this.acteurs);
        return arr;
    }
    public void addActeurs(String a){
        this.acteurs.add(a);
    }

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