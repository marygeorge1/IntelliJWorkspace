package sorting;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int[] nums={20,2,45,1,10,3,27};
        System.out.println("Bubble Sort"+Arrays.toString(BubbleSort.bubbleSort(nums)));
        System.out.println("Selection Sort"+Arrays.toString(SelectionSort.selectionSort(nums)));
        System.out.println("Insertion Sort"+Arrays.toString(InsertionSort.insertionSort(nums)));
    }
}
