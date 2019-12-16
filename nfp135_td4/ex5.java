import java.util.*;

// problème de static method et de pointeur

public class ex5 {

    // Fonction de permutation
    public int permut(int x, int y){
        return x;

    }

    public static void main(String[] args){
        int x = 10;
        int y = 20;
        System.out.println("x: " + x + ", y: " + y);
        permut(x, y = x);
        System.out.println("x: " + x + ", y: " + y);
    }
}