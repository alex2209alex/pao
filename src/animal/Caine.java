package animal;

import tratament.Tratament;

import java.util.List;

public class Caine extends Animal {
    public Caine(String name) {
        super(name);
    }

    @Override
    public double calculeazaPretTratament() {
        List<Tratament> tratamente = this.getTratamente();
        double pret = 0;
        for (Tratament tratament : tratamente) {
            pret += tratament.getPret() * 1.1;
        }
        return pret;
    }

    @Override
    public void afisare() {
        System.out.println(this.getName() + " " + "caine");
        List<Tratament> tratamente = this.getTratamente();
        for (Tratament tratament : tratamente) {
            System.out.println(tratament.getDescriere() + " " + tratament.getPret());
        }
    }
}
