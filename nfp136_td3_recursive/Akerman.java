import java.util.*;
public class Akerman {
    public static int it = 0;
    public static int A(int m, int n){
        it++;
        
        // if(m > 20 || n > 20){
        //     System.out.println("It 1 : "+m+" - "+n);
        //     return 0;
        // }
        if(m==0){
            System.out.println("It 2 : "+m+" - "+n);
            n++;
        }
        if(m > 0 && n == 0 ){
            System.out.println("It 3 : "+m+" - "+n);
            return A(m-1, 1);
        }
        if(m > 0 && n > 0){
            System.out.println("It 4 : "+m+" - "+n);
            return A(m-1, A(m, n-1));
        }
        System.out.println("It : "+it);
        return m;
    }

    public static void main(String[] args){
        int res = A(15, 0);
    }
}