import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("la première valeur ");
		int x = sc.nextInt();
		sc.nextLine();
		
		System.out.print("la seconde valeur ");
		int y = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Valeur de x avant : " + x + " et  valeur de y avant " + y);
		y = y + x;
		x = y - x;
		y = y - x;
		
		System.out.println("Valeur de x après : " + x + " et  valeur de y après " + y);
		
		sc.close();
	}

}
