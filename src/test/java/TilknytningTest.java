import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class TilknytningTest {

    @Test
    void sammeMedarbejderKanHaveToTilknytningerMedEgneVilkaar() {
        // Arrange: Opret medarbejderen og de to hoteller.
        Medarbejder maja = new Medarbejder("Maja");
        Hotel fjordblik = new Hotel("Hotel Fjordblik");
        Hotel havblik = new Hotel("Hotel Havblik");

        // Act: Opret to tilknytninger med forskellige vilkår.
        Tilknytning tilknytning1 = new Tilknytning(
                maja, fjordblik, LocalDate.of(2026, 11, 1), 25
        );

        Tilknytning tilknytning2 = new Tilknytning(
                maja, havblik, LocalDate.of(2026, 11, 15), 10
        );

        // Assert: Begge tilknytninger refererer til samme medarbejder.
        assertSame(maja, tilknytning1.getMedarbejder());
        assertSame(maja, tilknytning2.getMedarbejder());

        // Hver tilknytning refererer til det rigtige hotel.
        assertSame(fjordblik, tilknytning1.getHotel());
        assertSame(havblik, tilknytning2.getHotel());

        // Hver tilknytning har sin egen startdato og sit eget timetal.
        assertEquals(LocalDate.of(2026, 11, 1), tilknytning1.getStartdato());
        assertEquals(25, tilknytning1.getUgentligeTimer());

        assertEquals(LocalDate.of(2026, 11, 15), tilknytning2.getStartdato());
        assertEquals(10, tilknytning2.getUgentligeTimer());
    }
}
