import java.util.Scanner;

class LectString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un texte : ");
        String x = sc.nextLine();
        System.out.println("Le texte lu est : " + x);
    }
}