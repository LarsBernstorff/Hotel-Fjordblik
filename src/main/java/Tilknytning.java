import java.time.LocalDate;

public class Tilknytning {
    private Medarbejder medarbejder;
    private Hotel hotel;
    private LocalDate startdato;
    private int ugentligeTimer;

    public Tilknytning(Medarbejder medarbejder,
                       Hotel hotel,
                       LocalDate startdato,
                       int ugentligeTimer) {
        this.medarbejder = medarbejder;
        this.hotel = hotel;
        this.startdato = startdato;
        this.ugentligeTimer = ugentligeTimer;
    }

    public Medarbejder getMedarbejder() {
        return medarbejder;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public LocalDate getStartdato() {
        return startdato;
    }

    public int getUgentligeTimer() {
        return ugentligeTimer;
    }
}