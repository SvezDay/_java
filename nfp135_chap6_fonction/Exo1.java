// App avec fonction retournant la moyenne de 4 entiers, avec le programme appellant
import java.util.Scanner;

public class Exo1 {

    private int moyenne(int a, int b, int c, int d){
        return (a + b + c + d) / 4;
    }

    private int[] appel(){
        int[] arr = {};
        Scanner in = new Scanner(System.in);
        System.out.println("Donner 4 nombres entiers séparés par un espaces :");
        arr.add(in.nextInt());
        arr.add(in.nextInt());
        arr.add(in.nextInt());
        arr.add(in.nextInt());
        in.close();
        return arr;
    }

    public static void main(String[] args){
        int[] arr = appel();
        System.out.println(arr);
    }
}