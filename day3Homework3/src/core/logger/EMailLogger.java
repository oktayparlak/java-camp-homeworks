package core.logger;

public class EMailLogger implements Logger {
    @Override
    public void log() {
        System.out.println("EMail'e loglandı!");
    }
}
