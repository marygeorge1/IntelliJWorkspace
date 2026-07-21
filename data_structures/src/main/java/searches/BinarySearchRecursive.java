package searches;

public class BinarySearchRecursive {

    public static int binarySearchRecursive(int[] input,int element,int left,int right){
        int index=-1;

        if(left<=right){
            int mid=(left+right)/2;
            if(input[mid]==element){
                index=mid;
            }
            else if(element>input[mid]){
                index=binarySearchRecursive(input,element,mid+1,right);
            }
            else if(element<input[mid]){
                index= binarySearchRecursive(input,element,left,mid-1);
            }

        }

        return index;

    }
}
