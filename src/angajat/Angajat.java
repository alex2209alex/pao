package angajat;

public sealed class Angajat implements Cloneable permits DirectorGeneral, Secretar {
    private String nume;
    private String prenume;
    private int marca;
    private String functia;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Angajat(String nume, String prenume, int marca, String functia) {
        this.nume = nume;
        this.prenume = prenume;
        this.marca = marca;
        this.functia = functia;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", marca=" + marca +
                ", functia='" + functia + '\'' +
                '}';
    }
}
