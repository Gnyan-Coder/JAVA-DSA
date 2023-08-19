import java.util.Scanner;

public class factorial_num_3 {
    static int factorial(int num) {
        int res = 1;
        while (num != 0) {
            res = res * num;
            num--;
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int fact = factorial(num);
        System.out.println("factorial of " + num + " is " + fact);

    }
}

// calculate the factorial of the number
