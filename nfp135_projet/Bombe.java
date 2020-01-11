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
                int[] coord = randomize(tab.getHeightLength());
            
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

    /**
     * Fonction qui évalue le nombre de case à proximité
     * @params: tab l'air de jeu à renseigner
     */
    public static void evaluate(Air tab){
        int dim = tab.getHeightLength();
        // Iteration du tableau
        for(int x = 0; x < dim; x++){
            for(int y = 0; y < dim; y++){

                // Vérifie que la cellule soit vide
                // et donc, n'acceuil pas de bombe
                if(tab.isEmpty(x, y)){

                    // Compteur de bombe dans l'environnement de la cellule
                    int bombe = 0;

                    // itérate à travers les lignes
                    for(int i = -1; i <= 1; i++){
                        
                        // itérate les colones
                        for(int j = -1; j <= 1; j++){

                            // Exclue l'évaluation des lignes et colonnes hors matrice
                            // et exclue l'évaluation de la cellule ell-même
                            if(((x+i) >= 0 && (x+i) < dim) && ((y+j) >= 0 && (y+j) < dim) && !(i == 0 && j == 0)){

                                // Vérifie s'il s'agit d'une bombe
                                if(tab.isBombe(x+i,y+j))
                                    bombe++;
                            }
                        }
                    }

                    // Ecrase la valeur précédente par la valeur du compteur
                    tab.setValue(x, y, bombe);
                    
                }
            }
        }
    }
}
