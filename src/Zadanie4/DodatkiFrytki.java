package Zadanie4;

public class DodatkiFrytki extends Dodatki {
    Danie danie;

    public DodatkiFrytki(Danie danie) {this.danie = danie;}

    @Override
    public String opis() {
       return danie.opis() + "frytki";
    }

    @Override
    public int koszt() {
        return danie.koszt() + 5;
    }
}
