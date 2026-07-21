package org.enumdemo;

public enum Days {
    Sunday(),
    Monday(9),
    Tuesday(9),
    Wednesday(9),
    Thursday(9),
    Friday(10),
    Saturday(10);

    float hourlyRate;

    Days(float rate){
        this.hourlyRate=rate;
    }
    Days(){
        this.hourlyRate=-1;
    }
};

class EnumDemo{
    public static void main(String[] args) {

        for(Days day: Days.values()){
            System.out.println(day.ordinal());
        }
    }
}
