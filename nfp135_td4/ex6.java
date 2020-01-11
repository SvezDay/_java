import java.util.*;
// permuter des valeurs lues au clavier
public class ex6 {

    public static void main(String[] args){
        int x, y;
        Scanner in = new Scanner(System.in);

        System.out.print("Donne moi un nombre entier");
        x = in.nextInt();
        in.nextLine();
        
        System.out.print("Donne moi un nombre entier");
        y = in.nextInt();
        in.nextLine();

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x: "+x+" y: "+y);
        in.close();

    }
}