import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import animal.*;
import tratament.Tratament;

public class Main {
    static private List<Animal> animale = new ArrayList<>();
    static private List<Tratament> tratamente = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nrAnimale = sc.nextInt();
        for(int i = 0; i < nrAnimale; ++i) {
            int tip = sc.nextInt();
            String numeAnimal = sc.next();
            if(tip == 1) {
                Caine caine = new Caine(numeAnimal);
                animale.add(caine);
            }
            if(tip == 2) {
                Pisica pisica = new Pisica(numeAnimal);
                animale.add(pisica);
            }
            if(tip == 3) {
                Papagal papagal = new Papagal(numeAnimal);
                animale.add(papagal);
            }
        }
        int nrTratamente = sc.nextInt();
        for(int i = 0; i < nrTratamente; ++i) {
            String descriereTratament = sc.next();
            double pretTratament = sc.nextInt();
            Tratament tratament = new Tratament(descriereTratament, pretTratament);
            tratamente.add(tratament);
        }
        int nrTratamenteAplicate = sc.nextInt();
        for(int i = 0; i < nrTratamenteAplicate; ++i) {
            int nrAnimal = sc.nextInt();
            int nrTratament = sc.nextInt();
            animale.get(nrAnimal).adaugaTratament(tratamente.get(nrTratament));
        }
        for(int i = 0; i < nrAnimale; ++i) {
            animale.get(i).afisare();
            System.out.println(animale.get(i).calculeazaPretTratament());
        }
    }
}