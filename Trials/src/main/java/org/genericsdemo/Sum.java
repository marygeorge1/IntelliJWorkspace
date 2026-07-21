package org.genericsdemo;

public class Sum <T extends Number>{

    T obj1;
    T obj2;

    public Sum(T obj1,T obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }

    public int getIntegerSum(){
        return obj1.intValue()+obj2.intValue();
    }
}

class GenericsDemo{
    public static void main(String[] args) {
        Sum<Float> ref=new Sum<Float>(10.50F,25.40F);
        System.out.println(ref.getIntegerSum());
        Integer[] numArray={10,20,30,40,50};
        System.out.println(GenMethodDemo.isIn(20,numArray));
    }
}

class GenMethodDemo{
    static <T ,V>boolean isIn(T num,V[] arr){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }
}
