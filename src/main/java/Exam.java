

class Exam {
    private String name;
    private Exam other;
    public Exam(String name) {
        this.name = name;
        System.out.println(name);
    }
    public void setExam(Exam exam) {
        other = exam;
        System.out.println(other);
    }
}

