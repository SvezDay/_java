package td7;
//import java.util.*;

public class Noeud {
    private int num;
    // CONSTRUCTEUR
    public Noeud(){ this.num = 0; }
    public Noeud(Noeud n){ this.num = n.num; }

    // ACCESSEURS/MODIFIERS
    public int getValue(){ return this.num; }
    public void setValue(int i){ this.num = i; }

    // METHOD OVERRIDE
    public String toString(){ return String.format("Le noeud a une valeur de: " + this.num); }
}