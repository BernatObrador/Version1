import java.util.Arrays;

public class Pasajero {
    private final String DNI;
    private String nombre;
    private byte edad;
    private Maleta[] maletas;



    public Pasajero(String DNI, String nombre, byte edad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
        this.maletas = new Maleta[0];
    }

    public void setMaletas(Maleta maleta){
        if(this.edad > 17){
            this.maletas = Arrays.copyOf(maletas,maletas.length+1);
            this.maletas[maletas.length - 1] = maleta;
        }
    }

    public double getPesoMaleta(){
        double sum = 0;

        for(Maleta e: maletas){
            sum += e.getPeso();
        }
        return sum;
    }

    void eliminarMaleta(Maleta maleta){
        boolean encontrada = false;

        for(Maleta e: maletas){
            if(e == maleta){
                encontrada = true;
            }
        }

        if(encontrada){
            Maleta[] newMaletas = new Maleta[this.maletas.length-1];

            for(int i = 0, j = 0; i < this.maletas.length; i++, j++){
                if(this.maletas[i] == maleta){
                    j--;
                } else {
                    newMaletas[j] = this.maletas[i];
                }

            }
            this.maletas = newMaletas;
        }
    }
}
