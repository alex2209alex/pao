package animal;

import tratament.Tratament;

import java.util.List;

public class Papagal extends Animal {

    public Papagal(String name) {
        super(name);
    }

    @Override
    public double calculeazaPretTratament() {
        List<Tratament> tratamente = this.getTratamente();
        double pret = 0;
        for (Tratament tratament : tratamente) {
            pret += tratament.getPret() * 0.9;
        }
        return pret;
    }

    @Override
    public void afisare() {
        System.out.println(this.getName() + " " + "papagal");
        List<Tratament> tratamente = this.getTratamente();
        for (Tratament tratament : tratamente) {
            System.out.println(tratament.getDescriere() + " " + tratament.getPret());
        }
    }
}
