import java.util.Scanner;

public class lcm_6 {
    static int lcmNaive(int a, int b) {
        int res = Math.max(a, b);
        while (true) {
            if (res % a == 0 && res % b == 0) {
                return res;
            }
            res++;
        }
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    static int lcmEfficient(int a, int b) {
        return (a * b) / gcd(a, b);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number a :");
        int a = sc.nextInt();
        System.out.println("enter the second number b:");
        int b = sc.nextInt();
        System.out.println("LCM of " + a + " and " + b + " is " + lcmEfficient(a, b));

    }
}
