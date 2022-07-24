package polymorphismDemo39;

public class FileLogger extends BaseLogger{

    public void log(String message){
        System.out.println("Logged to File : "+message);
    }

}
