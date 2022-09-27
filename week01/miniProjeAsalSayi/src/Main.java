public class Main {
    public static void main(String[] args) {
        //My own solution
        int number =1;
        boolean asalMi= true;
        for (int i=2;i<number;i++){
            if (number%i==0 || 2>number){
                System.out.println("bölündü : "+i+number);
                asalMi=false;
            }
        }
        if (asalMi){
            System.out.println("Sayınız asaldır");
        }else {
            System.out.println("Sayınız asal değildir");
        }
        //Engin's solution
        //Solution is matching
    }
}