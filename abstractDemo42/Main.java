package abstractDemo42;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new MySqlDatabaseManager(); // Strategy pattern
        customerManager.getCustomers();
    }
}
