/**
 * Librairies
 */
//import java.util.*;

/**
 * Package 
 */
import pkg.Air;
import pkg.Bombe;


public class Main {
    public static void main(String... args){
        System.out.println("Enter in the démineur game !");
        //Air a = new Air();
        //a.afficher();

        Air a2 = new Air(6);
        Bombe.miner(a2, 6);
        a2.afficher();
    }
}