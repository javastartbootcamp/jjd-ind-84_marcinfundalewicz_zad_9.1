package pl.javastart.task;

public class PodatekWedlugSkali extends FormaOpodatkowania {

    public static final int KWOTA_WOLNA_OD_PODATKU = 10000;
    public static final int KWOTA_DO_PIERWSZEGO_PROGU_PODATKOWEGO = 100000;
    public static final double PROCENT_PIERWSZEGO_PROGU_PODATKOWEGO = 0.18;
    public static final double PROCENT_DRUGIEGO_PROGU_PODATKOWEGO = 0.32;

    public double wyliczPodatek(double przychody, double wydatki) {
        if (przychody < KWOTA_WOLNA_OD_PODATKU) {
            return 0;
        } else if (przychody > KWOTA_WOLNA_OD_PODATKU && przychody < KWOTA_DO_PIERWSZEGO_PROGU_PODATKOWEGO) {
            return (((przychody - wydatki) - KWOTA_WOLNA_OD_PODATKU) * PROCENT_PIERWSZEGO_PROGU_PODATKOWEGO);
        } else if (przychody > KWOTA_DO_PIERWSZEGO_PROGU_PODATKOWEGO) {
            return (((KWOTA_DO_PIERWSZEGO_PROGU_PODATKOWEGO - KWOTA_WOLNA_OD_PODATKU)) * PROCENT_PIERWSZEGO_PROGU_PODATKOWEGO)
                    + (((przychody - wydatki) - KWOTA_DO_PIERWSZEGO_PROGU_PODATKOWEGO) * PROCENT_DRUGIEGO_PROGU_PODATKOWEGO);
        }
        return 0;
    }

    @Override
    String podajNazwe() {
        return "Podatek weddlug skali";
    }
}
