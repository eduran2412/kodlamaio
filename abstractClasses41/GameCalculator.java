package abstractClasses41;

public abstract class GameCalculator {

 /*   public void hesapla(){
        System.out.println("Puanınız : 100");
    }*/
    public abstract void hesapla();

    public final void gameOver(){
        System.out.println("Oyun Bitti!");
    }
}
