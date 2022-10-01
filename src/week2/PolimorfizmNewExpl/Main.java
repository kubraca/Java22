package week2.PolimorfizmNewExpl;

public class Main {
    public static void main(String [] args){
        BaseLogger loggers[]= new BaseLogger []{new ConsoleLog(),new DatabaseLogger(),new FileLogger(),new EmaiLogger()};
        for(BaseLogger items:loggers){
            items.log("Log message from item.");
        }
        CustomerManager2 customerManager2=new CustomerManager2(new FileLogger());
        customerManager2.add();
    }

}
