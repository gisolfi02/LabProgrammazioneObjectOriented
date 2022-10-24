import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class StudentTest {
    Student newStudent = new Student("Andrea","Gisolfi");
    @Test
    public void TestStudent(){
        Assert.assertEquals("Andrea", newStudent.getFirstName());
        Assert.assertEquals("Gisolfi", newStudent.getLastName());
    }
    @Test
    public void TestAverage(){
        GregorianCalendar date = new GregorianCalendar();
        Exam exam = new Exam("aaa", date, 18);
        newStudent.registerExam(exam);
        Exam exam2 = new Exam("aaa", date, 30);
        newStudent.registerExam(exam2);
        Assert.assertEquals(24, newStudent.computeAverageGrade(),0);
    }
}
