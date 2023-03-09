public class Giroscopio {
    private boolean Girar;
    private String medir;
    private boolean alineado;

    public Giroscopio() {
        this.Girar = false;
        this.medir = "";
        this.alineado = false;
    }

    public Giroscopio(boolean girar, String medir, boolean alineado) {
        Girar = girar;
        this.medir = medir;
        this.alineado = alineado;
    }

    public void setGirar(boolean girar) {
        Girar = girar;
    }

    public void setMedir(String medir) {
        this.medir = medir;
    }

    public void setAlineado(boolean alineado) {
        this.alineado = alineado;
    }

    public boolean getGirar() {
        return Girar;
    }

    public String getMedir() {
        return medir;
    }

    public boolean getAlineado() {
        return alineado;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "Girar='" + Girar + '\'' +
                ", medir='" + medir + '\'' +
                ", alineado='" + alineado + '\'' +
                '}';
    }

    public void Gira(){
        Girar = true;
        System.out.println("El giroscopio esta girando");
    }
    public void Detenerse(){
        alineado = true;
        System.out.println("El giroscopio esta alineado");
    }
}
