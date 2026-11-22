import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AggregeringTest {
    @Test
    void enServicepakkeKanVaereTom() {
        assertTrue(new Servicepakke().getYdelser().isEmpty());
    }

    @Test
    void sammeYdelseKanDelesOgFjernesFraEnPakke() {
        Serviceydelse morgenmad = new Serviceydelse("Morgenmad");
        Servicepakke weekend = new Servicepakke();
        Servicepakke ferie = new Servicepakke();

        weekend.tilfoejYdelse(morgenmad);
        ferie.tilfoejYdelse(morgenmad);

        assertSame(morgenmad, weekend.getYdelser().get(0));
        assertSame(morgenmad, ferie.getYdelser().get(0));

        weekend.fjernYdelse(morgenmad);

        assertTrue(weekend.getYdelser().isEmpty());
        assertSame(morgenmad, ferie.getYdelser().get(0));
        assertEquals("Morgenmad", morgenmad.getNavn());
    }
}