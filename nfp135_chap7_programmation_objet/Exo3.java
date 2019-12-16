/*
L'algorithme n'est pas terminé mais la recherche des nombres premiers est fonctionnel.
Donc j'arrête le développement à ce niveau.
*/
// import java.util.*;
import java.util.Vector;
public class Exo3 {

    private static boolean[] booleanArray(int taille){
        boolean[] arr = new boolean[taille];
        for(int i = 0; i < taille; i++){
            arr[i] = true;
        }
        return arr;
    }
    private static void displayIntArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    private static void displayBooleanArray(boolean[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(i + ": " + arr[i]);
        }
    }
    private static void calculatePrimaryNumber(boolean[] arr){
        for(int j = 2; j < arr.length; j++){
            System.out.println("**********************************");
            int num = 0;
            System.out.print(j+" :: ");
            for(int i = 2; i < j; i++){
                if((j % i) == 0){
                    num++;
                }
                System.out.print(i+" /");
            }
            if(num == 0){
                arr[j] = false;
            }
        }
    }
    private static int[] listing(boolean[] arr){
        Vector<Integer> vec = new Vector<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == false){
                vec.add(i);
            }
        }
        System.out.println("capacity du vector"+ vec.capacity());
        return new int[20];
    }
    public static void main(String[] args){
        boolean[] arr = booleanArray(10);
        displayBooleanArray(arr);
        System.out.println("**********************************");
        calculatePrimaryNumber(arr);
        displayBooleanArray(arr);
        listing(arr);
        //displayArray(arr);
        // System.out.println("**: " + (5 % 1));
        // System.out.println("**: " + (5 % 2));
        // System.out.println("**: " + (5 % 3));
        // System.out.println("**: " + (5 % 4));
        // System.out.println("**: " + (5 % 5));
        // System.out.println("**: " + (5 % 6));
        System.out.println("**: " + (4 % 2));
    }
}