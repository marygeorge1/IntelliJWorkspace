package searches;

public class MainApp {
    public static void main(String[] args) {

        int[] nums={12,22,32,33,45,60,75,78};
        System.out.println(LinearSearch.linearSearch(nums,60));
        System.out.println(BinarySearch.binarySearch(nums,60));
        System.out.println(BinarySearchRecursive.binarySearchRecursive(nums,60,0,nums.length));
    }
}
