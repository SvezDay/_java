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
    private int[][][] tab;
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
        // Plus une dernière dimention pour définir si une case est caché ou visible
        tab = new int[largeur][largeur][2];
  
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
        return this.tab[x][y][0];
    }

    /**
     * @params: x numéro de la ligne du tableau, y n° de la colonne
     */
    public void setBombe(int x, int y){
        this.tab[x][y][0] = -1;
    }

    /**
     * @params: coodonnées de la cellule x, y 
     *          et nb le nombre de bombe à proximité
     */
    public void setValue(int x, int y, int nb){
        this.tab[x][y][0] = nb;
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
                // initialisation des valeurs de jeu 
                tab[i][j][0] = -2;
                // initialisation des valeurs de visibilité
                // une valeur de visibiité à 0 sera caché
                tab[i][j][1] = 0;
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

                if(tab[i][j][0] >= 0)
                    values.append(" ");

                if(tab[i][j][0] == 0){
                    values.append(" " + " " + " |");
                }else{
                    values.append(" " + tab[i][j][0] + " |");
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

                if(tab[i][j][0] >= 0)
                    values.append(" ");

                // Les cellules à 0 ne sont pas affichées
                // Les cellules non découverte ne sont pas affichées non plus
                // Les cellules découverte sont égales à 1
                if((tab[i][j][0] != 0) && (tab[i][j][1] == 1)){
                    values.append(" " + tab[i][j][0] + " |");
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
        return this.tab[x][y][0] == -2 ? true : false;
    }

    /**
     * Fonction qui vérifie si une cellule est miné
     * @return: boolean
     */
    public boolean isBombe(int x, int y){
        return this.tab[x][y][0] == -1 ? true : false;
    }

    /**
     * Fonction qui vérifie si une cellule est à 0
     * @return: boolean
     */
    public boolean isNull(int x, int y){
        return this.tab[x][y][0] == 0 ? true : false;
    }


    /**
     * Fonction qui découvre les cases
     * Etape 0: découvre la case initiale et check si null
     * Etape 1: si null, Définie une zone
     * Etape 2: Itération des cases de la zone
     * Etape 3: Découvre la case
     * Etape 4: Check si la case est null
     * Etape 5: si E4, récursion
     */
    public void decouvre(int x, int y){
        System.out.println(" Fonction découvre ");
        // Etape 0
        devoile(x, y);
        boolean checkFirst = isNull(x, y);
        if(!checkFirst){
            // Etape 1
            int[][] zone = definirZone(x, y);
    
            // Etape 2
            for(int i = 0; i < zone.length; i++){
                // Etape 3
                devoile(zone[i][0], zone[i][1]);
    
                // Etape 4
                boolean checkSecond = isNull(zone[i][0], zone[i][1]);
                if(checkSecond){
    
                    // Etape 5
                    decouvre(zone[i][0], zone[i][1]);
                    System.out.format("zone length: %d, i: %d ", zone.length, i);
                    System.out.println(" - ");
                }
            }
        }
    }

    /**
     * Fonction qui retourne les cases environnentes d'une case
     * @params: coordonnées x, y d'une case
     * @return: coordonnées des cases directement environnentes
     */
    private int[][] definirZone(int x, int y){
        int[][] zone = new int[8][2];
        int it = 0;

        for(int subx = -1; subx < 2; subx++){
            for(int suby = -1; suby < 2; suby++){
                System.out.format("suite one - it: %d, subx: %d, suby: %d", it, x + subx, y + suby);
                System.out.println(" - ");
                // sauf la case courante
                if(!(subx == 0 && suby == 0)){
                    System.out.format("check  subx + suby %d", subx + suby);
                    System.out.println(" - ");
                    // sauf les cases hors de l'air de jeu
                    if(x + subx >= 0 && x + subx < this.tab.length){
                        if(y + suby >= 0 && y + suby < this.tab.length){
                            System.out.format("suite  it: %d, subx: %d, suby: %d", it, x + subx, y + suby);
                            System.out.println(" - ");
                            zone[it][0] = x + subx;
                            zone[it][1] = y + suby;
                            it++;
                        }   
                    }
                }
            }   
        }

        return zone;
    }

    /**
     * Fonction qui rend visible la case
     * @params: coordonnées x, y d'une case
     */
    private void devoile(int x, int y){
        this.tab[x][y][1] = 1;
    }


}