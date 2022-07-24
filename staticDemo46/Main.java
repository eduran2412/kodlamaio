package staticDemo46;

public class Main {
    public static void main(String[] args) {

        ProductManager manager = new ProductManager();
        Product product1 = new Product();
        product1.name= "Mouse";
        product1.price= 10;
        product1.id=1;
        manager.add(product1);

        DatabaseHelper.Crud.create();

    }
}
