package Zadanie3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomDraw {
    private Random rd = new Random();
    private ArrayList<Integer> list = new ArrayList<>();
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;


    public void draw(int drawSize) {
        for (int i = 0; i < drawSize; i++) {
            list.add(rd.nextInt(200) - 100);
        }

        System.out.println(minValue());
        System.out.println(maxValue());
    }

    private int minValue() {

        for (int i = 0; i < list.size(); i++) {
            if ( min > list.get(i) ) {
                min = list.get(i);
            }
        }
        return min;
    }

    private int maxValue() {
        for (int i = 0; i < list.size(); i++) {
            if ( max < list.get(i) ) {
                max = list.get(i);
            }
        }
        return max;
    }

}
