package interfaces43to44;

public class CustomerManager {

    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }

    public void add() { // dalı çağıracak, iş kodları yazılır

        customerDal.add();
    }
}
