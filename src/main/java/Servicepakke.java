import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Servicepakke {
    private final List<Serviceydelse> ydelser = new ArrayList<>();

    public void tilfoejYdelse(Serviceydelse ydelse) {
        Objects.requireNonNull(ydelse);
        if (!ydelser.contains(ydelse)) {
            ydelser.add(ydelse);
        }
    }

    public void fjernYdelse(Serviceydelse ydelse) {
        ydelser.remove(ydelse);
    }

    public List<Serviceydelse> getYdelser() {
        return List.copyOf(ydelser);
    }
}