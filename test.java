import java.util.Scanner;

public class test {
    public static void main(String args[]) {
        System.out.println("test zoho code");
        int i, j, k = 0, n=new Scanner(System.in).nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= ((2 * n)-i); j++) {
                System.out.print((j <= (n - i)) ? " " : ((i % 2) == 1) ? (k+1) + " " : k + " ");
                k= (j <= (n - i)) ? k : ((i % 2) == 1) ? (k+1) : (k-1);
            }k = k+ n;
            System.out.println("\n");
        }
    }
}
