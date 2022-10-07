public abstract class GameCalculator {
    //abstract sınıflar (BASE durumunda olan) new olarak elde edilemez
    //abstract tanımlanmış metotlar alt sınıflarda YAZILMALIDIR!
    public abstract void hesapla();

    //final tanımlanmış metotlar alt sınıflarda yeniden yazılamaz!
    public final void gameOver(){
        System.out.println("Oyun bitti");
    }
}
