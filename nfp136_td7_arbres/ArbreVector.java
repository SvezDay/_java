
package td7;
import static java.lang.System.out;
import java.util.Vector;

public class ArbreVector {

    private Vector<String> vs;

    // CONSTRUCTEUR
    public ArbreVector(){
        vs = new Vector<String>();
    }
    public ArbreVector(ArbreVector av){
        vs = new Vector<String>();
    }

    // MUTATEURS
    public void addNode(String s){
        vs.add(s);
    }

    // PARCOURS TRAITEMENT
    // La description du traitement n'étant pas précisé,j'opte pour un ordonnancement dans un tableau.
    public void DFS(String trait){
        switch (trait) {
            case "in":
                out.print("DFS - IN: ");
                IN(0);
                break;
            case "pr":
                out.print("DFS - PR: ");
                PR(0);
                break;
            case "po":
                out.print("DFS - PO: ");
                PO(0);
                break;        
            default:
                out.println("Erreur de paramètre pour la méthode DFS !");
                break;
        }
    }
    private void IN(int index){
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        // Si left ne dépasse pas le vector
        if(left < vs.size()){ IN(left); }
        // Print index of the vector
        out.print(index + " ");
        // Si droite ne dépasse pas le vector 
        if(right < vs.size()){ IN(right); }
        // Quand l'affichage left et right est fait, retour (remonté)
        return;
        
    }
    private void PR(int index){
        // Print index of the vector
        // out.print(index + " ");
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        // Si left ne dépasse pas le vector
        if(left < vs.size()){ PR(left); }
        // Si droite ne dépasse pas le vector 
        if(right < vs.size()){ PR(right); }
        // Quand l'affichage left et right est fait, retour (remonté)
        return;
        
    }
    private void PO(int index){
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        // Si left ne dépasse pas le vector
        if(left < vs.size()){ PO(left); }
        // Si droite ne dépasse pas le vector 
        if(right < vs.size()){ PO(right); }
        // Print index of the vector
        out.print(index + " ");
        // Quand l'affichage left et right est fait, retour (remonté)
        return;
        
    }
    public void BFS(){
        Vector<Integer> vi = new Vector<Integer>();
        vi.add(0);

        int current = vi.firstElement(); // récupère le premier elem et le supprime ou retour null si la liste est vide
        vi.remove(0);
        int left = 2 * current + 1;
        int right = 2 * current + 2;
        if(left < vs.size()){ vi.add(left); }
        if(right < vs.size()){ vi.add(right); }
        out.println(current + " " + vs.get(current));
        if(!vi.isEmpty()){
            BFS(vi);
        }
    }
    public void BFS(Vector<Integer> vi){
        int current = vi.firstElement(); // récupère le premier elem et le supprime ou retour null si la liste est vide
        vi.remove(0);
        int left = 2 * current + 1;
        int right = 2 * current + 2;
        if(left < vs.size()){ vi.add(left); }
        if(right < vs.size()){ vi.add(right); }
        out.println(current + " " + vs.get(current));
        if(!vi.isEmpty()){
            BFS(vi);
        }
    }


}