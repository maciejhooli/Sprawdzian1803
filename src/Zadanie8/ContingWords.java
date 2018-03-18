package Zadanie8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContingWords {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:/Programowanie/!Kurs programowania/03 Programy/Sprawdzian1803/text.txt");
        Scanner sc = new Scanner(file);

        int counter = 1;

        while (sc.hasNextLine()) {
        String text = sc.nextLine();
        System.out.println(text);
        System.out.println(text.length());

        // Tworzenie substringow od spacji, na tej podstawie liczenie wyrazów

        }
    }
}