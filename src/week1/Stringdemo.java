package week1;

public class Stringdemo {
    public static void main(String[] args){
        String message="Java is so enjoyable language!";
        System.out.println(message);
        System.out.println(message.length());
        System.out.println(message.startsWith("J"));
        System.out.println(message.endsWith("!"));
        String added=" Yuppi";
        System.out.println(message.concat(added));
         char []chars=new char[5];
         message.getChars(0,5,chars,0);
        System.out.println(chars);
        System.out.println( message.indexOf("a"));
        System.out.println( message.charAt(0));
        System.out.println( message.indexOf("a"));
        System.out.println( message.lastIndexOf("u"));



    }
}
