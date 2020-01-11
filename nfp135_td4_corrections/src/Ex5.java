
public class Ex5 {

	public static void main(String[] args) {
		int x = 15;
		int y = 456;
		
		System.out.println("Valeur de x avant : " + x + " et  valeur de y avant " + y);
		int z = x;
		x = y;
		y = z;
		System.out.println("Valeur de x après : " + x + " et  valeur de y après " + y);
		

	}

}
