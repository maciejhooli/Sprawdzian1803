package Zadanie6;

public class MatrixDemo {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        int[][] tab = new int[4][4];

        tab = fillmatrix(tab);

        System.out.println("Start table:");
        matrix.show(tab);

        System.out.println("Sub table:");
        matrix.show(matrix.subTab(tab, 1,1,2,2));

    }

    public static int[][] fillmatrix(int[][] matrixToMirror) {
        int counter = 1;
        for (int i = 0; i < matrixToMirror.length; i++) {
            for (int j = 0; j < matrixToMirror[i].length; j++) {
                matrixToMirror[i][j] = counter;
                counter++;
            }
        }
        return matrixToMirror;
    }
}
