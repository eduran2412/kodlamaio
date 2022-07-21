package ikinciGunOdevBir;

public class CourseManager {

    public CourseManager() {

    }

    public void addCourse(Course course){
        System.out.println(course.getName()+" kursu başarıyla eklendi");
    }
    public void deleteCourse(Course course){
        System.out.println(course.getName()+" kursu silindi!");
    }


}
