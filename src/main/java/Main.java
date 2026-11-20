import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Medarbejder maja = new Medarbejder("Maja");

        Hotel fjordblik = new Hotel("Hotel Fjordblik");
        Hotel havblik = new Hotel("Hotel Havblik");

        Tilknytning tilknytning1 = new Tilknytning(
                maja,
                fjordblik,
                LocalDate.of(2026, 11, 1),
                25
        );

        Tilknytning tilknytning2 = new Tilknytning(
                maja,
                havblik,
                LocalDate.of(2026, 11, 15),
                10
        );

        System.out.println(
                tilknytning1.getMedarbejder().getNavn()
                        + " arbejder "
                        + tilknytning1.getUgentligeTimer()
                        + " timer om ugen på "
                        + tilknytning1.getHotel().getNavn()
        );
    }
}