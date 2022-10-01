package week1;

public class ReCap {
    public static void main(String []args){
        int num1=26;
        int num2=23;
        int num3=20;
        int biggestNum=num1;
        if(num2>biggestNum){
            biggestNum=num2;
        }
        if(num3>biggestNum){
            biggestNum=num3;
        }
        System.out.println("The biggest number is:"+ biggestNum);
        int [] numbers={26,23,20};
        int total=0;
        for(int number:numbers){
            int max=numbers[0];
            if(max<number){
                max=number;
            }
            System.out.println(number);
            total+=number;
        }
        System.out.println("Total: "+total);
    }
}
