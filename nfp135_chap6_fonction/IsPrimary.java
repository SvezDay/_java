/*
Algorithme qui vérifie si un nombre transmit en paramètre est premier ou non
*/
import java.util.Scanner;
import java.util.InputMismatchException;
public class IsPrimary{
    public static boolean isPrimary(int nb){
        boolean bool = true;
        for(int i = 1; i < nb; i++){
            System.out.println("nb: "+nb+"i: "+i+" % : "+(nb%i));
            if((nb % i) == 0 && i != 1){
                bool = false;
            }
        }
        if(nb <= 1){
            bool = false;
        }
        return bool;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nb = -1;
        // Demander un nombre à tester, le récupérer et vérifier qu'il sagisse bien d'un entier
        System.out.print("Entrer un nombre pour savoir s'il est premier: ");
        while(nb == -1){
            try {
                nb = sc.nextInt();    
            } catch (InputMismatchException e){
                //System.out.println("InputMismatchException "+e);
                System.out.print("Entrer un nombre pour savoir s'il est premier: ");
                sc.nextLine();
            }
        }
        
        // Appler la fonction qui testera la primoté du nombre
        String str = isPrimary(nb) == true ? " est premier" : " n'est pas premier";
        System.out.println("Le nombre "+ nb + str);

        sc.close();
    }
}
