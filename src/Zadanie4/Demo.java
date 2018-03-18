package Zadanie4;

public class Demo {
    public static void main(String[] args) {
        Danie schabowyZziemniakiamiIsurowka = new DodatkiSurowki(new DodatkiZiemniaki(new Schabowy()));

        System.out.println(schabowyZziemniakiamiIsurowka.opis());
        System.out.println(schabowyZziemniakiamiIsurowka.koszt());
    }
}
