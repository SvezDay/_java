import java.util.*;

public class ex3 {

    public static void main(String[] args){
        double x, y, z, total;
        int nb = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Afficher 3 nombres : ");
        // Gestion des erreurs typage
        while(!in.hasNextDouble()){
            System.out.print("Afficher des nombres : ");
            in.nextLine();
        }
        // Addition des valeurs et gestion du nombre
        total = in.nextDouble() + in.nextDouble() +in.nextDouble();
        System.out.println("La moyenne est : " + total );
        in.close();


    }
}