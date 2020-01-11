import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("la première valeur ");
		int x = sc.nextInt();
		sc.nextLine();
		
		System.out.print("la seconde valeur ");
		int y = sc.nextInt();
		sc.nextLine();

		System.out.print("la troisème valeur ");
		int z = sc.nextInt();
		sc.nextLine();
		
		double moy2 = ((double) (x + y + z)) / 3;
		System.out.println("La moyenne est : " + moy2);
		
		sc.close();
	}

}
