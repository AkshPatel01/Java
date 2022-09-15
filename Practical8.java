public class Practical8 {
    public static void main(String[] args) {
        int a[][] = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
        int b[][] = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
        int c[][] = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
    }
}