using System;

namespace HelloWorld
{
  class Program
  {
    static void Main(string[] args)
    {
    CreditManager creditManager=new CreditManager();
    creditManager.Calculate();
    creditManager.Calculate();
    
    Customer customer=new Customer();
    customer.Id=1;
    customer.FirstName="Galip";
    customer.LastName="ÇALIŞKAN";
    customer.City="Ankara";
    customer.NationalIdentity="123456789";
    
    Console.WriteLine(customer.FirstName+" "+ customer.LastName);
    creditManager.Save(customer);
    
    CustomerManager customerManager=new CustomerManager(customer, new TeacherCreditManager());
    customerManager.Save();
    customerManager.Delete();
    
    Company company=new Company();
    company.FirstName="Çakmaktaşlar Ltd";
    company.TaxNumber="456789";
    
    CustomerManager customerManager2=new CustomerManager(company, new MilitaryCreditManager());
    customerManager2.Save();
    customerManager2.GiveCredit();
    customerManager2.Delete();
    
    Console.ReadLine();
    }
  }
    //==========================Credit==========================
    
  class CreditManager
  {
  public void Calculate()
  {
  Console.WriteLine("Hesaplandı");
  }
  public void Save(Customer customer)
  {
  Console.WriteLine("Kredi verildi : "+customer.FirstName+" "+customer.LastName);
  }
  }
  interface ICreditManager
  {
  void Calculate();
  void Save();
  }
  
  class TeacherCreditManager : BaseCreditManager, ICreditManager
  {
  	public override void Calculate()
    {
    Console.WriteLine("Öğretmen kredisi hesaplandı");
    }
  }
  
  class MilitaryCreditManager : BaseCreditManager, ICreditManager
  {
  public override void Calculate()
    {
    Console.WriteLine("Asker kredisi hesaplandı");
    }
  }
  
    abstract class BaseCreditManager : ICreditManager
  {
  	//Calculate fonksiyonu abstract olduğu için alt sınıflarda tanımlanmalıdır!
  	public abstract void Calculate();
    public void Save()
    {
    	Console.WriteLine("Kaydedildi");
    }
  }
  
  //==========================Customer==========================
  class Customer
  {
  public Customer()
  {
  Console.WriteLine("Müşteri nesnesi başlatıldı");
  }
  public int Id{get; set;}
  public string City {get; set;}
  public string FirstName {get; set;}
  public string LastName {get; set;}
  public string NationalIdentity {get; set;}
  }
  
  
  class Person : Customer
  {
  }
  class Company : Customer
  {
  public string TaxNumber {get; set;}
  }
  
  
  class CustomerManager
  {
  private Customer _customer;
  private ICreditManager _creditManager;
  
  public CustomerManager(Customer customer, ICreditManager creditManager)
  {
  _customer = customer;
  _creditManager = creditManager;
  }
  
  public void Save()
  {
  	Console.WriteLine("Müşteri kaydedildi : "+_customer.FirstName);
  }
  public void Delete()
  {
  	Console.WriteLine("Müşteri silindi : "+_customer.FirstName);
  }
  public void GiveCredit()
  {
  	_creditManager.Calculate();
    Console.WriteLine("Kredi verildi : "+_customer.FirstName);
  }
  }
}
