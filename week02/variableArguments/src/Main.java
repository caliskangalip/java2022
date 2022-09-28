public class Main {
    public static void main(String[] args) {
        addUp(39,39,14,11,7);
    }
    public static int addUp(int... numbers){
        int total=0;
        for (int number:numbers){
            total+=number;
        }
        showTotal(total);
        return total;
    }
    public static void showTotal(int incomingTotal){
        System.out.println("Total : "+incomingTotal);
    }
}