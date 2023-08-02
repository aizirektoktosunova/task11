import java.util.Scanner;

public class ServiceImpl implements Service {

    @Override
    public Student findByName(Course course, String name) {
        Student student1 = null;
        for (Student student : course.getStudents()) {
            if (student.getName().contains(name)) {
                student1 = student;
            }
        }
        return student1;
    }

    @Override
    public Student findById(Course course, int id) {
        Student student2 = null;
        for (Student student : course.getStudents()) {
            if (student.getId() == id) {
                student2 = student;
            }
        }
        return student2;
    }

    @Override
    public double averageEstimation(Course course) {
        int count = 0;
        for (Student student : course.getStudents()) {
            count += student.getEstimation();
        }
        return (double) count / course.getStudents().length;
    }

    @Override
    public int countGirlInCourse(Course course) {
        int countg = 0;
        for (Student student : course.getStudents()) {
            if (student.getGender().equals("FEMALE")) {
                countg++;
            }}

            return countg;
}

    @Override
    public int countBoyInCourse(Course course) {
    int countb=0;
        for (Student student : course.getStudents()) {
            if (student.getGender().equals("MALE")){
                countb++;
            }
        }
        return countb;
    }

    @Override
    public Student[] getByAge(Course course, int age) {
        Student[]newStudents=new Student[course.getStudents().length];
        for (int i = 0; i < course.getStudents().length; i++) {
            if (age==course.getStudents()[i].getAge()){
                newStudents[i]=course.getStudents()[i];
            }

        }

        return  newStudents;

    }

    @Override
    public void updateStudent(Course course, int studentId) {
        Scanner scanner= new Scanner(System.in);
        String a=scanner.nextLine();
        for (Student student : course.getStudents()) {
            if (student.getId() == studentId) {
            student.setName(a);
        }}}
    @Override
    public int maxEstimation(Course course) {
        int max=0;
        for (Student student : course.getStudents()) {
        if (max<student.getEstimation()){
            max=student.getEstimation();
        }}
        return max;
    }}

