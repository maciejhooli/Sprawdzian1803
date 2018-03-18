package Zadanie4;

public class DodatkiSurowki extends Dodatki {
 Danie danie;

    public DodatkiSurowki(Danie danie) {
        this.danie = danie;
    }

    @Override
    public String opis() {
        return danie.opis() + " surowki";
    }

    @Override
    public int koszt() {
        return danie.koszt() + 1;
    }
}