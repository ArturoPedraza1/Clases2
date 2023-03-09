public class CuboDeRubik {
    private boolean deshecho;
    private String haciendo;
    private boolean armado;

    public CuboDeRubik() {
        this.deshecho = true;
        this.haciendo = "";
        this.armado = false;
    }

    public CuboDeRubik(boolean deshecho, String haciendo, boolean armado) {
        this.deshecho = deshecho;
        this.haciendo = haciendo;
        this.armado = armado;
    }

    public void setDeshecho(boolean deshecho) {
        this.deshecho = deshecho;
    }

    public void setHaciendo(String haciendo) {
        this.haciendo = haciendo;
    }

    public void setArmado(boolean armado) {
        this.armado = armado;
    }

    public boolean isDeshecho() {
        return deshecho;
    }

    public String getHaciendo() {
        return haciendo;
    }

    public boolean isArmado() {
        return armado;
    }

    @Override
    public String toString() {
        return "CuboDeRubik{" +
                "deshecho=" + deshecho +
                ", haciendo='" + haciendo + '\'' +
                ", armado=" + armado +
                '}';
    }
    public void desarmado(){
        deshecho = true;
        System.out.println("El cubo rubik esta deshecho");
    }
    public void acabado(){
        armado = true;
        System.out.println("El cubo de rubik esta armado");
    }

}
