/*
*/
package td8;
import java.util.Vector;
import java.util.Enumeration;
import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;
import java.lang.ref.WeakReference;

public class Video {
    
    private static List instances = new ArrayList();
    //private static Video[] instances = ;
    private String title;
    private int annee;
    private Support support;
    private Vector<String> acteurs = new Vector<String>(); 

    // PRIVATE CONSTRUCTOR
    public Video(){
        title = "E.T.";
        annee = 1982;
        support = Support.DVD;
        acteurs.add("Drew B.");
    }    
    
    public Video(Video v){
        title = v.title;
        annee = v.annee;
        support = v.support;
        acteurs = new Vector<String>(v.acteurs);
    }
    public Video(String _title, int _annee, Support _sup, String[] _acteurs){
        title = _title;
        annee = _annee;
        support = _sup;
        for(int i = 0; i < _acteurs.length; i++){
            acteurs.add(_acteurs[i]);
        }
        
    }
    // PUBLIC CONSTRUCTOR
    public static Video createVideo(){
        Video v = new Video();
        instances.add(v);
        return v;
    }

    // ACCESSEURS
    public String getTitle(){ return title; }
    public int getAnnee(){ return annee; }
    public Support getSupport(){ return support; }
    public String[] getActeurs(){ 
        return acteurs.toArray(new String[acteurs.size()]); }

    // MUTATEURS
    public void setTitle(String t){ title = t; }
    public void setAnnee(int a){ annee = a; }
    public void setSupport(Support s){ support = s; }
    
    // METHODES POUR MANIPULER LE VECTOR ACTEURS
    public void addActeur(String a){ acteurs.add(a); }
    public int nbActeurs(){ return acteurs.size(); }
    public String Acteur(int i){ 
        return i < (acteurs.size()) ? acteurs.elementAt(i) : "Bad index!"; }
    
    // AUTRES METHODES
    public void affiche(){
        out.print(getTitle()+" de "+ getAnnee() +", avec ");
        String[] arr = getActeurs();
        Enumeration enu = acteurs.elements();
        while(enu.hasMoreElements()){
            out.print(enu.nextElement()+", ");
        }
        out.println("disponible en "+getSupport());
    }

    // METHODES DE TEST
    public boolean egal(Video v){
        // Verify if the given objet already exist
        boolean compare = false;
        // for(int i = 0; i < Video.instances.size(); i++){
        //     //Video vi = Video.instances.get(i);
        //     //WeakReference vi = Video.instances.get(i);
        //     // if((v.getTitle() == vi.getTitle) && (v.getAnnee() == vi.getAnnee()) && 
        //     //     (v.support() == vi.support()) && (v.getActeurs() == vi.getActeurs())){
        //     //         compare = true;
        //     //     }
        //     Object[] arr = Video.instances.toArray();
        //     System.out.println("============================"+arr.size());
        // }
        //ArrayList<Video> arr = (ArrayList<Video>) Video.instances.get(0);
        //ArrayList<Video> arr = new ArrayList( Arrays.asListVideo.instances.get(0) );
        ArrayList<Video> arr = (ArrayList) Video.instances.elements();
        System.out.println("============================"+Video.instances.size()+": ");
        return compare;
    }
}