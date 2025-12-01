public class Motor {

    private int potencia;
    private int numBujias;



    public Motor(int potencia, int numBujias) {
        this.potencia = potencia;
        this.numBujias = numBujias;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNumBujias() {
        return numBujias;
    }

    public void setNumBujias(int numBujias) {
        this.numBujias = numBujias;
    }

    public void encender (){
        System.out.println("Motor encendido");
    }

    public void apagr(){
        System.out.println("Motor apagado");
    }


}
