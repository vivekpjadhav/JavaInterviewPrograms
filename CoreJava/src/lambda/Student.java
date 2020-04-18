package lambda;

public class Student {
    private String name;
    private int hight;
    private float gpa;

    public Student(String name, int hight, float gpa) {
        this.name = name;
        this.hight = hight;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getHight() {
        return hight;
    }

    public float getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", hight=" + hight +
                ", gpa=" + gpa +
                '}';
    }
}
