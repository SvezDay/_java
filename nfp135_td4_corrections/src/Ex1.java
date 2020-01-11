import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez la valeur en francs : ");
		double fr = sc.nextDouble();
		sc.nextLine();
		double eu = fr / 6.55957;
		System.out.println(fr + " francs = " + eu + " euros");
		sc.close();
	}

}
