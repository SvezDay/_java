// Algorithme de tri stupide de type Gnome
//import java.util.*;
package chap5;
public class GnomeSort {
    /*
    *
    *@Params: int[] param : tableau d'integer
    *@Return: int[] tab : a copy of the array set in params, sorted
    *
    */
    public static int[] sort(int[] param){
        int[] tab = param.clone();
        for(int i = 1; i < tab.length; i++){
            int ic = i; // index current position de l'élément en cours de classement
            int iw = i-1; // index de remmonté du tableau
            while(tab[ic] <= tab[iw] && ic != 0){        
                int tmp = tab[iw];
                tab[iw] = tab[ic];
                tab[ic] = tmp;
                
                ic = ic == 0 ? 0 : ic - 1;
                iw = iw == 0 ? 0 : iw - 1;
            }
        }
        return tab;
    }
}