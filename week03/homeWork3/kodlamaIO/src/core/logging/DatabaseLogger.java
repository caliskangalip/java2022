package core.logging;

public class DatabaseLogger implements Logger{
    public void log(String text){
        System.out.println("Database log kaydı yapıldı : "+text);
    }
}
