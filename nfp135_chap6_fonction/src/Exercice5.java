import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez un nombre : ");
		int nombre = sc.nextInt();
		sc.nextLine();
		int i = 2;
		System.out.println("l'ensemble des diviseur de " + nombre ); 
		while (i < nombre) {
			if(nombre % i == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		sc.close();

	}

}
