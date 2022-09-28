public class Main {
    public static void main(String[] args) {
        //class yapısı evrak koçanı gibidir. Her yeniden çağrıldığında yeni bir şablon gelir.
        CustomerManager customerManager=new CustomerManager();
        customerManager.add();
    }
}