import java.util.Arrays;
import java.util.Scanner;
import persoana.Persoana;

public class Main {
    public static void ex1() {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println((x + y) / 2.0);
    }
    public static void ex2a() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        double[] v = new double[n];
        for(int i = 0; i < n; ++i) {
            v[i] = sc.nextDouble();
            sum += v[i];
        }
        System.out.println(sum / n);
        for(int i = 0; i < n - 1; ++i)
            for(int j = i + 1; j < n; ++j)
                if(v[i] > v[j]) {
                    double aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
        for(int i = 0; i < n; ++i) {
            System.out.print(v[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void ex2b() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        double[] v = new double[n];
        for(int i = 0; i < n; ++i) {
            v[i] = sc.nextDouble();
            sum += v[i];
        }
        System.out.println(sum / n);
        Arrays.sort(v);
        for(int i = 0; i < n; ++i) {
            System.out.print(v[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void ex3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i = 0; i < n; ++i)
            s[i] = sc.next();
        Arrays.sort(s);
        for(int i = 0; i < n; ++i) {
            System.out.print(s[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void ex4() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i = 0; i < n; ++i)
            s[i] = sc.next();
        Arrays.sort(s);
        for(int i = 0; i < n; ++i)
            if (s[i].length() > 4) {
                String lastFourChars = s[i].substring(s[i].length() - 4);
                if(lastFourChars.equalsIgnoreCase("escu")) {
                    System.out.print(s[i].toUpperCase());
                    System.out.print(" ");
                }
            }
        System.out.println();
    }
    public static void ex5() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Persoana[] persoane = new Persoana[n];
        for(int i = 0; i < n; ++i) {
            persoane[i] = new Persoana();
            persoane[i].citestePersoana(sc);
        }
        double suma = 0;
        System.out.println("   Nume   |  Varsta  |  Salariu  ");
        for(int i = 0; i < n; ++i) {
            String nume = persoane[i].getNume();
            int x = nume.length();
            int varsta = persoane[i].calculeazaVarsta();
            Double salariu = persoane[i].getSalariu();
            System.out.print(nume);
            for(int j = x + 1; j <= 10; ++j)
                System.out.print(" ");
            System.out.print("|");
            System.out.print(varsta);
            if(varsta < 10)
                x = 1;
            else if(varsta < 100)
                x = 2;
            else
                x = 3;
            for(int j = x + 1; j <= 10; ++j)
                System.out.print(" ");
            System.out.print("|");
            System.out.print(salariu);
            suma += salariu;
            System.out.println();
        }
        System.out.println(suma / n);
    }
    public static void ex6() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Persoana[] persoane = new Persoana[n];
        for(int i = 0; i < n; ++i) {
            persoane[i] = new Persoana();
            persoane[i].citestePersoana(sc);
        }
        String s1 = sc.next();
        String s2 = sc.next();
        for(int i = 0; i < n; ++i)
            if(persoane[i].getNume().equals(s1))
                persoane[i].setNume(s2);
        System.out.println("   Nume   |  Varsta  |  Salariu  ");
        for(int i = 0; i < n; ++i) {
            String nume = persoane[i].getNume();
            int x = nume.length();
            int varsta = persoane[i].calculeazaVarsta();
            Double salariu = persoane[i].getSalariu();
            System.out.print(nume);
            for(int j = x + 1; j <= 10; ++j)
                System.out.print(" ");
            System.out.print("|");
            System.out.print(varsta);
            if(varsta < 10)
                x = 1;
            else if(varsta < 100)
                x = 2;
            else
                x = 3;
            for(int j = x + 1; j <= 10; ++j)
                System.out.print(" ");
            System.out.print("|");
            System.out.print(salariu);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ex6();
    }
}