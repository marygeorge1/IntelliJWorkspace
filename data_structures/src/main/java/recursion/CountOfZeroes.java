package recursion;

public class CountOfZeroes {

    static int count=0;

    public static int computeCount(int num){

        if(num<10){
            if(num==0){
                count++;
            }
            return count;
        }

        int remainder=num%10;
        if(remainder==0){
            count++;
        }

        computeCount(num/10);


        return count;
    }
}
