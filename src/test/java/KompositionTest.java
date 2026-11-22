import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KompositionTest {
    @Test
    void enOpholdsregningKanVaereTom() {
        assertTrue(new Opholdsregning().getLinjer().isEmpty());
    }

    @Test
    void hverRegningOpretterSineEgneLinjer() {
        Opholdsregning r1 = new Opholdsregning();
        Opholdsregning r2 = new Opholdsregning();

        r1.tilfoejLinje("Morgenmad", new BigDecimal("125.00"));
        assertTrue(r2.getLinjer().isEmpty());

        r2.tilfoejLinje("Morgenmad", new BigDecimal("125.00"));

        assertNotSame(r1.getLinjer().get(0), r2.getLinjer().get(0));
        assertEquals("Morgenmad", r1.getLinjer().get(0).getTekst());
        assertEquals(new BigDecimal("125.00"),
                r1.getLinjer().get(0).getBeloeb());
    }

    @Test
    void enEksisterendeLinjeKanIkkeIndsaettesUdefra() {
        Opholdsregning r1 = new Opholdsregning();
        Opholdsregning r2 = new Opholdsregning();
        r1.tilfoejLinje("Morgenmad", new BigDecimal("125.00"));

        Opholdsregning.Regningslinje linje = r1.getLinjer().get(0);

        assertThrows(UnsupportedOperationException.class,
                () -> r2.getLinjer().add(linje));
        assertTrue(r2.getLinjer().isEmpty());
    }
}