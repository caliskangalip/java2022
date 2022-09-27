import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel";
        System.out.println(message);
        System.out.println("Eleman sayısı = " + message.length());
        System.out.println("Beşinci eleman = " + message.charAt(4));
        System.out.println(message.concat(" idi"));
        System.out.println(message);
        System.out.println(message.startsWith("Bu"));
        System.out.println(message.endsWith("zel"));
        char[] characters= new char[4];
        message.getChars(6,10,characters,0);
        System.out.println(characters);
        System.out.println(message.indexOf("a"));
        System.out.println(message.lastIndexOf("a"));

        System.out.println(message.replace("hava", "deniz"));
        System.out.println(message.substring(6,10));
        for (String word:message.split(" ")){
            System.out.println(word);
        }
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
}