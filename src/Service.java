public interface Service {

    Student findByName(Course course,String name);
    Student findById(Course course,int id);
    double averageEstimation(Course course);
    int countGirlInCourse(Course course);
    int countBoyInCourse(Course course);
    Student[] getByAge(Course course,int age);
    void updateStudent(Course course, int studentId);
    int maxEstimation(Course course);




}
