package persoana;
import java.util.Scanner;

public class Persoana {
    private String nume;
    private int anNastere;
    private double salariu;
    private static final int anCurent = 2023;

    public String getNume() {
        return nume;
    }

    public int getAnNastere() {
        return anNastere;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int calculeazaVarsta() {
        return anCurent - anNastere;
    }

    public void citestePersoana(Scanner sc) {
        nume = sc.next();
        anNastere = sc.nextInt();
        salariu = sc.nextDouble();
    }
}
