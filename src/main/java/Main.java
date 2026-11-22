import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Opholdsregning regning1 = new Opholdsregning();
        Opholdsregning regning2 = new Opholdsregning();

        // Regningen opretter selv en ny linje ud fra tekst og beløb.
        regning1.tilfoejLinje("Morgenmad", new BigDecimal("125.00"));

        System.out.println("KOMPOSITION - Opholdsregning og Regningslinje");
        System.out.println("Linjer på regning 1: " + regning1.getLinjer().size());
        System.out.println("Linjer på regning 2: " + regning2.getLinjer().size());

        // Samme oplysninger giver en ny linje, som tilhører regning 2.
        regning2.tilfoejLinje("Morgenmad", new BigDecimal("125.00"));

        Opholdsregning.Regningslinje linje1 = regning1.getLinjer().get(0);
        Opholdsregning.Regningslinje linje2 = regning2.getLinjer().get(0);

        System.out.println("Regning 1: " + linje1.getTekst()
                + " - " + linje1.getBeloeb() + " kr.");
        System.out.println("Regning 2: " + linje2.getTekst()
                + " - " + linje2.getBeloeb() + " kr.");
        System.out.println("Samme linjeobjekt: " + (linje1 == linje2));
    }
}
