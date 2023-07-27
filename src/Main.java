public class Main {
    public static void main(String[] args) {
        Student student  = new Student();
        Course course = new Course();

        ServiceImpl service = new ServiceImpl();
        System.out.println(service.findById(course, 3));
    }
}