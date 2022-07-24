package classesWithAttributes33to35;

public class Main {
    public static void main(String[] args) {


        Product product= new Product(1,"Laptop","Asus Laptop",5000,3,"Beyaz");

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Laptop2");
        product2.setPrice(8000);
        product2.setDescription("Lenovo Laptop");
        product2.setStockAmount(5);



        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());

    }

}
