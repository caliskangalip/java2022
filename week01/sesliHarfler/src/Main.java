public class Main {
    public static void main(String[] args) {
        char harf = 'Ö';

        switch (harf) {
            case 'A':
            case 'U':
            case 'O':
            case 'I':
                System.out.print(harf);
                System.out.println(" harfi kalın seslidir.");
                break;
            case 'E':
            case 'Ü':
            case 'Ö':
            case 'İ':
                System.out.print(harf);
                System.out.println(" harfi ince seslidir.");
                break;
            default:
                System.out.println("Bu bir sesli harf değil");
        }
    }
}