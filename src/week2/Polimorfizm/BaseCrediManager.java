package week2.Polimorfizm;

public class BaseCrediManager {
    public void Calculate(){
        System.out.println("Kredi Hesaplandı.");
    }
    public double CalculateCrediForDepositAccount(double money, int month){
       double deposit=(money*month*365/100);
       return deposit;
    }

}
