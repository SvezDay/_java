//import java.util.*;
//import td9.Media;

import td9.Film;
import java.util.Vector;

/* -------------------------------------------------------------------------------------------------------
Le programme n'est pas terminé
 ------------------------------------------------------------------------------------------------------- */

public class MyMain {
    public static void main(String... argv){
        Film f1 = new Film();
        System.out.println(f1.toString());
        Film f2 = new Film("star wars", "8.5", 1977, "G. Lucas");
        System.out.println(f2.toString());
//        System.out.println("typeof vector is: " + (f1.acteurs instanceof Vector) );
    }
}