package core.logger;

public class FileLogger implements Logger{
    @Override
    public void log() {
        System.out.println("Dosyaya loglandı!");
    }
}
