package org.streamdemo;

import org.collectionsdemo.Student;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {

        Student stu1=new Student("Taleah",3);
        Student stu2=new Student("Mary",25);
        Student stu3=new Student("Joby",30);

        List<Student> studentList=new ArrayList<>();
        studentList.add(stu1);
        studentList.add(stu2);
        studentList.add(stu3);

        //studentList.stream().sorted().forEach(s-> System.out.println(s));

        studentList.stream().reduce((s1,s2)->{
            if(s1.getAge()>s2.getAge()){
                return s1;
            }
            else{
                return s2;
            }
        }).ifPresent(s-> System.out.println("The oldest person is "+s.getName()));
    }
}
