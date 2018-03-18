package Zadanie5;

public class OdwracanieMatrixa {



    public void mirror(int[][] tab){
        System.out.println("Basic Matix:");
        show(tab);

        System.out.println("Vertical Mirror Matrix:");
        show(verticalMirror(tab));

        System.out.println("Horizontal Mirror Matrix:");
        show(horizontalMirror(tab));


        System.out.println("Total Mirror Matrix:");
        show(totalMirror(tab));
    }

    private int[][] verticalMirror(int[][] tab) {
        int[][] mirroredMatrix = new int[tab.length][tab[0].length];

        for (int i = 0; i < mirroredMatrix.length; i++) {
            for (int j = 0; j < mirroredMatrix[i].length; j++) {
                mirroredMatrix[i][j] = tab[i][tab[i].length-1 - j];
            }
        }
        return mirroredMatrix;
    }

    private int[][] horizontalMirror(int[][] tab) {
        int[][] mirroredMatrix = new int[tab.length][tab[0].length];

        for (int i = 0; i < mirroredMatrix.length; i++) {
            for (int j = 0; j < mirroredMatrix[i].length; j++) {
                mirroredMatrix[i][j] = tab[tab[i].length-1 - i][j];
            }
        }
        return mirroredMatrix;
    }

    private int[][] totalMirror(int[][] tab) {
        int[][] mirroredMatrix = new int[tab.length][tab[0].length];

        for (int i = 0; i < mirroredMatrix.length; i++) {
            for (int j = 0; j < mirroredMatrix[i].length; j++) {
                mirroredMatrix[i][j] = tab[tab.length-1 - i][tab[i].length-1 - j];
            }
        }
        return mirroredMatrix;
    }


    private void show(int[][] showMatrix) {

        for (int i = 0; i < showMatrix.length; i++) {
            for (int j = 0; j < showMatrix[i].length; j++) {
                System.out.print(showMatrix[i][j]);
            }
            System.out.println();
        }

    }

}
