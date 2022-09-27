public class Main {
    public static void main(String[] args) {
        int[] numbers= new int[]{1,2,5,7,9,0};
        int willFind=5;
        for (int number:numbers){
            if (number==willFind){
                System.out.println("Aranan sayı mevcuttur.");
            }
        }
    }
}