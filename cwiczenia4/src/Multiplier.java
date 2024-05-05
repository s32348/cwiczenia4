import java.math.BigDecimal;
import java.util.ArrayList;
public class Multiplier {
    public int mulitply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c, int d) {
        return a * b * c * d;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    public int multiply(ArrayList<Integer> list) {
        int wynik = 1;
        for (int i = 0; i < list.size(); i++) {
            wynik *= list.get(i);
        }
        return wynik;
    }
}