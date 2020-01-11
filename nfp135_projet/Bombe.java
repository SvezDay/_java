/**
 * Package 
 */
package pkg;
import pkg.Air;

/**
 * Librairies
 */
import java.util.ArrayList;
import java.util.Random;


public class Bombe {
    /**
     * @params: tab est le tableau de l'air de jeu et nb est le nombre de bombe à y poser
     */
    public static void miner(Air tab, int nb){
        // Boucle sur la procédure de minage, autant de fois que le nb de bombe 
        for(int i = 0; i < nb; i++){
            // Procédure de ciblage

            boolean empty = false;
            // Recherche les coordonnées aléatoires et recommence
            // si une bombe existe déjà aux coordonnées 
            while(empty == false){
                int[] coord = randomize(tab.getLength());
            
                if(tab.isEmpty(coord[0], coord[1])){
                    empty = true;
                    // ajoute la bombe à l'air de jeu
                    tab.setBombe(coord[0], coord[1]);
                }
            }

        }
        
    }
    /**
     * Fonction qui cible aléatoirement une cellule d'un tableau
     * @params: largeur d'un tableau
     * @return: coordonnée x, y, d'une bombe dans un tableau
     */
    private static int[] randomize(int length){
        int[] coord = new int[2];
        coord[0] = new Random().nextInt(length - 1);
        coord[1] = new Random().nextInt(length - 1);
        return coord;
    }
}
