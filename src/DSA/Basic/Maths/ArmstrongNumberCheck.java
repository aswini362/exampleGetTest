package DSA.Basic.Maths;

public class ArmstrongNumberCheck {

    public static void main(String[] args) {
        int n = 371;
        int originalNumber = n;
        int sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit * lastDigit * lastDigit;
            n = n / 10;
        }

        if (originalNumber == sum) {
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number");
        }
    }
}
