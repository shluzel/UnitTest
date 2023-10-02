package HW01;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(calculation(10, 2, '*'));
        System.out.println();
        System.out.println("Цена с учетом скидки " + calculateDiscount(5000.00, 1));
        System.out.println("Цена с учетом скидки " + calculateDiscount(1000.00, 3));
        System.out.println("Цена с учетом скидки " + calculateDiscount(5000.00, 5));
        System.out.println("Цена с учетом скидки " + calculateDiscount(1000.00, 10));
    }

    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
            }
            return result;
        }

    public static double calculateDiscount(double price, int discount) {
        double result;
        if (price >= discount && discount > 0) {
            switch (discount) {
                case 1:
                    return price - price * 0.01;

                case 3:
                    return price - price * 0.03;

                case 5:
                    return price - price * 0.05;

                case 10:
                    return price - price * 0.1;

                default:
                    return price;
            }
        }
        else {
            throw new ArithmeticException("Возникла ошибка");
        }
    }
}
