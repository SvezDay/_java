import java.util.*;

public class ex7 {

    public static void main(String[] args){
        double x, y;
        Scanner in = new Scanner(System.in);

        System.out.print("Donne moi un nombre");
        x = in.nextDouble();
        in.nextLine();
        
        System.out.print("Donne moi un nombre");
        y = in.nextDouble();
        in.nextLine();

        x = x + y;
        y = Math.round((x - y) * 100.0) / 100.0;
        x = Math.round((x - y) * 100.0) / 100.0;
        System.out.println("x: "+x+" y: "+y);
        in.close();
    }
}