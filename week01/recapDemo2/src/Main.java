public class Main {
    public static void main(String[] args) {
        double[] myList={1.5,1.3,4.3,5.6};
        double total=0;
        for (double number:myList){
            System.out.println(number);
            total+=number;
        }
        System.out.println("Toplam = "+total);
        double max=myList[0];
        for (double number:myList){
            if (max<number){
                max=number;
            }
        }
        System.out.println("En büyük sayı "+max);
    }
}