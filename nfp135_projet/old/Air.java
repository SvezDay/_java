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
        // Plus une dernière dimention pour définir si une case est caché ou visible
        tab = new int[6][6][2];
        
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
    public int getHeightLength(){
        return this.tab.length;
    }
    /**
     * 
     */
     public int getWidthLength(){
        return this.tab[0].length;
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
     * @params: coodonnées de la cellule x, y 
     *          et nb le nombre de bombe à proximité
     */
    public void setValue(int x, int y, int nb){
        this.tab[x][y] = nb;
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
      * Fonction qui affiche les données de l'air de jeu
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

                if(tab[i][j] == 0){
                    values.append(" " + " " + " |");
                }else{
                    values.append(" " + tab[i][j] + " |");
                }
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
      * Fonction qui affiche les données DECOUVERTE de l'air de jeu
      */
      public void afficherResult(){
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

                // Les cellules à 0 ne sont pas affichées
                // Les cellules non découverte ne sont pas affichées non plus
                if((tab[i][j] != 0) && (true)){
                    values.append(" " + tab[i][j] + " |");
                }else{
                    values.append(" " + " " + " |");
                }
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

    /**
     * Fonction qui vérifie si une cellule est miné
     * @return: boolean
     */
    public boolean isBombe(int x, int y){
        return this.tab[x][y] == -1 ? true : false;
    }



}