package core.logging;

public class EMailLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println(data + " emaile loglandı!");
    }
}
