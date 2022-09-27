public class Main {
    public static void main(String[] args) {
        //main javada başlangıç noktasıdır.
        System.out.println("Hello World");
        System.out.println("JAVA KAMP GUN 1");
        //Değişken isimlendirmeleri Java'da camelCase yazılır


        //String metinsel ifade
        String ortaMetin = "Metin";
        System.out.println(ortaMetin);
        //integer , long ,short tam sayı
        int vade = 12;

        //double float ondalıklı sayı

        double dolarBugun = 2.8;
        double dolarDun = 2.7;


        // false ,true
        boolean dolarDustumu = true;
        String okYonu = "";

        if (dolarBugun < dolarDun) {
            okYonu = "Down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun > dolarDun) {
            okYonu = "Up.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "Equal.svg";
            System.out.println(okYonu);
        }

        String[] krediler = {"Hizli Kredi", "Maasini Halkbanktan", "Mutlu Emekli"};

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
    }
}