package week1;

public class AsalSayi {
    public static void main(String[] args) {
        int number = 21;
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Bu sayı asal sayıdır.");
        }
      else
            System.out.println("Bu sayı asal sayı değildir.");
        }
    }


