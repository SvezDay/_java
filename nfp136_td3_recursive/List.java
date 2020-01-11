import java.util.*;
// Class défini dans le cours
public class MaListe{
    private int val;
    private MaListe suivant;

    public MaListe(int v, MaListe s){
        this.val = v;
        this.suivant = s;
    }
    public int tete(){
        return this.val;
    }
    public MaListe queue(){
        return this.suivant;
    }
}

public class List{
    // Retourne la valeur minimal contenue dans la liste l
    // PROBLEME: le paramètre int v est inutil :: POURQUOI l'avoir mise
    public static int min(MaListe l, int v){
        int res;
        // test que la liste ne soit pas vide sinon retour null ou undefined
        
        // 1 - parcourir la liste jusqu'à arriver au bout
        // 2 - tester la valeur inférieur à la remonté
        if(!!l.queue()){
            // descendre
            res = min(l.queue(), l.tete());
        }else{
            res = v;
        }
        return = l.tete() < v ? l.tete() : res;
    }

    public static void swap(MaListe l, int p1, int p2){
        // throw exception si p1 ou p2 sont out of range de la liste

    }

    public MaListe create(MaListe l, int val){
        return new MaListe(val, l);
    }

    public static void main(String[] args){
        // test de la function min()
        int vs = [23, 45, 7, 89, 9, 65];
        MaListe list;
        for(int i = vs.length - 1; i >= 0; i--){
            if(i == vs.length - 1){
                // dernier node
                list = create(null, vs[i]);
            }else{
                list = create(list, vs[i]);
            }
        }

    }
}