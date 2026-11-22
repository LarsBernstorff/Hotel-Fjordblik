import java.util.Objects;

public class Reservation {
    private final Gaest gaest;

    public Reservation(Gaest gaest) {
        this.gaest = Objects.requireNonNull(gaest,
                "En reservation skal have en gæst.");
    }

    public Gaest getGaest() {
        return gaest;
    }
}
