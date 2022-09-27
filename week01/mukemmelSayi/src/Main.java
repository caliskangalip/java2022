public class Main {
    public static void main(String[] args) {
        int number =6;
        int calc=0;
        for (int i=1;i<number;i++){
            if (number%i==0){
                System.out.println(i);
                calc=calc+i;
            }
        }
        if (calc==number){
            System.out.println("Bu sayı mükemmel bir sayı!");
        }else {
            System.out.println("Bu sayı mükemmel bir sayı değil..");
        }
    }
}