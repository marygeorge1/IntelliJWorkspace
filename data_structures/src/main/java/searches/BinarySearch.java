package searches;

public class BinarySearch {
    public static int binarySearch(int[] input,int element){
        int left=0;
        int right=input.length-1;
        int index=-1;
        while(left<right){

            int mid=(left+right)/2;

            if(input[mid]==element){
                index=mid;
                break;
            }
            else if(element>input[mid]){
                left=mid+1;
            }
            else if(element<input[mid]){
                right=mid-1;
            }
        }

        return index;
    }
}
