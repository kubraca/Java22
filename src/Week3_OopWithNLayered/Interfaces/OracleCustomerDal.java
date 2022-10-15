package Week3_OopWithNLayered.Interfaces;

public class OracleCustomerDal implements ICustomerDaI {
    @Override
    public void Add() {
        System.out.println("Oracle database added..");
    }
}
