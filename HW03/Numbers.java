package HW03;

public class Numbers {
    public static void main(String[] args) {
        int num = 10;
        int num2 = 50;
        evenOddNumber(num);
        numberInInterval(num2);
    }

    public static boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean numberInInterval(int n) {
        if (n > 24 && n < 101) {
            return true;
        } else {
            return false;
        }
    }
}
