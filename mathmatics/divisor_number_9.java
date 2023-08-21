import java.util.Scanner;

public class divisor_number_9 {

    static void printDivisorNaive(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nuber :");
        int n = sc.nextInt();
        printDivisorNaive(n);

    }

}

// All divisor of a number
// i/p: n=15
// o/p: 1,3,5,15