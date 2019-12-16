
public class Exercice8 {

	public static void main(String[] args) {
		double tab[] = new double[15];
		for(int i=0;i<tab.length;i++) {
			tab[i] = Math.random() * 500 ;
		}
		double min = tab[0];
		for(int i=0;i<tab.length;i++) {
			if(min > tab[i]) {
				min = tab[i];
			}
		}
		System.out.println("La valeur minimale est " + min);

	}

}
