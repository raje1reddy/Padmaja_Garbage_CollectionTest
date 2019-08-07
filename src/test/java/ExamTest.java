import org.junit.Test;

import static org.junit.Assert.*;

public class ExamTest {

    Exam php = new Exam("PHP");
    Exam java = new Exam("Java");

    @Test
    public void setExam() {
        php.setExam(java);
        java.setExam(php);

        php = null;
        java = null;
    }

}



