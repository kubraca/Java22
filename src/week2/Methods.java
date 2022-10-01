package week2;

public class Methods {
    public static void main(String[] args){
    String message="Today, weather is beautiful";
    sumNumbers(5,7);
    update();
    }
    public static void update(){
        System.out.println("This numbers are updated!");
    }
    public static int sumNumbers(int num1, int num2){
        return num1+num2;
    }
    public static String message(String message){
        return message;
    }
}
