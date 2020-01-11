/**
 * Package 
 */
package pkg;
//import pkg.;

/**
 * Librairies
 */
import java.util.ArrayList;
import java.lang.StringBuffer;


public class Air {
    private int[][] tab;
    /**
     * Constructeur par défaut initialisé avec une largeur de 6
     */
    public Air(){
        System.out.println("Initialisation de l'air de jeu");
        // Créer un tableau à 2 dimentions
        tab = new int[6][6];
        
        // Initialiser les valeurs par défaut du tableau
        this.init();
    }
    /**
     * Constructeur par initialisation avec un paramètre largeur
     */
    public Air(int largeur){
        // Créer un tableau à 2 dimentions
        tab = new int[largeur][largeur];
  
        // Initialiser les valeurs par défaut du tableau
          this.init();
    }
    /**
     * ACCESSEURS - MODIFIERS
     */

     /**
      * 
      */
    public int getLength(){
        return this.tab.length;
    }

    /**
     * @params: x numéro de la ligne du tableau, y n° de la colonne
     */
    public int getValue(int x, int y){
        return this.tab[x][y];
    }

    /**
     * @params: x numéro de la ligne du tableau, y n° de la colonne
     */
    public void setBombe(int x, int y){
        this.tab[x][y] = -1;
    }

    /**
     * METHODES
     */

    /**
     * Initialiser les valeurs par défaut du tableau
     */
    private void init(){
        for(int i = 0; i < this.tab.length; i++){
            for(int j = 0; j < this.tab[i].length; j++){
                tab[i][j] = -2;
            }
        }
    }


     /**
      * 
      */
    public void afficher(){
        for(int i = 0; i < this.tab.length; i++){
            // Initialise chaque ligne avec un espace de départ
            StringBuffer rowUp = new StringBuffer();
            StringBuffer values = new StringBuffer();
            rowUp.append("\t"+"-");
            values.append("\t|");

            for(int j = 0; j < this.tab[i].length; j++){
                rowUp.append("-----");
                if(tab[i][j] >= 0)
                    values.append(" ");
                values.append(" " + tab[i][j] + " |");
            }
            // Affichage de ligne par ligne
            System.out.println(rowUp);
            System.out.println(values);

        }
        // Dernière ligne
        System.out.print("\t"+"-");
        for(int i = 0; i < tab.length; i++){
            System.out.print("-----");
        }

        // Espace de séparation avec la prochaine cmd
        System.out.println("");
    }

    /**
     * 
     */
    public boolean isEmpty(int x, int y){
        return this.tab[x][y] == -2 ? true : false;
    }



}