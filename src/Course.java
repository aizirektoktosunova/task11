import java.util.Arrays;

public class Course {
    private int id;
    private String courseName;
    private int price;
    private Student[] students;

    public Course(int id, String courseName, int price, Student[] students) {
        this.id = id;
        this.courseName = courseName;
        this.price = price;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", price=" + price +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
