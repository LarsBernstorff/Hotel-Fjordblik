public class Main {
    public static void main(String[] args) {
        Gaest maja = new Gaest("Maja");

        Reservation weekend = new Reservation(maja);
        Reservation ferie = new Reservation(maja);

        System.out.println("ASSOCIATION - Gæst og Reservation");
        System.out.println("Weekendreservationens gæst: "
                + weekend.getGaest().getNavn());
        System.out.println("Feriereservationens gæst: "
                + ferie.getGaest().getNavn());
        System.out.println("Samme gæsteobjekt: "
                + (weekend.getGaest() == ferie.getGaest()));
    }
}