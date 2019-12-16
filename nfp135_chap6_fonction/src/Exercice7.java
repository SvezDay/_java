
public class Exercice7 {

	public static void main(String[] args) {
		double tab[] = new double[15];
		for(int i=0;i<tab.length;i++) {
			tab[i] = Math.random() * 500 ;
		}
		double somme = 0;
		for(int i=0;i<tab.length;i++) {
			somme = somme + tab[i] ;
		}
		double moyenne = somme / tab.length;
		System.out.println("La moyenne est de " + moyenne);
	}
}
