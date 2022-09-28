public class Main {
    public static void main(String[] args) {
        DortIslem hesapMakinesi=new DortIslem();
        int number1= 12;
        int number2= 5;
        System.out.println(hesapMakinesi.bol(number1, number2));
        System.out.println(hesapMakinesi.carp(number1, number2));
        System.out.println(hesapMakinesi.cikar(number1, number2));
        System.out.println(hesapMakinesi.topla(number1, number2));
    }
}