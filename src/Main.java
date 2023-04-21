import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Maleta maleta = new Maleta(15.8);
        Maleta maleta1 = new Maleta();
        maleta1.setPeso(20.6);
        Maleta maleta2 = new Maleta(12.3);
        Maleta maleta3 = new Maleta(40.5);
        Maleta maleta4 = new Maleta(60);
        Maleta maleta5 = new Maleta(5.5);
        Maleta maleta6 = new Maleta(22.2);
        Maleta maleta7 = new Maleta(23.6);
        Maleta maleta8 = new Maleta(33.4);
        Maleta maleta9 = new Maleta(2000);

        Pasajero p = new Pasajero("123142j", "Bernat",(byte)23);
        Pasajero p1 = new Pasajero("1214h", "Pedro",(byte)22);
        Pasajero p2 = new Pasajero("123142j", "Cristian",(byte)50);
        Pasajero p3 = new Pasajero("123142j", "Fernando",(byte)16);
        Pasajero p4 = new Pasajero("123142j", "Marcus",(byte)65);
        Pasajero p5 = new Pasajero("123142j", "Albert",(byte)30);
        Pasajero p6 = new Pasajero("123142j", "Ismael",(byte)42);
        Pasajero p7 = new Pasajero("123142j", "Jaume",(byte)18);
        Pasajero p8 = new Pasajero("123142j", "Pau",(byte)17);
        Pasajero p9 = new Pasajero("123142j", "Daniel",(byte)35);
        p.setMaletas(maleta);
        p.setMaletas(maleta1);
        p1.setMaletas(maleta1);
        p2.setMaletas(maleta2);
        p3.setMaletas(maleta2);
        p3.setMaletas(maleta4);
        p4.setMaletas(maleta4);
        p5.setMaletas(maleta5);
        p6.setMaletas(maleta);
        p6.setMaletas(maleta6);
        p7.setMaletas(maleta7);
        p8.setMaletas(maleta8);
        p9.setMaletas(maleta9);






        Tripulante tripulante = new Tripulante("12141H","Bernat",(byte)40,"PILOTO");
        Tripulante tripulante1 = new Tripulante("12141H","Pedro",(byte)18,"COPILOTO");
        Tripulante tripulante2 = new Tripulante("12141H","Juan",(byte)25,"AUXILIAR");
        Tripulante tripulante3 = new Tripulante("12141H","Carlos",(byte)20,"AUXILIAR");
        Tripulante tripulante4 = new Tripulante("12141H","Bernat",(byte)18,"AUXILIAR");
        Tripulante tripulante5 = new Tripulante("12141H","Bernat",(byte)35,"COPILOTO");
        Tripulante tripulante6 = new Tripulante("12141H","Juan",(byte)44,"COPILOTO");
        Tripulante tripulante7 = new Tripulante("12141H","Bernat",(byte)56,"PILOTO");
        Tripulante tripulante8 = new Tripulante("12141H","Carlos",(byte)23,"AUXILIAR");
        Tripulante tripulante9 = new Tripulante("12141H","Bernat",(byte)40,"AUXILIAR");

        PlanDeVuelo pl = new PlanDeVuelo("Madrid", "Oporto", LocalDateTime.now(), 1000);
        PlanDeVuelo pl1 = new PlanDeVuelo("Oporto", "Palma de Mallorca", LocalDateTime.now(), 1500);
        PlanDeVuelo pl2 = new PlanDeVuelo("Frankfurt", "Praga", LocalDateTime.now(), 1250);
        PlanDeVuelo pl3 = new PlanDeVuelo("Madrid", "Mejico", LocalDateTime.now(), 2500);
        PlanDeVuelo pl4 = new PlanDeVuelo("Inglaterra", "Menorca", LocalDateTime.now(), 2000);

        Avion av = new Avion(2000, 15, pl, 1200);
        Avion av1 = new Avion(1500, 10, pl1, 1800);
        Avion av2 = new Avion(1500, 25, pl2, 1500);
        Avion av3 = new Avion(1000, 5, pl3, 2800);
        Avion av4 = new Avion(2000, 15, pl4, 2100);

        av.setPasajeros(p1);
        av.setPasajeros(p2);
        av.setPasajeros(p3);
        av.setPasajeros(p4);
        av.setPasajeros(p5);
        av.setPasajeros(p6);
        av.setPasajeros(p7);
        av.setPasajeros(p8);
        av.setPasajeros(p9);
        av.setTripulantes(tripulante);
        av.setTripulantes(tripulante1);
        av.setTripulantes(tripulante2);
        av.setTripulantes(tripulante3);
        av.setTripulantes(tripulante4);



        av1.setPasajeros(p1);
        av1.setPasajeros(p2);
        av1.setPasajeros(p3);
        av1.setPasajeros(p4);
        av1.setPasajeros(p5);
        av1.setPasajeros(p6);
        av1.setPasajeros(p7);
        av1.setPasajeros(p8);
        av1.setPasajeros(p);
        av1.setTripulantes(tripulante);
        av1.setTripulantes(tripulante1);
        av1.setTripulantes(tripulante2);
        av1.setTripulantes(tripulante3);
        av1.setTripulantes(tripulante4);
        av1.setTripulantes(tripulante5);
        av1.setTripulantes(tripulante6);
        av1.setTripulantes(tripulante7);
        av1.setTripulantes(tripulante8);
        av1.setTripulantes(tripulante9);

        av2.setPasajeros(p1);
        av2.setPasajeros(p2);
        av2.setPasajeros(p3);
        av2.setPasajeros(p4);
        av2.setPasajeros(p5);
        av2.setTripulantes(tripulante);
        av2.setTripulantes(tripulante1);


        av3.setPasajeros(p1);
        av3.setPasajeros(p2);
        av3.setPasajeros(p3);
        av3.setPasajeros(p4);
        av3.setPasajeros(p5);
        av3.setPasajeros(p6);
        av3.setPasajeros(p7);
        av3.setPasajeros(p8);
        av3.setPasajeros(p9);
        av3.setPasajeros(p);
        av3.setTripulantes(tripulante);
        av3.setTripulantes(tripulante1);
        av3.setTripulantes(tripulante2);
        av3.setTripulantes(tripulante3);
        av3.setTripulantes(tripulante4);
        av3.setTripulantes(tripulante5);
        av3.setTripulantes(tripulante6);
        av3.setTripulantes(tripulante7);
        av3.setTripulantes(tripulante8);
        av3.setTripulantes(tripulante9);

        av4.setPasajeros(p1);
        av4.setPasajeros(p2);
        av4.setPasajeros(p3);
        av4.setPasajeros(p4);
        av4.setPasajeros(p5);
        av4.setPasajeros(p6);
        av4.setPasajeros(p7);
        av4.setTripulantes(tripulante);
        av4.setTripulantes(tripulante1);
        av4.setTripulantes(tripulante2);
        av4.setTripulantes(tripulante3);
        av4.setTripulantes(tripulante4);
        av4.setTripulantes(tripulante5);

        Aeropuerto aeropuerto = new Aeropuerto(5);

        if(aeropuerto.aterrizarAvion(av)){
            System.out.println("El avion 1 ha podido aterrizar");
        } else {
            System.out.println("EL avion 1 no ha podido aterrizar");
        }
        if(aeropuerto.aterrizarAvion(av1)){
            System.out.println("El avion 2 ha podido aterrizar");
        } else {
            System.out.println("EL avion 2 no ha podido aterrizar");
        }
        if(aeropuerto.aterrizarAvion(av2)){
            System.out.println("El avion 3 ha podido aterrizar");
        } else {
            System.out.println("EL avion 3 no ha podido aterrizar");
        }
        if(aeropuerto.aterrizarAvion(av3)){
            System.out.println("El avion 4 ha podido aterrizar");
        } else {
            System.out.println("EL avion 4 no ha podido aterrizar");
        }
        if(aeropuerto.aterrizarAvion(av4)){
            System.out.println("El avion 5 ha podido aterrizar");
        } else {
            System.out.println("EL avion 5 no ha podido aterrizar");
        }

        System.out.println();


        if(aeropuerto.despegarAvion(av)){
            System.out.println("El avion 1 ha podido despegar");
        } else {
            System.out.println("EL avion 1 no ha podido despegar");
        }
        if(aeropuerto.despegarAvion(av1)){
            System.out.println("El avion 2 ha podido despegar");
        } else {
            System.out.println("EL avion 2 no ha podido despegar");
        }
        if(aeropuerto.despegarAvion(av2)){
            System.out.println("El avion 3 ha podido despegar");
        } else {
            System.out.println("EL avion 3 no ha podido despegar");
        }
        if(aeropuerto.despegarAvion(av3)){
            System.out.println("El avion 4 ha podido despegar");
        } else {
            System.out.println("EL avion 4 no ha podido despegar");
        }
        if(aeropuerto.despegarAvion(av4)){
            System.out.println("El avion 5 ha podido despegar");
        } else {
            System.out.println("EL avion 5 no ha podido despegar");
        }
    }
}