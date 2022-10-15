package Week3_OopWithNLayered.Interfaces;

public class MySqlCustomerDal implements ICustomerDaI{
    //classlar 1den fazla interfacei impl. edebilir.Fakat yalnıca 1 sınıfı extnd eder.
    @Override
    public void Add() {
        System.out.println("Mysql added...");
    }
}
