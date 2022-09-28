public class Main {
    public static void main(String[] args) {
        findNumber();

    }
    public static void findNumber(){
        int[] numbers =new  int[]{1,2,5,7,9,0};
        int willFind=6;
        boolean isThere=false;
        for (int number:numbers){
            if (number==willFind){
                isThere=true;
                break;
            }
        }
        if (isThere){
            showMessage("This number there is in series!");
        }else {
            showMessage("This number there is not in series!");
        }
    }
    public static void showMessage(String text){
        System.out.println(text);
    }
}