package Week3_OopWithNLayered.core.logging;

public class DataLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Veri tabanına loglandı."+data);
    }
}
