package staticDemo46;
// ürünü kaydederken , güncellerken kurallara uygun olup olmadığının kontrolü
public class ProductValidator {

    static {
        System.out.println("Static Constructor Çalıştı");
    }

    public ProductValidator(){
        System.out.println("ProductValidator new lendi ,Constructor Çalıştı");
    }

    public static boolean isValid(Product product){
        if (product.price>0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
    public void bisey(){
        System.out.println("Bisey fonksiyonu çalıştı");
    }

    /*public static class BaskaBirClass{ // inner class
        public static void sil(){
        }
    }*/
}
