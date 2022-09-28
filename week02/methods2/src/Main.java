public class Main {
    public static void main(String[] args) {
        String name="Galip";
        int yearOfBirth=2015;
        sayHello(name);
        evaluateForAge(yearOfBirth);
    }
    public static void showMessage(String text){
        System.out.println(text);
    }
    public static void sayHello(String incomingName){
        showMessage("Hello!");
        showMessage("Welcome Mr. "+ incomingName);
        showMessage("When were you born?");
    }
    public static void evaluateForAge(int incomingYear){
        showMessage("Really, oh! "+incomingYear);
        int age = 2022-incomingYear;
        if (12<age && age<100){
            showMessage("Congratulations you are "+age);
        }else {
            showMessage("You are kidding!");
            showMessage("Ha ha ha "+age+" years..");
        }
    }
}