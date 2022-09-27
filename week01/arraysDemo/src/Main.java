public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Halil";
        String ogrenci2 = "Ayşegül";
        String ogrenci3 = "Selim";
        String ogrenci4 = "Meryem";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);
        System.out.println("_________________________");

        String[] ogrenciler = new String[4];
        ogrenciler[0]="İsa";
        ogrenciler[1]="Murat";
        ogrenciler[2]="Ibrahim";
        ogrenciler[3]="Ahmet";

        for (int i=0; i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("_________________________");
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}