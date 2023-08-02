import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student  = new Student(12,"Aiire","Toktosunova","FEMALE",7,19);
        Student student1  = new Student(32,"Aizirek","Toktosunova","FEMALE",5,22);
        Student student2  = new Student(2,"Aizire","Toktosunova","FEMALE",5,19);
        Student student3  = new Student(12,"Aiziret","Toktosunov","MALE",5,22);
        Student student4  = new Student(1,"Gaugar","Toktosunova","FEMALE",5,22);
        Student student5  = new Student(7,"Shirin","Toktosunova","FEMALE",4,27);
        Student student6  = new Student(4,"Aiirek","Toktosunova","FEMALE",5,19);
        Student student7  = new Student(12,"Aiziek","Toktosunova","FEMALE",4,19);
        Student[]students={student3,student1,student7,student4,student,student5,student6,student2};
        Course course = new Course(12,"java",12000,students);
        ServiceImpl service = new ServiceImpl();
        System.out.println(service.findById(course, 32));
        System.out.println(service.findByName(course, "Aizirek"));
        System.out.println(service.averageEstimation(course));
        System.out.println(service.countGirlInCourse(course));
        System.out.println(service.countBoyInCourse(course));
        System.out.println(service.maxEstimation(course));
       service.updateStudent(course,1);
        System.out.println(students[3]);
        for (Student student8 : service.getByAge(course, 22)) {
            System.out.println(student8);
        }


    }
}