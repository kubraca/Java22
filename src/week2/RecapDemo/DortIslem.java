package week2.RecapDemo;

public class DortIslem {
    public int topla(int num1, int num2) {
        return num1 + num2;
    }

    public int cıkar(int num1, int num2) {
        if (num1 > num2) {
            return num1 - num2;
        } else return num2 - num1;
    }

    public int carp(int num1, int num2) {
        return num1 * num2;
    }

    public void bol(int num1, int num2) {
        if (num2 != 0 && num1 !=0 ) {
            System.out.println( num1 / num2);
        } else if (num1 == 0) {
            System.out.println( 0);
        } else if (num2==0) {
            System.out.println("Bolunemez");
        }
    }
}