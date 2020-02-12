/**
 * Fonction principale du programme sudoku
 */

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.ArrayList;

import pkg.Sudoku;

public class Main {
    public static void main(String[] args){
        char res;
        String path;
        //int[][] grille = new int[9][9];
        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Démarrage du programme de résolution de sudoku !");

        // Initialisation du sudoku par un fichier
        System.out.print("Souhaitez-vous utiliser une grille depuis un fichier ? y or n : ");
        
        while(!sc.hasNext("[yn]")){
            System.out.println("Merci de répondre par y: yes ou n: non !");
            sc.next();
        }
        res = sc.next().charAt(0);

        if(res == 'y'){
            // Demande de fichier 
            System.out.print("Indiquer le chemin du fichier depuis root :");
            path = sc.nextLine();

            // Récupération de la grille du sudoku
            //grille = ?

        }else{
            
            // Initialisation du sudoku par un fichier
            System.out.print("Souhaitez-vous utiliser une grille depuis une lecture au clavier ? y or n : ");
            
            while(!sc.hasNext("[yn]")){
                System.out.println("Merci de répondre par y: yes ou n: non !");
                sc.next();
            }
            res = sc.next().charAt(0);

            // Initialisation du sudou au clavier
            if(res == 'y'){
                // Lire au clavier
                System.out.println("Vous pouvez commencer la saisie de la grille !");
                while(
                    sc.hasNextInt()){
                    array.add(sc.nextInt());
                }
                ArrayList<Integer> list = new ArrayList<Integer>(sc.nextInt());
                while( !list.isEmpty() ) {
                    System.out.println("in the while");
            
                    if (list.isEmpty()) {
                        System.out.println("Read Enter Key.");
                    }
            
                    if (sc.hasNextInt()) {
                        list = new ArrayList<Integer>(sc.nextInt());
                    } else {
                        list = new ArrayList<Integer>();
                    }
                }
                System.out.println("out of the while");
                
            }else{
                int[][] grille = {
                     {3,0,0,0,5,0,0,0,2}
                    ,{0,6,0,0,1,7,4,3,0}
                    ,{0,2,0,0,0,3,7,0,0}
                    ,{0,0,0,0,6,5,0,7,0}
                    ,{5,0,0,0,0,0,0,0,8}
                    ,{0,8,0,1,3,0,0,0,0}
                    ,{0,0,2,3,0,0,0,1,0}
                    ,{0,7,8,9,2,0,0,6,0}
                    ,{1,0,0,0,7,0,0,0,4}
                };
                Sudoku.resolution(grille);

            }


        } // Fin de la méthode main



        // Fin de lecture au clavier
        sc.close();
    }

    /**
     * Méthode randomize pour initialiser 
     */
}