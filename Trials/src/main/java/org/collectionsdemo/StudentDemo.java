package org.collectionsdemo;

import java.util.*;

public class StudentDemo {
    public static void main(String[] args) {

        Student stu1=new Student("Taleah",3);
        Student stu2=new Student("Mary",25);
        Student stu3=new Student("Joby",30);
        Student stu4=new Student("Joby",30);

        System.out.println("---------Array List--------");
        //Arraylist
        List<Student> studentList=new ArrayList<>();
        studentList.add(stu1);
        studentList.add(stu2);
        studentList.add(stu3);

        System.out.println(studentList.get(1));

        System.out.println("---------Hash Set--------");
        //Hashset
        Set<Student> studentSet=new HashSet<>();
        studentSet.add(stu1);
        studentSet.add(stu2);
        studentSet.add(stu3);
        studentSet.add(stu4);

        for(Student s:studentSet){
            System.out.println(s);
        }

        System.out.println("---------Iterator--------");
        Iterator<Student> sitr=studentSet.iterator();
        while(sitr.hasNext()){
            System.out.println(sitr.next());
        }

        System.out.println("---------List Iterator--------");

        ListIterator<Student> lItr=studentList.listIterator();
        while (lItr.hasNext()){
            Student s=lItr.next();
            //s.setName("Student "+s.getName());

        }
        for(Student s:studentList){
            System.out.println(s);
        }

        System.out.println("---------Spliterator--------");

        Spliterator<Student> spliterator=studentList.spliterator();
        //while(spliterator.tryAdvance((s)->System.out.println(s)));
        spliterator.forEachRemaining((s)->System.out.println(s));


        System.out.println("---------Map--------");

        Map<String,Student> map=new HashMap<>();
        map.put("Taleah",stu1);
        map.put("Mary",stu2);
        map.put("Joby",stu3);

        System.out.println(map.get("Mary"));
        Set<Map.Entry<String,Student>> mapEntries=map.entrySet();
        for(Map.Entry<String,Student> entry:mapEntries){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("---------Comparator--------");

        Set<Student> students=new TreeSet<>();
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);

        for(Student s:students){
            System.out.println(s);
        }





    }
}
