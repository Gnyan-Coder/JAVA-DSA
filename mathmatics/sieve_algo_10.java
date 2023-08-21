import java.util.Scanner;

public class sieve_algo_10 {

    static void printPrimeNaive(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        printPrimeNaive(n);

    }
}

// print the prime number lessthan or equalto the number

// i\p:n=10
// o/p:2,3,5,7
