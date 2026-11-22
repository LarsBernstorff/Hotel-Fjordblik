import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Opholdsregning {
    private final List<Regningslinje> linjer = new ArrayList<>();

    public void tilfoejLinje(String tekst, BigDecimal beloeb) {
        linjer.add(new Regningslinje(tekst, beloeb));
    }

    public List<Regningslinje> getLinjer() {
        return List.copyOf(linjer);
    }

    public static final class Regningslinje {
        private final String tekst;
        private final BigDecimal beloeb;

        private Regningslinje(String tekst, BigDecimal beloeb) {
            this.tekst = Objects.requireNonNull(tekst);
            this.beloeb = Objects.requireNonNull(beloeb);
        }

        public String getTekst() {
            return tekst;
        }

        public BigDecimal getBeloeb() {
            return beloeb;
        }
    }
}