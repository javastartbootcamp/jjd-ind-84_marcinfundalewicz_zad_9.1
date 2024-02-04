package pl.javastart.task;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {

    public static final double PROCENT_RYCZALTU_EWIDENCJOWANEGO = 0.15;

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        return przychody * PROCENT_RYCZALTU_EWIDENCJOWANEGO;
    }

    @Override
    String podajNazwe() {
        return "Ryczalt ewidencjonowany";
    }
}
