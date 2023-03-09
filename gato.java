public class gato {
    private boolean despierto;
    private boolean dormido;
    private boolean ronroneando;

    public gato() {
        this.despierto = true;
        this.ronroneando = false;
        this.dormido = false;
    }

    public gato(boolean despierto, boolean dormido, boolean ronroneando) {
        this.despierto = despierto;
        this.dormido = dormido;
        this.ronroneando = ronroneando;
    }

    public void setDespierto(boolean despierto) {
        this.despierto = despierto;
    }

    public void setDormido(boolean dormido) {
        this.dormido = dormido;
    }

    public void setRonroneando(boolean ronroneando) {
        this.ronroneando = ronroneando;
    }

    public boolean isDespierto() {
        return despierto;
    }

    public boolean isDormido() {
        return dormido;
    }

    public boolean isRonroneando() {
        return ronroneando;
    }

    @Override
    public String toString() {
        return "gato{" +
                "despierto=" + despierto +
                ", dormido=" + dormido +
                ", ronroneando=" + ronroneando +
                '}';
    }
    public void despierto(){
        despierto = true;
        System.out.println("El gato esta despierto");
    }
    public void ronrone(){
        ronroneando = true;
        System.out.println("El gato esta ronroneando");
    }
}
