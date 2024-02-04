package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Firma firma = new Firma("JanuszPOL", new PodatekWedlugSkali());
        //prosilbym o wytlumaczenie powyzszego konstruktora Firma
        //skad sie bierze new PodatekLinowy skoro w konstruktorze ten parametr jest zapisany jako FormaOpodatkowania formaOpodatkowania
        //czy konstruktor chce abysmy przekazali obiekt formaOpodatkowania z klasy FormaOpodatkowania ?
        //czy my forme opodatkowania dla firmy tworzymy dopiero w konstruktorze jako obiekt klasy PodatekLiniowy ?
        //operator new przy PodatekLiniowy pojawia sie w momencie przekazywania obiektu do konstruktora ?
        //w przypadku przekazywania nazwy nie mamy takiego operatora new

        firma.dodajPrzychod("Remont Mieszkania", 15_000);
        firma.dodajWydatek("Gładzie i farby", 2_000);

        firma.wyswietlPodsumowanie();

        Firma janNowakServices = new Firma("Jan Nowak IT Services", new NaCzarno());

        janNowakServices.dodajPrzychod("Programowanie", 15_000);
        janNowakServices.dodajWydatek("Energetyki", 200);

        janNowakServices.wyswietlPodsumowanie();
    }

}
