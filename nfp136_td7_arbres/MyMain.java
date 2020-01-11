import static java.lang.System.out;

import td7.ArbreChainage;

public class MyMain {

    public static void main(String... args){
        // // TD ARBRE DE VECTEUR
        // ArbreVector a1 = new ArbreVector();
        // a1.addNode("Blanquette");
        // a1.addNode("Pomme à l'huile");
        // a1.addNode("Harrent");
        // a1.addNode("SPEC");
        // a1.addNode("SNEC");
        // a1.DFS("in");
        // out.println("");
        // a1.DFS("pr");
        // out.println("");
        // a1.DFS("po");
        // out.println("");
        // a1.BFS();

        /**
         * TD ARBRE DE CHAINAGE
         * L'algo n'est pas terminé, il faudra choisir un objectif autre qu'un simple affichage, 
         * pour avoir un intérêt à aller plus loin
         */
        ArbreChainage ac = new ArbreChainage();
        ac.addNode(78);
        ac.addNode(66);
        ac.addNode(4);
        ac.addNode(23);
        ac.addNode(12);
        System.out.println( ac.toString() );
    }
}