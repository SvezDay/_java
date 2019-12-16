// Fontion qui affiche un tableau d'entiers
package chap6;

public class DisplayArray{
    public void display(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i != (arr.length - 1)){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
