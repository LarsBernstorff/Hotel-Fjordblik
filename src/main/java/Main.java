public class Main {
    public static void main(String[] args) {
        // Ydelsen oprettes selvstændigt og deles mellem to pakker.
        Serviceydelse morgenmad = new Serviceydelse("Morgenmad");
        Servicepakke weekend = new Servicepakke();
        Servicepakke ferie = new Servicepakke();

        weekend.tilfoejYdelse(morgenmad);
        ferie.tilfoejYdelse(morgenmad);

        System.out.println("AGGREGERING - Servicepakke og Serviceydelse");
        System.out.println("Samme ydelsesobjekt i begge pakker: "
                + (weekend.getYdelser().get(0) == ferie.getYdelser().get(0)));

        weekend.fjernYdelse(morgenmad);

        System.out.println("Ydelser i weekendpakken efter fjernelse: "
                + weekend.getYdelser().size());
        System.out.println("Ydelser i feriepakken: "
                + ferie.getYdelser().size());
        System.out.println("Ydelsen findes stadig: " + morgenmad.getNavn());
    }
}
