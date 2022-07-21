package ikinciGunOdevBir;

public class Main {
    public static void main(String[] args) {

        Instructor instructor1 = new Instructor(1,"Ali","Backend");
        Instructor instructor2 = new Instructor(2,"Ahmet","Frontend");

        Course course1 = new Course(1,"Java","two months");
        Course course2 = new Course(2, "JavaScript","two months");
        Course course3 = new Course(3,"Angular","one month");


        Instructor [] instructors = {instructor1,instructor2};
        Course [] courses = {course1,course2,course3};


        for (Instructor instructor: instructors) {
            System.out.println("Egitmen : " + instructor.getName());
        }

        for (Course course:courses) {
            System.out.println("Kurslar : "+course.getName());
        }

        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course1);
        courseManager.addCourse(course2);
        courseManager.addCourse(course3);

    }
}
