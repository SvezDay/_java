// Programme de comparaison d'algorithme de tri
// 


// import java.util.*;
//import java.sql.Timestamp;
import java.util.Date;
//import java.lang.Object;

// package des algo de tri
import chap5.GnomeSort;
import chap5.QuickSort;

public class PerfSort {

    public static void rand(){
        // affiche des nombres aléatoire de 0 à 999
        double r, m;
        int ri;
        for(int i = 0; i < 100; i++){
            r = Math.random()*1000;
            m = r % 1;
            ri = (int) (r - m);
            System.out.print(ri + ", ");
        }
    }
    public static void display(int[] tab){
        System.out.print("Tableau: ");
        for(int i = 0; i < tab.length; i++){
            System.out.print(tab[i]+" / ");
        }
        System.out.println("");
    }
    public static void perfGnome(int[] tab){
        // 100 Iteration de tris de l'algorithme de tri Gnome
        GnomeSort gs = new GnomeSort();
        long debut, fin;
        long ecart  = 0; // durée cummulé des tris
        debut = new Date().getTime();
        for(int i=1; i < 10000; i++){
            gs.sort(tab);
        }
        fin = new Date().getTime();
        ecart = (fin-debut);
        System.out.println("La durée moyenne de tri de cet algorithme est: " + ecart);
    }
    public static void perfSelection(int[] tab){

    }
    public static void perfQuick(int[] tab){
        //int[] arr = tab.clone();
        int[] arr = tab;
        QuickSort qs = new QuickSort();
        qs.sort(arr, 0, arr.length -1);
        // long debut, fin;
        // long ecart  = 0; // durée cummulé des tris
        // debut = new Date().getTime();
        // for(int i=1; i < 10000; i++){
        //     qs.sort(arr);
        // }
        // fin = new Date().getTime();
        // ecart = (fin-debut);
        // System.out.println("La durée moyenne de tri de cet algorithme est: " + ecart);
    }


    public static void main(String[] args){
        // afficher la liste des algos disponible
        // scanner la réponse, pour lancer le test
        //int[] tab = {6, 7, 89, 678, 34, 45, 3, 8, 16, 79, 54, 66, 65, 456, 17, 11, 39, 77, 110, 167, 39, 1, 91,340, 836, 257, 189, 993, 978, 182, 236, 262, 173, 666, 102, 849, 791, 682, 56, 223, 470, 42, 421, 79, 538, 223, 903, 684, 168, 281, 880, 621, 184, 996, 900, 628, 411, 603, 263, 747, 896, 453, 130, 711, 329, 749, 250, 615, 528, 62, 46, 178, 877, 661, 535, 562, 235, 833, 226, 580, 917, 278, 956, 309, 13, 331, 380, 575, 491, 265, 655, 500, 243, 150, 727, 354, 464, 792, 505, 205, 551, 85, 107, 472, 991, 704, 332, 336, 556, 449, 483, 114, 495, 681, 657, 98, 305, 284, 691, 102, 90, 232, 988};
        int[] tab = {6, 7, 89, 678, 34, 45, 3, 8, 16, 79, 54, 66, 65, 456};
        //perfGnome(tab);
        perfSelection(tab);
        perfQuick(tab);
        // Check pour s'assurer que le tableau de référence n'est pas transformé avant d'être envoyé aux algos
        display(tab);
        
    }
}