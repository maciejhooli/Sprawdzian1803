package Zadanie4;

public class DodatkiZiemniaki extends Dodatki {
    Danie danie;

    public DodatkiZiemniaki(Danie danie) {
        this.danie = danie;
    }

    @Override
    public String opis() {
        return danie.opis() + " ziemniaki";
    }

    @Override
    public int koszt() {
        return danie.koszt() + 2;
    }
}