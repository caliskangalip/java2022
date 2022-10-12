package core.logging;

public class EmailLogger implements Logger{
    public void log(String text){
        System.out.println("Log kaydı eposta olarak gönderildi : "+ text);
    }
}
