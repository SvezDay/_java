/**
 * Class general du jeu sudoku
 */

package pkg;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Arrays;

public class Sudoku {

    /**
     * Fonction de résolution
     *      La fonction de backtracking, fonctionne en récurtion, dont chaque
     *      appel à pour objectif de trouver la meilleur valeur pour une case,
     *      en fonction du remplissage précédent, qu'il lui à été confié
     * @params: tab de la grille
     * @return: boolean de validation
     */
    public static boolean resolution(int[][] tab){
        int row = -1;
        int col = -1;
        boolean chercheCase = true;
        // double boucle (row, column)
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                
                // test si la case est vide
                if(tab[i][j] == 0){
                    chercheCase = false;
                    row = i;
                    col = j;
                    // System.out.println("Will break !");
                    break;
                }
            }
            if(!chercheCase){
                // System.out.println("Donc là aussi ça break juste après !");
                break;
            }
        }
        
        
        // si aucune case vide, fin de résolution avec succès
        if(chercheCase){
            affiche(tab);
            enregistre(tab);
            return true;
        }
        // boucle des valeurs possible
        for(int val = 1; val <=9; val++){
            // test de la valeur
            if(verifGlobal(tab, row, col, val)){
                tab[row][col] = val;
                // Renvoyer un nouvel objet ou réinitialiser à l'état précédent
                if(resolution(tab)){
                    return true;
                }else{
                    // Réinitialisé à l'état précédent
                    tab[row][col] = 0;
                }
            }
        }
        // Error de résolution
        return false;
    }

    /**
     * Fonction qui vérifie que le chiffre proposé n'existe pas dans la ligne
     * Si la valeur est présente, la valeur de retour est fausse
     * @params: 
     * - x, y : les coordonnés de position
     * - val : la val à tester
     * @return: boolean
     */
    public static boolean verifLigne(int[][] tab, int x, int y, int val){
        for(int i = 0; i < 9; i++){
            if(tab[x][i] == val){
                return false;
            }
        }
        return true;
    }
    /**
     * Fonction qui vérifie que le chiffre proposé n'existe pas dans la colonne
     * Si la valeur est présente, la valeur de retour est fausse
     * @params: 
     * - x, y : les coordonnés de position
     * - val : la val à tester
     * @return: boolean
     */
    public static boolean verifColonne(int[][] tab, int x, int y, int val){
        for(int i = 0; i < 9; i++){
            if(tab[i][y] == val){
                return false;
            }
        }
        return true;
    }
    /**
     * Fonction qui vérifie que le chiffre proposé n'existe pas dans la zone
     * Si la valeur est présente, la valeur de retour est fausse
     * @params: 
     * - x, y : les coordonnés de position
     * - val : la val à tester
     * @return: boolean
     */
    public static boolean verifZone(int[][] tab, int x, int y, int val){
        // System.out.println("x: "+x+", y: "+y+", val: "+val);
        int row = x - x % 3;
        int col = y - y % 3;
        for(int r = row; r < row + 3; r++){
            for(int c = col; c < col + 3; c++){
                // System.out.println(", r: "+r+", c: "+c);
                if(tab[r][c] == val){
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * Fonction regroupant les vérifications de valeurs
     * @params: x,y coordonées dans la grille, val: valeur à tester
     * @return boolean
     */
    public static boolean verifGlobal(int[][] tab, int x, int y, int val){
        if(!verifColonne(tab,x, y, val) || !verifLigne(tab,x, y, val) || 
                                            !verifZone(tab,x, y, val)){
            return false;
        }
        return true;
    }

    /**
     * Fonction d'affichage
     */
    public static void affiche(int[][] tab){
        System.out.println("\t AFFICHAGE DU SUDOKU !");
        String str = "|";
        String line = "_____________________________________";
        System.out.print("\t");
        for(int i = 0; i < 9; i++){
            System.out.println();
            System.out.println("\t"+line);

            System.out.print("\t");
            for(int j = 0; j < 9; j++){
                if(tab[i][j] == 0){
                    str += " "+" "+" |";
                }else{
                    str += " "+tab[i][j]+" |";
                }
            }
            System.out.print(str);
            str = "|";
        }
        System.out.println();
        System.out.println("\t"+line);
        System.out.println();
        System.out.println();
    }

    /**
     * Fonction d'enregistrement
     * 
     */
    public static void enregistre(int[][] grille){
        SimpleDateFormat formater = new SimpleDateFormat("yyyyMMddHHmmss");
        Date aujourdhui = new Date();
        String date = formater.format(aujourdhui);

        // Conversion de la matrice en string
        // String str = "";
        // for(int n = 0; n < grille.length; n++){
        //     str += Arrays.toString(grille[n]);
        //    // String str = Arrays.toString(grille[0]);
        // }
        // String str = Arrays.toString(strGrille);

        // System.out.println("length : "+grille.length);
        
        try {
            FileOutputStream out = new FileOutputStream("Sudoku_"+date+".txt");
            for(int n = 0; n < grille.length; n++){
                out.write(Arrays.toString(grille[n]));
            }
            
        } finally {
            out.close();
            //TODO: handle exception
        }
        // System.out.println("Sudoku_"+date+".txt");
        // System.out.println(str);
    }


   
     
 }