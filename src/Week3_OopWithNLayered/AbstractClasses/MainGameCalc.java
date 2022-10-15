package Week3_OopWithNLayered.AbstractClasses;

public class MainGameCalc {
    public static void main(String [] args){
      /*  GameCalculator gamer1=new GameCalculator() { abstract sınıftan obje türetemeyiz o sınıfın methodlarını kullanmak isteriz sadece
            @Override                                  kendisini miras alan sınıflardan obje üretip kullanırız abstract sınıf methodlarını
            public void Calculate() {

            }
        }*/
        GameCalculator womenGamer1=new WomanGameCalculator();
        womenGamer1.Calculate();
        womenGamer1.gameOver();
        System.out.println("*******************************");
        GameCalculator kidsGamer1=new KidsGameCalculator();
        kidsGamer1.gameOver();
        kidsGamer1.Calculate();

    }
}
