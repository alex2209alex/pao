package animal;
import tratament.Tratament;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private String name;
    private List<Tratament> tratamente;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tratament> getTratamente() {
        return tratamente;
    }

    public void setTratamente(List<Tratament> tratamente) {
        this.tratamente = tratamente;
    }

    public Animal(String name) {
        this.name = name;
        this.tratamente = new ArrayList<>();
    }

    public void adaugaTratament(Tratament tratament) {
        this.tratamente.add(tratament);
    }

    public abstract double calculeazaPretTratament();

    public abstract void afisare();
}
