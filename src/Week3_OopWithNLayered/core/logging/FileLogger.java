package Week3_OopWithNLayered.core.logging;

public class FileLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Dosyaya gönderilen data loglandı."+data);

    }
}
