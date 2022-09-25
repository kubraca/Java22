public class LoopDemo {
    public static void main(String[] args) {
        int num = 12;
        for (int i = 1; i < num; i++) {
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti");
        int x = 1;
        while (x < 10) {
            System.out.println(x);
            x += 2;
        }
        System.out.println("While döngüsü bitti");
        //Do-while döngüsü
        int j = 100;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("Do-while döngüsü bitti");
    }
}

