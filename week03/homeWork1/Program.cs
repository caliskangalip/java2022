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
    customer.NationalIdentity="123456789";
    
    Console.WriteLine(customer.FirstName+" "+ customer.LastName);
    creditManager.Save(customer);
    
    CustomerManager customerManager=new CustomerManager(customer);
    customerManager.Save();
    customerManager.Delete();
    
    Company company=new Company();
    company.FirstName="Çakmaktaşlar Ltd";
    company.TaxNumber="456789";
    
    CustomerManager customerManager2=new CustomerManager(company);
    customerManager2.Save();
    customerManager2.Delete();
    
    Console.ReadLine();
    }
  }
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
  class Customer
  {
  public Customer()
  {
  Console.WriteLine("Müşteri nesnesi başlatıldı");
  }
  public int Id{get; set;}
  public string FirstName {get; set;}
  public string LastName {get; set;}
  public string NationalIdentity {get; set;}
  }
  class Company : Customer
  {
  public string TaxNumber {get; set;}
  }
  class CustomerManager
  {
  private Customer _customer;
  public CustomerManager(Customer customer)
  {
  _customer = customer;
  }
  public void Save()
  {
  Console.WriteLine("Müşteri kaydedildi : "+_customer.FirstName);
  }public void Delete()
  {
  Console.WriteLine("Müşteri silindi : "+_customer.FirstName);
  }
  }
}
