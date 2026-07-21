package org.studentmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentManager {

    List<Student> students=new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void add(Student s) throws DuplicateStudentException {

        if(students.contains(s)){
            throw new DuplicateStudentException("Student already present in the list");
        }
        else{
            students.add(s);
        }
    }

    public Student findStudent(int id){

        Student stu=null;
        List<Student> theStudent=students.stream().filter(s->s.getId()==id).collect(Collectors.toList());
        if(theStudent.size()>0){
            stu=theStudent.get(0);
        }
        return stu;
    }

    public void removeStudent(int id){
        List<Student> theStudent= students.stream().filter(s->s.getId()==id).collect(Collectors.toList());
        students.remove(theStudent.get(0));
    }

    

}
