package HW01;

import static org.assertj.core.api.Assertions.*;

public class CalcTest {
    public static void main(String[] args) {
        assert 4500.00 == Calculator.calculateDiscount(5_000.00, 10);
        assert 970.00 == Calculator.calculateDiscount(1000.00, 3);
        assert 4950.00 == Calculator.calculateDiscount(5000.00, 5);

        assertThat(Calculator.calculateDiscount(5000.00, 10)).isEqualTo(4500.00);
        assertThat(Calculator.calculateDiscount(5000.00, 5)).isEqualTo(4750.00);
        assertThat(Calculator.calculateDiscount(5000.00, 1)).isEqualTo(4950.00);

        try {
            Calculator.calculateDiscount(-1.0, -1);
        } catch (ArithmeticException e) {
            assertThatThrownBy(() ->
                    CalculatorHW1.calculateDiscount(0, -1)).isInstanceOf(ArithmeticException.class);
        }
        assertThatThrownBy(() ->
                CalculatorHW1.calculateDiscount(10, -5)).isInstanceOf(ArithmeticException.class);
    }
}
