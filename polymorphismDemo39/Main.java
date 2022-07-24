package polymorphismDemo39;

public class Main {
    public static void main(String[] args) {
        /*EmailLogger emailLogger= new EmailLogger();
        emailLogger.Log("Log Message");

        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.Log("Log");*/


       /* BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger()};
        for (BaseLogger logger : loggers){
            logger.Log("Log Message");
        }*/

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();

    }
}
