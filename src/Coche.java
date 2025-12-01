public class Coche {
    private String modelo;
    private String marca;
    private Motor motor;

    public Coche(String modelo,String marca,Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
        this.marca = marca;
    }

    public Coche(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void arrancar(){
        System.out.println("Arrancamos el coche");
        motor.encender();

    }
    public void detener() {
        System.out.println("Detenemos el coche");
        motor.apagr();
    }
}
