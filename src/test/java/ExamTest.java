import static org.junit.Assert.*;

public class ExamTest {

    @org.junit.Test

        public void myMethod(){
            int result = 88;
            if (result > 78) {
                Exam myExam1 = new Exam();
                myExam1.setName("Android");
            }
            else {
                Exam myExam2 = new Exam();
                myExam2.setName("MySQL");
            }
        }


    }
