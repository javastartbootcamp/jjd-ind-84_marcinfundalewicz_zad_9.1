package pl.javastart.task;

import java.util.Arrays;

public class Firma {

    private String nazwa;
    private FormaOpodatkowania formaOpodatkowania;
    private double[] przychody = new double[10];
    private int counterPrzychody = 0;
    private double[] wydatki = new double[10];
    private int counterWydatki = 0;

    public Firma(String nazwa, FormaOpodatkowania formaOpodatkowania) {
        this.nazwa = nazwa;
        this.formaOpodatkowania = formaOpodatkowania;
    }

    public void wyswietlPodsumowanie() {
        double sumaPrzychodow = zsumujPrzychody();
        double sumaWydatkow = zsumujWydatki();

        System.out.printf("======= Firma: %s ===========\n", nazwa);
        System.out.printf("Forma opodatkowania: %s\n", "TODO");
        System.out.printf("Suma przychodów: %.2f zł\n", zsumujPrzychody());
        System.out.printf("Suma wydatków: %.2f zł\n", zsumujWydatki());
        System.out.printf("Podatek do zapłacenia: %.2f zł", formaOpodatkowania.wyliczPodatek(sumaPrzychodow, sumaWydatkow));
        System.out.print("\n\n");
    }

    private double zsumujWydatki() {
        double sumaWydatkow = 0;
        for (int i = 0; i < counterWydatki; i++) {
            sumaWydatkow = sumaWydatkow + wydatki[i];
        }
        return sumaWydatkow;
    }

    private double zsumujPrzychody() {
        double sumaPrzychodow = 0;
        for (int i = 0; i < counterPrzychody; i++) {
            sumaPrzychodow = sumaPrzychodow + przychody[i];
        }
        return sumaPrzychodow;
    }

    public void dodajPrzychod(String nazwa, double wartosc) {
        if (counterPrzychody >= przychody.length) {
            przychody = Arrays.copyOf(przychody, przychody.length * 2);
        }
        przychody[counterPrzychody] = wartosc;
        counterPrzychody++;

    }

    public void dodajWydatek(String nazwa, double wartosc) {
        if (counterWydatki >= wydatki.length) {
            wydatki = Arrays.copyOf(wydatki, wydatki.length * 2);
        }
        wydatki[counterWydatki] = wartosc;
        counterWydatki++;
    }
}
