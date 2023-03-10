package animal;

import tratament.Tratament;

import java.util.List;

public class Pisica extends Animal {

    public Pisica(String name) {
        super(name);
    }

    @Override
    public double calculeazaPretTratament() {
        List<Tratament> tratamente = this.getTratamente();
        double pret = 0;
        for (Tratament tratament : tratamente) {
            pret += tratament.getPret();
        }
        return pret;
    }

    @Override
    public void afisare() {
        System.out.println(this.getName() + " " + "pisica");
        List<Tratament> tratamente = this.getTratamente();
        for (Tratament tratament : tratamente) {
            System.out.println(tratament.getDescriere() + " " + tratament.getPret());
        }
    }
}
