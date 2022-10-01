package week2.PolimorfizmNewExpl;

public class CustomerManager2 {
    private BaseLogger logger;
    public CustomerManager2(BaseLogger logger){
        this.logger=logger;
    }
    public void add(){
        System.out.println("Customer is added.");
        this.logger.log("Log message!");
    }
}
