package classesWithAttributes33to35;

public class Product {
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    public Product() {
        System.out.println("Parametresiz Constructor Çalıştı");
    }

    public Product(int id, String name, String description, double price, int stockAmount, String renk) {

        System.out.println("Parametreli Constructor çalıştı");
        this.id = id;
        this.name= name;
        this.description = description;
        this.price = price;
        this.stockAmount=stockAmount;
        this.renk=renk;
    }

    public int getId() { // getter
        return id;
    }

    public void setId(int id) { // setter
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0, 1) + id;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
}
