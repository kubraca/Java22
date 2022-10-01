package week1;

public class SwitchDemo {
    public static void main(String[]args){
        char grade='A';
        switch (grade){
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
            case 'B':
                System.out.println("B ile geçtiniz");
            case 'C':
                System.out.println("C ile geçtiniz");
            case 'D':
                System.out.println("D ile geçtiniz");
            case 'F':
                System.out.println("Maalesef geçemediniz");
                break;
        }
    }
}
