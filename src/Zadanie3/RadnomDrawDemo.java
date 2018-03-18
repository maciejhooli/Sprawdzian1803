package Zadanie3;

import java.util.Scanner;

public class RadnomDrawDemo {
    public static void main(String[] args) {
        RandomDraw draw = new RandomDraw();
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe losowan: ");
        int drawSize = sc.nextInt();

        draw.draw(drawSize);
    }
}
