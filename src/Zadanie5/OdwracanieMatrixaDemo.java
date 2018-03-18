package Zadanie5;

public class OdwracanieMatrixaDemo {
    public static void main(String[] args) {
        OdwracanieMatrixa matrix = new OdwracanieMatrixa();
        int[][] matrixToMirror = new int[3][3];
        matrixToMirror = fillmatrix(matrixToMirror);

        matrix.mirror(matrixToMirror);

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
