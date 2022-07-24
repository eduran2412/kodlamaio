package methodOverloading36;

public class DortIslem {
    public int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }
    public int topla2 (int... sayi){
       int toplam= 0;
        for (int say:sayi){
            toplam += say;
        }
        return toplam;
    }

}
