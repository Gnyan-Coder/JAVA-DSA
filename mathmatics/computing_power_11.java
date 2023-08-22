import java.util.Scanner;

public class computing_power_11 {

    static int powerNaive(int x, int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res = res * x;
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number x : ");
        int x = sc.nextInt();
        System.out.println("Enter the number n:");
        int n = sc.nextInt();
        System.out.println(x + " power of " + n + " is " + powerNaive(x, n));

    }

}

// computing power of number
// i\p:x=2,n=3
// o/p:8
// i\p:x=2,n=0
// o/p:1
