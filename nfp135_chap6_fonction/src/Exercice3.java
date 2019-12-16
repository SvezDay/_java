import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nbcoup = 0;
		int secret = (int) (Math.random() * 100) + 1;
		int proposition = -1;
		while (proposition != secret && nbcoup < 10) {
			nbcoup++;
			System.out.print("Coup n° " + nbcoup + " entrez votre proposition : ");
			proposition = sc.nextInt();
			sc.nextLine();
			if(proposition > secret) {
				System.out.println("Trop grand");
			}
			if(proposition < secret) {
				System.out.println("Trop petit");
			}
		}
		if(secret == proposition) {
			System.out.println("Vous avez trouvé en " + nbcoup + " coups");
		}else {
			System.out.println("Perdu !!!");
		}
		sc.close();
	}

}
