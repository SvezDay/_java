

public class Exercice2 {
	public static void main(String[] args) {
	
		
		System.out.println("Tables de multiplication ");
		for(int i=1;i<11;i++) {
			for(int j = 1 ; j < 11; j++) {
				int res = i * i;
				System.out.print(i + " * " + j + " = " + res + "  ");
			}
			System.out.println();
		}
	}
}
