/**
 * Librairies
 */
//import java.util.*;
import java.util.Scanner;
import java.util.regex.*;

/**
 * Package 
 */
import pkg.Air;
import pkg.Bombe;
import pkg.Demine;


public class Main {

    public static void main(String... args){
        
        // Présentation du jeux
        System.out.println("Bienvenue dans le jeu du démineur !");

        // Lancement
        run();

        // Test

        // Air a2 = new Air();
        // Bombe.miner(a2, 6);
        // Bombe.evaluate(a2);
        // a2.afficherResult();
        
    }
    
    
    /**
     * Fonction principale qui configure une partie et fait jouer un joueur
     */
    private static void run(){
        Scanner scan = new Scanner(System.in);
        // Demande de configuration
        System.out.println("*************************** Configuration du jeux ********************************");
        System.out.println("Indiquer la taille de l'air de jeux, par un nombre de 2 à beaucoup ");
        int taille = scan.nextInt();

        System.out.println("Combien de bombe souhaitez-vous inclure dans l'air de jeu ?");
        int bombe = scan.nextInt();

        // limité au nombre maximum de cellule
        //int bombe = scan.nextInt().useDelimiter("");

        // Initialisation
        Air jeu = new Air(taille);
        Bombe.miner(jeu, bombe);
        Bombe.evaluate(jeu);
        //jeu.afficher();
        jeu.afficherResult();

        // Jeu
        boolean fin = false;
        while(!fin){
            // Récupère auprès du joueur les coordonnées d'une case à déminer
            int[] coord = call(taille, scan);
            // Vérifie si une bombe est placé sur la case
            Boolean check = jeu.isBombe(coord[0], coord[1]);
            if(check){
                System.out.println("BOOM !");
                // Afficher la carte avec les bombes                                           <----- 
                jeu.afficher();
                fin = true;
            }else{
                // Découvrir et Afficher
                jeu.decouvre(coord[0], coord[1]);
                jeu.afficherResult();
            }
        }

        // Fin de partie
        rerun();
    }

    /**
     * Fonction demande au joueur de choisir une case à déminer
     * @params: taille du jeur, scanner, réutilise le même scanner
     * @return: int[] retourne les coordonnées x, y de la case à déminer
     */
    private static int[] call(int taille, Scanner scan){
        // Ajouter un contrôle des coordonnées reçues                                       <<<<<<<<<<<<<<<<<<<<<<<<<<<


        int[] vars = new int[2];

        // Demande les coordonnées d'une case
        System.out.println("Choisissez les coordonnées ligne, colonne d'une case");
        System.out.printf("Choissiez une ligne de 0 à : %d : ", taille  - 1);
        vars[0] = scan.nextInt();
        System.out.printf("Choissiez une colonne de 0 à : %d :", taille - 1);
        vars[1] = scan.nextInt();
        return vars;
    }

    /**
     * Fonction qui propose au joueur de refaire une partie
     */
    private static void rerun(){
        Scanner scan = new Scanner(System.in);

        // Propose de fermer le jeux ou de refaire une partie
        System.out.println("Souhaitez-vous refaire une partie: y or n: ");
        String res = scan.nextLine();

        if(Pattern.matches("y", res)){
            run();
        }
        scan.close();
    }
}