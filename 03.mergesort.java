import java.util.*;
public class Quick {
    static int count = 0;
    static void mergesort(int[] a) {
        int n = a.length;
        if (n > 1) {
            int p = (int) Math.floor(n / 2.0);
            int q = (int) Math.ceil(n / 2.0);
            int[] b = new int[p];
            int[] c = new int[q];
            System.arraycopy(a, 0, b, 0, p);
            System.arraycopy(a, p, c, 0, q);
            mergesort(b);
            mergesort(c);
            merge(b,c,a);
        }
    }
    static void merge(int[] b, int[] c, int[] a) {
        int i = 0, j = 0, k = 0;
        int p = b.length;
        int q = c.length;
        while(i < p && j < q) {
            count++;
            if (b[i] <= c[j]) {
                a[k++] = b[i++];
            } else {
                a[k++] = c[j++];
            }
        }
        while (i < p) {
            a[k++] = b[i++];
        }
        while (j < q) {
            a[k++] = c[j++];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] a = new int[n];
        Random r = new Random();
        System.out.println("Input array (random numbers):");
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(1000);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        mergesort(a);
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Number of basic operations: " + count);
        System.out.println("Best case (Lower bound): " + (int) (n * Math.log(n) / Math.log(2)));
        System.out.println("Worst case: " + (int) (n * Math.log(n) / Math.log(2)));
    }
}
