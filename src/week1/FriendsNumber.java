package week1;

import java.util.Scanner;
public class FriendsNumber {
    public static void main(String[] args){
        System.out.println("Enter your numbers ");
        System.out.println("****************************");

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int number1=input.nextInt();
        System.out.println("****************************");
        System.out.println("Enter your second number: ");
        int number2=input.nextInt();
        int totalModNumber1=0;
        int totalModNumber2=0;
        for(int i=1; i<number1; i++){
            if(number1%i==0){
                totalModNumber1+=i;
            }
        }
        for(int i=1; i<number2; i++){
            if(number2%i==0){
                totalModNumber2+=i;
            }
        }
        if(totalModNumber2==number1 && totalModNumber1==number2){
            System.out.println("This numbers are friends numbers!");
        }
        else
            System.out.println("This numbers are not friends numbers!");
    }
}
