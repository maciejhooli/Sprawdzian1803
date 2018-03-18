package Zadanie6;

public class Matrix {
    public int[][] subTab(int[][] tab, int x, int y, int sizeX, int sizeY) {
     int[][] subTab = new int[sizeX][sizeY];
     int xStart = x;
     int yStart = y;

        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                subTab[i][j] = tab[x][y];
                y++;
            }
            y = yStart;
            x++;
        }
        return subTab;
    }

    public void show(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
