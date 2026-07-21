package sorting;

public class SelectionSort {
    public static int[] selectionSort(int[] input){
        int minIndex=-1;
        for(int i=0;i< input.length-1;i++){
            minIndex=i;
            for(int j=i+1;j<input.length;j++){
               if(input[j]<input[minIndex]){
                   minIndex=j;
               }
            }
            int temp=input[i];
            input[i]=input[minIndex];
            input[minIndex]=temp;
        }
        return input;
    }
}
