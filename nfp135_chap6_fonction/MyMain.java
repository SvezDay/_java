// Fonction d'appel et de test des exo 4 à 8
import chap6.DisplayArray;
import chap6.Smaller;

public class MyMain{
    public static void main(String[] args){
        
        // Init un tableau
        int[] arr = {16, 78, 56, 288, 465, 33, 7, 984, 345, 654, 927, 374, 22, 9, 120, 500, 339};
        
        // test la fonction displayArray
        DisplayArray da = new DisplayArray();
        da.display(arr);

        // test la fonction qui retourne la plus petite valeur d'un array
        Smaller sm = new Smaller();
        
        System.out.println("l'élément le plus petit du tableau est : " + sm.smaller(arr));
    }
}