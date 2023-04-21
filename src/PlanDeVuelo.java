import java.time.LocalDateTime;

public class PlanDeVuelo {
    private final String origen;
    private final String destino;
    private final LocalDateTime date;
    private final int combustible;

    public PlanDeVuelo(String origen, String destino, LocalDateTime date, int combustible) {
        this.origen = origen;
        this.destino = destino;
        this.date = date;
        this.combustible = combustible;
    }

    public int getCombustible() {
        return combustible;
    }
}
