package Week3_OopWithNLayered.AbstractDemo;

public class MainManager {
    public static void main(String[] args){
        CustomerManager customerManager=new CustomerManager();
        customerManager.databaseManager1=new OracleDatabaseManager();
        customerManager.getCustomers();
    }
}
