import java.math.BigDecimal;
import java.util.ArrayList;
public class Adder {
    public int add(int a, int b) {
        return a + b;
    }

    public BigDecimal add(ArrayList<BigDecimal> lista) {
        BigDecimal wynik = BigDecimal.ZERO;
        for (int i = 0; i < lista.size(); i++) {
            wynik = wynik.add(lista.get(i));
        }
        return wynik;
    }
}