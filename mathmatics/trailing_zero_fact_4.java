import java.util.Scanner;

public class trailing_zero_fact_4 {

    static int trailingZero(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        int res = 0;
        while (fact % 10 == 0) {
            res++;
            fact = fact / 10;
        }
        return res;
    }

    static int countTrailingZero(int n) {
        int res = 0;
        for (int i = 5; i <= n; i = i * 5) {
            res = res + n / i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number  :");
        int num = sc.nextInt();
        System.out.println("Traling zero " + countTrailingZero(num));

    }
}

// trailing of zero in number in factorials