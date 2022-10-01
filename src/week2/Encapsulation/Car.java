package week2.Encapsulation;

import java.time.LocalTime;

public class Car {
    private String name;// I have to choose private access modifier for store the  attributes.Because I dont want to change my variables
    // attributes from  any other coder. This is relative about Encapsulation.
    private String id;
    private double price;
    private String color;

    public Car(String name,String id,double price,String color){ // I did default constructor with parameters.
        System.out.println("Yapıcı blok çalıştı");
        this.name=name;
        this.id=id;
        this.price=price;
        this.color=color;
    }

    public String getId(){
       return  this.id;
    }
    public void setId(String id){
        this.id=id;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price=price;
    }
}
