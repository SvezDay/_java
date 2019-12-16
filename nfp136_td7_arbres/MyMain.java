import static java.lang.System.out;

import td7.ArbreVector;

public class MyMain {

    public static void main(String... args){
        ArbreVector a1 = new ArbreVector();
        a1.addNode("Blanquette");
        a1.addNode("Pomme à l'huile");
        a1.addNode("Harrent");
        a1.addNode("SPEC");
        a1.addNode("SNEC");
        a1.DFS("in");
        out.println("");
        a1.DFS("pr");
        out.println("");
        a1.DFS("po");
        out.println("");
        a1.BFS();
    }
}