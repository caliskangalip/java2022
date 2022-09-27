public class Main {
    public static void main(String[] args) {
        //For loop
        for (int i=0;i<=10;i+=2){
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti");

        //While loop
        int i=0;
        while (i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("While döngüsü bitti");

        //Do While loop
        do {
            System.out.println(i);
            i--;
        }while (i>0);
        System.out.println("Do While döngüsü bitti");
    }
}