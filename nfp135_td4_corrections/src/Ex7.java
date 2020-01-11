import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("la première valeur ");
		double x = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("la seconde valeur ");
		double y = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Valeur de x avant : " + x + " et  valeur de y avant " + y);
		y = y + x;
		x = y - x;
		y = y - x;
		
		System.out.println("Valeur de x après : " + x + " et  valeur de y après " + y);
		
		sc.close();

	}

}
