package recursion;

import java.util.Arrays;

public class SortedArray {

    static boolean isSorted=true;
    static int index=0;

    public static boolean check(int[] arr){

        if(index>=arr.length-1){
           return true;
        }

        if(arr[index]<arr[index+1]){
            index++;
            check(arr);
        }
        else{
            isSorted=false;
        }

        return isSorted;

    }
}
