import java.util.Scanner;

// Convertisseur francs / euros, avec gestion des erreurs

public class ex1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Affichez une somme (double) en francs : ");
        while(!sc.hasNextDouble()){
            System.out.print("Un integer please : ");
            sc.nextLine();
        }
        double fr = sc.nextDouble();
        System.out.println(fr/6.55659+" euros");
        
    }

}