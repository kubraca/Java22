package week1;

public class PerfectNumbers {
public static void main (String[]args){
    // 6-> 1,2,3,
    int number=27;
    int modNumber=0;
    for(int i=1; i<number; i++){
       if (number%i==0){
           modNumber+=i;
       }
    }
    if(modNumber==number){
        System.out.println("This number is perfect!");
    }
    else {
        System.out.println("This number is not perfect number!");
    }
}
}
