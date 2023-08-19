import java.util.Scanner;

public class count_digit_1 {

    static int countDigit(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int count = countDigit(num);
        System.out.println(num + " having " + count + " digits");

    }
}

// count the number of digits in a number
