public class Lampara {
    private boolean encendida;
    private boolean apagada;
    private String marca;

    public Lampara() {
        this.apagada = true;
        this.encendida = false;
        this.marca = "";
    }

    public Lampara(boolean encendida, boolean apagada, String marca) {
        this.encendida = encendida;
        this.apagada = apagada;
        this.marca = marca;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public void setApagada(boolean apagada) {
        this.apagada = apagada;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public boolean isApagada() {
        return apagada;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "encendida=" + encendida +
                ", apagada=" + apagada +
                ", marca='" + marca + '\'' +
                '}';
    }
}
