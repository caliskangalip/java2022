public class Main {
    public static void main(String[] args) {
        String[][] sehirler=new String[3][3];

        sehirler[0][0]="İstanbul";
        sehirler[0][1]="Adana";
        sehirler[0][2]="Adıyaman";
        sehirler[1][0]="Burdur";
        sehirler[1][1]="Bursa";
        sehirler[1][2]="Çanakkale";
        sehirler[2][0]="Antalya";
        sehirler[2][1]="Denizli";
        sehirler[2][2]="Diyarbakır";
        for (int i=0;i<=2;i++){
            for (int j=0; j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
            System.out.println("________________");
        }
    }
}