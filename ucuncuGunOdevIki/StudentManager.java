package ucuncuGunOdevIki;

public class StudentManager extends UserManager{


    public void login(User user){
        System.out.println(user.getName()+" öğrenci girişi");
    }
    public void startCourse(){
        System.out.println("Kurs başlatıldı");
    }

}
