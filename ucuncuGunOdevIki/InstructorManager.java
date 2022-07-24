package ucuncuGunOdevIki;

public class InstructorManager extends UserManager{


    public void login(User user){
        System.out.println(user.getName()+" öğretmen girişi");
    }

    public void addCourse(){
        System.out.println("Kurs eklendi");
    }

}
