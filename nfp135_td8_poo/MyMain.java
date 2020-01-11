//import java.util.*;
import static java.lang.System.out;
import java.util.Enumeration;
import java.lang.reflect.Modifier;
import java.lang.reflect.Field;
import td8.Video;
import td8.Support;
//import td8.Support;
public class MyMain {

    static private void displayVideo(Video v){
        out.print(v.getTitle()+" de "+ v.getAnnee() +", avec ");
        String[] arr = v.getActeurs();
            for(int i = 0; i < arr.length; i++){
                out.print(arr[i] + ", ");
            }
        // Optimiser le code avec la détection des modifier des variables (public, protected, private)
        // Field f = Video.class.getDeclaredField("acteurs").getModifiers();
        // if(Modifier.isPrivate(f)){
        //     String[] arr = v.getActeurs();
        //     for(int i = 0; i < arr.length; i++){
        //         out.print(arr[i] + ", ");
        //     }
        // }else{
        //     Enumeration enu = v.acteurs.elements();
        //     while(enu.hasMoreElements()){
        //         out.print(enu.nextElement() + ", ");
        //     }
            
        // }

        out.println("disponible en "+v.getSupport());
    }

    static public void main(String[] args){
        Video v1 = new Video();
        displayVideo(v1);
        Video v2 = new Video(v1);
        displayVideo(v2);
        String[] str = {"machin"};
        Video v3 = new Video("Jaws", 1977, Support.MKV, str);
        displayVideo(v3);
        out.println(v3.getTitle());
        v2.setTitle("jaws2");
        v2.setAnnee(1986);
        v2.setSupport(Support.MP4);
        v2.addActeur("Bob");
        out.println("nb d'acteurs: "+ v2.nbActeurs());
        out.println("acteur n3: "+ v2.Acteur(2));
        out.println("acteur n2: "+ v2.Acteur(1));
        displayVideo(v2);
        v1.affiche();
        out.println(" ***************************************************************");
        Video v4 = Video.createVideo();
        v4.affiche();
        v4.egal(v1);
    }
}