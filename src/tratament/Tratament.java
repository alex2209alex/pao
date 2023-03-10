package tratament;

public class Tratament {
    private String descriere;
    private double pret;

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public Tratament(String descriere, double pret) {
        this.descriere = descriere;
        this.pret = pret;
    }
}
