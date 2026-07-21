package org.studentmanagement;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StudentManagerTests {

    StudentManager sm=new StudentManager();

    public StudentManagerTests() {
        System.out.println("Constructor called");
    }

    @Test
    @Order(2)
    public void addTests() throws DuplicateStudentException {
        Student s=new Student(1,"Taleah",25);
        sm.add(s);

        Assertions.assertEquals(1,sm.getStudents().size());

    }

    @Test
    @Order(1)
    public void findStudentTest() throws DuplicateStudentException {
        Student s=new Student(1,"Taleah",25);
        sm.add(s);
        Student result=sm.findStudent(1);
        Assertions.assertEquals(1,result.getId());
        Assertions.assertEquals("Taleah",result.getName());
    }



}
