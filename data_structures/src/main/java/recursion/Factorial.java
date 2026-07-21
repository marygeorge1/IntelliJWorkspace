package recursion;

public class Factorial {
    public static int computeFactorial(int num){
        if(num==1){
            return 1;
        }

        int result=num*computeFactorial(num-1);
        return result;
    }
}
