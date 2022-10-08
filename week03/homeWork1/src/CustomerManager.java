public class CustomerManager {
    private Customer _customer;
    private ICreditManager _creditManager;
    public CustomerManager(Customer customer, ICreditManager creditManager){
        _customer=customer;
        _creditManager=creditManager;
    }
    public void save(){
        System.out.println("Müşteri kaydedildi : "+_customer.getName);
    }
}
