// Programme de tri de type Quicksort

package chap5;
// import java.util.*;
import java.util.Random;
public class QuickSort {
    public static void display(int[] tab){
        System.out.print("Tableau: ");
        for(int i = 0; i < tab.length; i++){
            System.out.print(tab[i]+" / ");
        }
        System.out.println("");
    }
    /*
    *
    *
    *@PARAMS: int[] arr : tableau à trier, int debut:  index du début de la partie du tableau à trier, int fin : index de fin ...
    *@RETURN: int d : index du debut du tableau
    *
    */
    public static int sort(int[] arr, int debut, int fin){
        // 1 - Init. variable
        // TODO: modifier l'affectation du pivot à un index aléatoire
        // new Random().nextInt((fin - debut)+1) + debut
        int r;
        r = new Random().nextInt((fin - debut) + 1) + debut;
        int pivot = arr[r]; // valeur de comparaison
        // debut et fin sont utilisés à la fin, donc on les copies car les limites se réduise durant l'algo
        int d = debut; // selecteur/index de position
        int f = fin; // selecteur/ index de position
        // 2 - swap les elements (pour 1 seul tour)
        // 2.1 - Première itération, de l'index de debut; de gauche à droite jusq'à rencontrer l'index de fin
        while(d != f){
            while(d != f && arr[d] < pivot){
                d++;
            }
            while(d != f && arr[f] > pivot){
                f--;
            }
            if(arr[d] >= pivot && arr[f] <= pivot){
                // swapping
                int tmp = arr[f];
                arr[f] = arr[d];
                arr[d] = tmp;
                // modification du random r si le pivot change de place
                r = r == f ? d : r == d ? f : r;
            }               
        }
        
        // 3 - Partitionning array in 2 (pour la récursivité)
        // 3.1 - Partition plus petite
        if(debut < (r-1)){
            sort(arr, debut, (r - 1));
        }
        // 3.2 - Partition plus grande
        if((r+1) < fin){
            sort(arr, (r + 1), fin);
        }
        return d;
    }
}