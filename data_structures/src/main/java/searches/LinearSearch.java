package searches;

public class LinearSearch {

    public static int linearSearch(int[] input,int element){
        int index=-1;
        for(int i=0;i<input.length;i++){
            if(input[i]==element){
                index=i;
                break;
            }
        }
        return index;
    }
}
