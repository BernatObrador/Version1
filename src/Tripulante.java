public class Tripulante {
    private final String DNI;
    private String nombre;
    private byte edad;
    private Cargo cargo;

    enum Cargo{
        PILOTO, COPILOTO, AUXILIAR
    }

    public Tripulante(String DNI, String nombre, byte edad, String cargo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
        if(cargo.equalsIgnoreCase("PILOTO") || cargo.equalsIgnoreCase("COPILOTO") || cargo.equalsIgnoreCase("AUXILIAR")) {
            this.cargo = Cargo.valueOf(cargo.toUpperCase());
        } else {
            this.cargo = Cargo.AUXILIAR;
        }

    }

    public Cargo getCargo() {
        return cargo;
    }
}
