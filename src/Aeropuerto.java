import java.util.Arrays;

public class Aeropuerto {
    private final int capacidad;
    private Avion[] aviones;

    public Aeropuerto(int capacidad) {
        this.capacidad = capacidad;
        this.aviones = new Avion[0];
    }

    boolean aterrizarAvion(Avion avion){
        if(this.aviones.length < capacidad){
            this.aviones = Arrays.copyOf(this.aviones, this.aviones.length + 1);
            this.aviones[this.aviones.length - 1] = avion;
            return true;
        } else {
            return false;
        }
    }

    boolean despegarAvion(Avion avion){
        boolean encontrado = false;

        for(Avion e: this.aviones){
            if(e == avion){
                encontrado = true;
            }
        }

        if(encontrado && avion.puedeDespegar()){
            Avion[] aviones1 = new Avion[this.aviones.length - 1];

            for (int i = 0, j = 0; i < this.aviones.length; i++, j++) {
                if (this.aviones[i] == avion) {
                    j--;
                } else {
                    aviones1[j] = this.aviones[i];
                }
            }

            this.aviones = aviones1;
            return true;
        } else {
            return false;
        }
    }
}
