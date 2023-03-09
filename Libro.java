public class Libro {
    private boolean cerrado;
    private boolean abierto;
    private String pagina;

    public Libro() {
        this.abierto = false;
        this.cerrado = true;
        this.pagina = "";
    }

    public Libro(boolean cerrado, boolean abierto, String pagina) {
        this.cerrado = cerrado;
        this.abierto = abierto;
        this.pagina = pagina;
    }

    public void setCerrado(boolean cerrado) {
        this.cerrado = cerrado;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public boolean isCerrado() {
        return cerrado;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public String getPagina() {
        return pagina;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "cerrado=" + cerrado +
                ", abierto=" + abierto +
                ", pagina='" + pagina + '\'' +
                '}';
    }
    public void cerrad(){
        cerrado = true;
        System.out.println("El libro esta cerrado");
    }
    public void abi(){
        abierto = true;
        System.out.println("El libro esta abierto");
    }
}
