package poligon;
import point.*;

public class Triunghi implements Polygon {
    private Point a, b, c;

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public void area() {
        double semiperimeter = (Point.distance(a, b) + Point.distance(b, c) + Point.distance(a, c)) / 2;
        System.out.println(Math.sqrt(semiperimeter * (semiperimeter - Point.distance(a, b)) * (semiperimeter - Point.distance(b, c)) * (semiperimeter - Point.distance(a, c))));
    }

    @Override
    public void perimeter() {
        System.out.println(Point.distance(a, b) + Point.distance(b, c) + Point.distance(a, c));
    }
}
