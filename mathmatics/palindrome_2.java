import java.util.Scanner;

public class palindrome_2 {

    static boolean checkPlindrom(int num) {
        int temp = num;
        int rev = 0;
        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;

        }
        return (rev == num);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        boolean isPalin = checkPlindrom(num);
        if (isPalin) {
            System.out.println(num + " is palindrome number ");
        } else {
            System.out.println(num + " is not pa;lindrom number");
        }
    }
}

// check the number is plindrome or not
