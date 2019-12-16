package chap6;
public class Smaller {
    public int smaller(int[] arr){
        int res = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < res){
                res = arr[i];
            }
        }
        return res;
    }
}