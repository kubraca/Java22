package Week3_OopWithNLayered.Interfaces;

public class CustomerManager {//iş katmanlarının yazılı sınıf
   private ICustomerDaI customerDaI;
    public CustomerManager(ICustomerDaI customerDaI){
        this.customerDaI=customerDaI;
    }
    public void add(){
        customerDaI.Add();
    }
}
