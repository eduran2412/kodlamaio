package overriding40;

public class Main {
    public static void main(String[] args) {

        /*OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        double res = ogretmenKrediManager.hesapla(1000);
        System.out.println(res);*/

        BaseKrediManager[] krediManagers = new BaseKrediManager[]
                {new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};

        for (BaseKrediManager krediManager: krediManagers){
          double res=   krediManager.hesapla(1000); // polymorphism
            System.out.println(res);
        }
    }
}
