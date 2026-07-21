package sorting;

public class InsertionSort {
    public static int[] insertionSort(int[] input){
        for(int i=1;i< input.length;i++){

            int j=i-1;
            int key=input[i];

            while(j>=0 && input[j]>key){
                input[j+1]=input[j];
                j--;
            }
            input[j+1]=key;
        }

        return input;
    }
}
