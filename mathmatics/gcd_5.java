import java.util.Scanner;

public class gcd_5 {
    static int gcdNaive(int x, int y) {
        int res = Math.min(x, y);
        while (res > 0) {
            if (x % res == 0 && y % res == 0) {
                break;
            }
            res--;
        }
        return res;
    }

    static int gcdEuclidenNaive(int x, int y) {
        while (x != y) {
            if (x < y) {
                y = y - x;
            } else {
                x = x - y;
            }

        }
        return x;
    }

    static int gcdEucliden(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcdEucliden(y, x % y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number x :");
        int x = sc.nextInt();
        System.out.println("enter the second number y :");
        int y = sc.nextInt();

        System.out.println("GCD of " + x + " and " + y + " is " + gcdEucliden(x, y));

    }
}
