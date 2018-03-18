package Zadanie5;

public class OdwracanieMatrixaDemo {
    public static void main(String[] args) {
        OdwracanieMatrixa matrix = new OdwracanieMatrixa();

        System.out.println("Basic Matix:");
        matrix.show(matrix.fillmatrix());

        System.out.println("Vertical Mirror Matrix:");
        matrix.show(matrix.verticalMirror());

        System.out.println("Horizontal Mirror Matrix:");
        matrix.show(matrix.horizontalMirror());


        System.out.println("Total Mirror Matrix:");
        matrix.show(matrix.totalMirror());



    }
}
