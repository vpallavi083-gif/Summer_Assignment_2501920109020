class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int a = mat.length;
        int b = mat[0].length;

        if (a * b != r * c) {
            return mat;
        }

        int[][] res = new int[r][c];

        int row = 0;
        int column = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {

                res[row][column] = mat[i][j];
                column++;

                if (column == c) {
                    column = 0;
                    row++;
                }
            }
        }

        return res;
    }
}
