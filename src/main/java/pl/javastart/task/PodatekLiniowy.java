package pl.javastart.task;

public class PodatekLiniowy extends FormaOpodatkowania {

    public static final double PROCENT_PODATKU_LINIOWEGO = 0.19;

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        return ((przychody - wydatki) * PROCENT_PODATKU_LINIOWEGO);
    }

    @Override
    String podajNazwe() {
        return "Podatek liniowy";
    }
}
