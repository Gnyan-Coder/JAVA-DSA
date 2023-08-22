import java.util.Scanner;

public class itarative_power_12 {

    static int power(int x, int n) {
        int res = 1;
        while (n > 0) {
            if (n % 2 != 0) {
                res = res * x;
            }
            x = x * x;
            n = n / 2;

        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number x ");
        int x = sc.nextInt();
        System.out.println("enter the number n :");
        int n = sc.nextInt();
        System.out.println(power(x, n));

    }

}
