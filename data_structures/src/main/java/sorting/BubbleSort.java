package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] input){

        for(int i=0;i<input.length;i++){
            for(int j=0;j<input.length-i-1;j++){
                if(input[j]>input[j+1]){
                    int temp=input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                }
            }
            System.out.println(Arrays.toString(input));
        }
        return input;
    }
}
