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


public class Main {

    public static void main(String... args){
        
        // Présentation du jeux
        System.out.println("Bienvenue dans le jeu du démineur !");

        // Lancement
        //run();

        // Test

        Air a2 = new Air();
        Bombe.miner(a2, 6);
        Bombe.evaluate(a2);
        a2.afficherResult();
        
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
        jeu.afficher();

        // Jeu
        boolean fin = false;
        while(!fin){

            fin = true;
        }

        // Fin de partie
        rerun();
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