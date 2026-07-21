package recursion;

public class SumOfDigits {
    public static int computeSumOfDigits(int num){
        if(num<10){
            return num;
        }
        int remainder=num%10;
        int result=remainder+computeSumOfDigits(num/10);

        return result;
    }
}
