// Algorithme de tri stupide de type Gnome
//import java.util.*;

import chap5.GnomeSort;
public class TestSort {
    
    
    public static void display(int[] tab){
        System.out.print("Tableau: ");
        for(int i = 0; i < tab.length; i++){
            System.out.print(tab[i]+" / ");
        }
        System.out.println("");
    }
    public static void main(String[] args){
        GnomeSort gs = new GnomeSort();
        int[] tab = {367, 89, 6, 76, 34, 99, 23, 8};
        int i = 0;
        System.out.println("Tableau avant ****************");
        display(tab);
        int[] newTab = gs.sort(tab);
        System.out.println("Tableau après ****************");
        display(newTab);
    }
}