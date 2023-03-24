package suma;
import suma.TermenGeneral;

public class CalculSuma {
    public void calculSuma(TermenGeneral x, int n) {
        double suma = 0;
        for(int i = 1; i <= n; i += 1) {
            suma += x.calculTermen(i);
        }
        System.out.println(suma);
    }
}
