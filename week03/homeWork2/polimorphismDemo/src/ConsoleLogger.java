public class ConsoleLogger extends DatabaseLogger {
    public void log(String message){
        System.out.println("Logged to Console : "+message);
    };
}
