import java.util.Scanner;

public class Clavier{
    public static void main(String[] args){
        int x = 0;
        String str = "";

        Scanner sc = new Scanner(System.in);
        System.out.print(
            "Entrez un entier puis un texte : ");
        x = sc.nextInt();
        str = sc.nextLine();
        System.out.println(
            "Le texte lu est : " + x + " puis "+ str);
    }
}