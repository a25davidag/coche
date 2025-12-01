import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Espero que te lo pases bien!");

        ArrayList<Coche> listaCoches = new ArrayList<>();

        Motor diesel = new Motor(100,500);
        Motor gasolina = new Motor(1232,2344);

        Coche coche1 = new Coche("auris","toyota",diesel);
        Coche coche2 = new Coche("c4","Citroen",diesel);
        Coche coche3 = new Coche("Panda","Seat",gasolina);
        Coche coche4 = new Coche("Aventador","Lamborgini",gasolina);


        listaCoches.add(coche1);
        listaCoches.add(coche2);
        listaCoches.add(coche3);
        listaCoches.add(coche4);


        for (Coche coche: listaCoches){
            if(coche.getMotor()== null){
                coche.setMotor(gasolina);
            }
        }

        for(Coche coche: listaCoches){
            coche.arrancar();
        }
        for(Coche coche: listaCoches){
            coche.detener();
        }

    }
}