import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez un nombre : ");
		int nombre = sc.nextInt();
		sc.nextLine();
		int i = 2;
		while (nombre % i != 0) {
			i++;
		}
		if(i == nombre) {
			System.out.println(nombre + " est premier");
		}else {
			System.out.println(nombre + " n'est pas premier");
		}
		sc.close();

	}

}
