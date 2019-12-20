package td7;
import td7.Noeud;
import java.util.ArrayList;

public class ArbreChainage {
    ArrayList<Integer> list;
    /**
     * CONSTRUCTEURS
     */
    public ArbreChainage(){ 
        this.list = new ArrayList<Integer>();
    }
    public ArbreChainage(ArbreChainage ac){ 
        this.list = new ArrayList<Integer>(ac.list.size()); 
        for(int i = 0; i < ac.list.size(); i++)
            this.addNode(ac.list.get(i));
    }
    /**
     * @override toString
     */
    public String toString(){
        String str = "";
        for(int i = 0; i < this.list.size(); i++)
            str += this.list.get(i) + " / ";
        return String.format(str);
    }
    /**
     * Append node integer to arraylist
     * @param: int
     */
    public void addNode(int i){ 
        this.list.add(i); 
    }

    /**
     * Parcours en profondeur de l'arbre binaire
     * @param: trait correspond à un traitement in: inordre, pr: preordre, po: postordre
     */
    public void DFS(String trait){
        // Renvoi au traitement adapté
        switch (trait) {
            case "in":
                DFS_IN();
                break;
            case "pr":
                DFS_PR();
                break;
            case "po":
                DFS_PO();
                break;
            default:
                System.out.println("L'indicateur de traitement DFS est erroné: soit: in, pr ou po");
                break;
        }
    }
    /**
     * DFS Preordre
     */
    private void DFS_PR(){

    }
    /**
     * DFS Inordre
     */
    private void DFS_IN(){

    }
    /**
     * Depth First Search PostOrdre
     */
    private void DFS_PO(){}
}