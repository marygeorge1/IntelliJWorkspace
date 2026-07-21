package recursion;

public class MainApp {
    public static void main(String[] args) {
        //Write a function that prints first n numbers
        display(1);
        System.out.println(Factorial.computeFactorial(5));
        System.out.println(SumOfDigits.computeSumOfDigits(1234));
        System.out.println(Reverse.reverseTheNumber(12304));
        System.out.println(CountOfZeroes.computeCount(120010));
        int[] arr=new int[]{10,20,30,40,50};
        System.out.println(SortedArray.check(arr));
    }
    public static void display(int num){
        System.out.println(num);
        if(num==5) {
            return;
        }
        display(num+1);
        
    }
}
