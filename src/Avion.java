import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class Avion {
    private double cargaMaxima;
    private int capacidadMaximaPasajeros;
    private Tripulante[] tripulantes;
    private Pasajero[] pasajeros;
    private PlanDeVuelo planDeVuelo;
    private int combustible;

    public Avion(int cargaMaxima, int capacidadMaximaPasajeros, PlanDeVuelo planDeVuelo, int combustible) {
        this.cargaMaxima = cargaMaxima;
        this.capacidadMaximaPasajeros = capacidadMaximaPasajeros;
        this.planDeVuelo = planDeVuelo;
        this.combustible = combustible;
        tripulantes = new Tripulante[0];
        pasajeros = new Pasajero[0];
    }

    public void setTripulantes(Tripulante tripulante) {
        boolean encontrado = false;

        for (Tripulante e : this.tripulantes) {
            if (e == tripulante) {
                encontrado = true;
            }
        }

        if(!encontrado) {
            this.tripulantes = Arrays.copyOf(this.tripulantes, this.tripulantes.length + 1);
            this.tripulantes[this.tripulantes.length - 1] = tripulante;
        }
    }

    public void setPasajeros(Pasajero pasajero) {

        boolean encontrado = false;

        for (Pasajero e : this.pasajeros) {
            if (e == pasajero) {
                encontrado = true;
            }
        }
        if(!encontrado){
            this.pasajeros = Arrays.copyOf(this.pasajeros, this.pasajeros.length + 1);
            this.pasajeros[this.pasajeros.length - 1] = pasajero;
        }
    }

    public void eliminarTripulante(Tripulante tripulante) {
        boolean encontrado = false;

        for (Tripulante e : this.tripulantes) {
            if (e == tripulante) {
                encontrado = true;
            }
        }

        if (encontrado) {
            Tripulante[] tripulantes1 = new Tripulante[this.tripulantes.length - 1];

            for (int i = 0, j = 0; i < this.tripulantes.length; i++, j++) {
                if (this.tripulantes[i] == tripulante) {
                    j--;
                } else {
                    tripulantes1[j] = this.tripulantes[i];
                }
            }

            this.tripulantes = tripulantes1;
        }
    }

    public void eliminarPasajero(Pasajero pasajero){
            boolean encontrado = false;

            for (Pasajero e : this.pasajeros) {
                if (e == pasajero) {
                    encontrado = true;
                }
            }

            if (encontrado) {
                Pasajero[] pasajeros1 = new Pasajero[this.pasajeros.length - 1];

                for (int i = 0, j = 0; i < this.pasajeros.length; i++, j++) {
                    if (this.pasajeros[i] == pasajero) {
                        j--;
                    } else {
                        pasajeros1[j] = this.pasajeros[i];
                    }
                }

                this.pasajeros = pasajeros1;
            }

        }

    private double cargaActual(){
            double sum = 0;

            for(Pasajero e: pasajeros){
                sum += e.getPesoMaleta();
            }
            return sum;
    }

    private boolean disponeDePiloto(){
            for(Tripulante e : this.tripulantes){
                if(e.getCargo() == Tripulante.Cargo.PILOTO){
                    return true;
                }
            }
            return false;
    }

    private boolean disponeDeCopiloto(){
        for(Tripulante e : this.tripulantes){
            if(e.getCargo() == Tripulante.Cargo.COPILOTO){
                return true;
            }
        }
        return false;
    }

    private boolean disponeDeAuxiliares(){
        int count = 0;
        for(Tripulante e : this.tripulantes){
            if(e.getCargo() == Tripulante.Cargo.AUXILIAR){
                count++;
            }
        }
        return count >= 3;
    }

    public boolean puedeDespegar(){
        if(disponeDePiloto() && disponeDeAuxiliares() && disponeDeCopiloto() && this.combustible >= planDeVuelo.getCombustible()
        && pasajeros.length <= this.capacidadMaximaPasajeros && cargaActual() <= this.cargaMaxima){
            return true;
        } else {
            return false;
        }
    }

}

