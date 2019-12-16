public class Ex2 {
	public static void main(String[] args) {
		int x = 15;
		int y = 789;
		int z = 13;
		double moy1 = (x + y + z) / 3;
		System.out.println("La moyenne est : " + moy1);

		double moy2 = ((double) (x + y + z)) / 3;
		// Transtypage
		// cast
		System.out.println("La moyenne est : " + moy2);

		char c = '0';
		int val = (int) c;
		System.out.println("c " + c  + " val " + val);
	}
}
