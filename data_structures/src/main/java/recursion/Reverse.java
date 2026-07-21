package recursion;

public class Reverse {
    static int rev=0;
    public static int reverseTheNumber(int num){
        if(num<=0){
            return 0;
        }
        int remainder=num%10;
        if(num>10){
            rev=(rev+remainder)*10;
        }
        else{
            rev=(rev+remainder);
        }

        reverseTheNumber(num/10);

        return rev;
    }
}
