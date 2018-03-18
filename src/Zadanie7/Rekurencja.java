package Zadanie7;

public class Rekurencja {

    public static void main(String[] args) {
        String text = "Maciek";

        System.out.println(rev(text));
    }

    public static String rev(String text){
        if(text.length() == 1){
            text = String.valueOf(text.charAt(0));
            System.out.println(text);
            return text;
        }

        //PROGRAM NIE DZIALA POPRAWNIE
        System.out.println(text.substring(0, text.length()-1));
        return rev(text.substring(0, text.length()-1));
    }
}
