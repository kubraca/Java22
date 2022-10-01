package week2;
public class FindNumber {
    public static void main(String[] args){
        int[] numbers=new int[]{1,2,4,5,6,7,8};
        int findNum=4;
        boolean isFind=false;
        for(int number:numbers){
            if(number==findNum){
                isFind=true;
                break;
            }
        }
        if(isFind==true){
            System.out.println("Sayı bulundu!");
        }
        else
            System.out.println("Sayı bulunamadı!");
    }
}
