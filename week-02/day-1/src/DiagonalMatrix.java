public class DiagonalMatrix {

    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output

    public static void main(String[] args) {

        int[][] diagonalMatrix = new int[4][4];
        for (int i = 0; i < diagonalMatrix.length; i++) {

            for (int j = 0; j < diagonalMatrix[i].length; j++) {
                diagonalMatrix[i][j] = 0;

            }
        }
        for (int i = 0; i < diagonalMatrix.length; i++) {

            for (int j = 0; j < diagonalMatrix[i].length; j++) {

                if (i == j) {
                diagonalMatrix[i][j] = 1;}

            }
        }

        for (int i = 0; i < diagonalMatrix.length; i++) {

            for (int j = 0; j < diagonalMatrix[i].length; j++) {
                System.out.print(diagonalMatrix[i][j]);
            }
            System.out.println();
        }

    }

}
