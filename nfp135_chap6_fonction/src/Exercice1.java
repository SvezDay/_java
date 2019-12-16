import java.util.Scanner;
public class Exercice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez un entier : " );
		int table = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Table des " + table + " : " );
		for(int i=1;i<11;i++) {
			int res = i * table;
			System.out.println(table + " * " + i + " = " + res);
		}
		sc.close();
	}
}
