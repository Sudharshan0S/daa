import java.util.*;

public class Prg9 {

    static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    static void Floyd(int d[][], int n) {
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    d[i][j] = min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of stations:");
        int n = s.nextInt();

        int c[][] = new int[n][n];
        System.out.println("Enter the travel time between subway lines:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = s.nextInt();
                if (c[i][j] == 0 && i != j) {
                    c[i][j] = 999; // Represents infinity
                }
            }
        }

        Floyd(c, n);

        System.out.println("Shortest travel time between all stations:");
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
        }
    }
}
