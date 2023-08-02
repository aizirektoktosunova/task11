public class Student {
    public int contains;
    private int id;
    private String name;
    private String surname;
    private String gender;
    private int estimation;
    private int age;

    public Student(int id, String name, String surname, String gender, int estimation, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender.toString();
        this.estimation = estimation;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getEstimation() {
        return estimation;
    }

    public void setEstimation(int estimation) {
        this.estimation = estimation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", estimation=" + estimation +
                ", age=" + age +
                '}';
    }
}
