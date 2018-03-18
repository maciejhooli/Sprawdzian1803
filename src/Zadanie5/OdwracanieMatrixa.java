package Zadanie5;

public class OdwracanieMatrixa {
    private int[][] matrixToMirror = new int[3][3];

    public int[][] fillmatrix() {
        int counter = 1;
        for (int i = 0; i < matrixToMirror.length; i++) {
            for (int j = 0; j < matrixToMirror[i].length; j++) {
                matrixToMirror[i][j] = counter;
                counter++;
            }
        }
        return matrixToMirror;
    }

    public int[][] verticalMirror() {
        int[][] mirroredMatrix = new int[matrixToMirror.length][matrixToMirror[0].length];

        for (int i = 0; i < mirroredMatrix.length; i++) {
            for (int j = 0; j < mirroredMatrix[i].length; j++) {
                mirroredMatrix[i][j] = matrixToMirror[i][matrixToMirror[i].length-1 - j];
            }
        }
        return mirroredMatrix;
    }

    public int[][] horizontalMirror() {
        int[][] mirroredMatrix = new int[matrixToMirror.length][matrixToMirror[0].length];

        for (int i = 0; i < mirroredMatrix.length; i++) {
            for (int j = 0; j < mirroredMatrix[i].length; j++) {
                mirroredMatrix[i][j] = matrixToMirror[matrixToMirror[i].length-1 - i][j];
            }
        }
        return mirroredMatrix;
    }

    public int[][] totalMirror() {
        int[][] mirroredMatrix = new int[matrixToMirror.length][matrixToMirror[0].length];

        for (int i = 0; i < mirroredMatrix.length; i++) {
            for (int j = 0; j < mirroredMatrix[i].length; j++) {
                mirroredMatrix[i][j] = matrixToMirror[matrixToMirror.length-1 - i][matrixToMirror[i].length-1 - j];
            }
        }
        return mirroredMatrix;
    }


    public void show(int[][] showMatrix) {

        for (int i = 0; i < showMatrix.length; i++) {
            for (int j = 0; j < showMatrix[i].length; j++) {
                System.out.print(showMatrix[i][j]);
            }
            System.out.println();
        }

    }

}
