package interfaces43to44;

public class Main {
    public static void main(String[] args) {

    //    ICustomerDal customerDal = new OracleCustomerDal(); // interface onu implement eden class ın referansını tutabilir
                                                            //polymorphism

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        //  customerManager.customerDal = new OracleCustomerDal(); // customerManager de private yapınca buna gerek kalmadı
        customerManager.add();

    }
}
