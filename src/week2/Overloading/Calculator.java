package week2.Overloading;

public class Calculator {
    //MethodOverloading :The different number of parameters of the methods with the same name is called method overloading.
    public int sum(int num1,int num2, int num3){
        return num1+num2+num3;
    }
    public int sum(int num1,int num2){
        return num1+num2;
    }
    public int multiply(int num1,int num2){
        return num1*num2;
    }

}
