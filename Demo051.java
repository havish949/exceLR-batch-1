import java.util.Scanner;

public class Demo051 {
    public static void main(String[] args) {
        int num;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            num = scanner.nextInt();
        }

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }

    public static boolean isPalindrome(int num) {
        int reversedNum = 0;
        int originalNum = num;

        while (num != 0) {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        return originalNum == reversedNum;
    }
}

