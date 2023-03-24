import point.Point;
import poligon.*;
import suma.CalculSuma;
import suma.TermenGeneral;

public class Main {

    public static void ex1() {
        Triunghi triunghi = new Triunghi();
        Point a = new Point();
        a.setX(0);
        a.setY(0);
        triunghi.setA(a);
        Point b = new Point();
        b.setX(0);
        b.setY(3);
        triunghi.setB(b);
        Point c = new Point();
        c.setX(4);
        c.setY(0);
        triunghi.setC(c);
        triunghi.perimeter();
        triunghi.area();
    }

    private static class Sum1 implements TermenGeneral {
        @Override
        public double calculTermen(int i) {
            return i;
        }
    }

    private static class Sum2 implements TermenGeneral {
        @Override
        public double calculTermen(int i) {
            return i * i;
        }
    }

    public static void ex2() {
        CalculSuma cs = new CalculSuma();
        cs.calculSuma(new Sum1(), 4);
        cs.calculSuma(new Sum2(), 4);
    }

    public static void main(String[] args) {
        ex2();
    }
}