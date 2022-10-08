public class CreditManager extends BaseCreditManager implements ICreditManager{
    @Override
    public void calculate() {
        System.out.println("Hesaplandı");
    }
    public void save(){
        System.out.println("Kayıt edildi");
    }
}
