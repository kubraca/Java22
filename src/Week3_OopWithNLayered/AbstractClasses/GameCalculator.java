package Week3_OopWithNLayered.AbstractClasses;

public abstract class GameCalculator {// abstract bir sınıf
    public abstract void Calculate();// abstract method extends edilmiş sınıflar tarafından override ediip kullanılır.

    public final void gameOver(){//Tamamlanmış operasyondur
        System.out.println("Game is over....");
    }

}
