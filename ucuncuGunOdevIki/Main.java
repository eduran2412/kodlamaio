package ucuncuGunOdevIki;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setAge(22);
        student1.setId(1);
        student1.setName("Ali");

        StudentManager studentManager1 = new StudentManager();
        studentManager1.login(student1);
        studentManager1.startCourse();

        Instructor instructor1 = new Instructor();
        instructor1.setId(1);
        instructor1.setName("Veli");
        instructor1.setBranch("Java");

        InstructorManager instructorManager1 = new InstructorManager();
        instructorManager1.login(instructor1);
        instructorManager1.addCourse();






    }
}
