package core.logger;

public class DatabaseLogger implements Logger {
    @Override
    public void log() {
        System.out.println("Veritabanına loglandı!");
    }
}
