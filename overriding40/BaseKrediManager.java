package overriding40;

public class BaseKrediManager {

    public /*final*/ double hesapla(double tutar){ // final eklenirse override yapılamaz metot üzerine

        return tutar*1.18;
    }
}
