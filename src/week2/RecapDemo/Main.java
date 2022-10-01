package week2.RecapDemo;

public class Main {
    public static void main(String[]args){
        DortIslem dortIslem = new DortIslem();
       int toplam= dortIslem.topla(2,3);
        System.out.println(toplam);
       int carpım= dortIslem.carp(5,7);
        System.out.println(carpım);
       int cıkarma= dortIslem.cıkar(2,5);
        System.out.println(cıkarma);
        dortIslem.bol(8,2);
    }

}
