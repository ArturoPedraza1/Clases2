public class Pais {
    private String nombre;
    private String idioma;
    private String cultura;

    public Pais() {
        this.idioma = "Español";
        this.cultura = "Mexicana";
        this.nombre = "Mexico";
    }

    public Pais(String nombre, String idioma, String cultura) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.cultura = cultura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setCultura(String cultura) {
        this.cultura = cultura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getCultura() {
        return cultura;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", idioma='" + idioma + '\'' +
                ", cultura='" + cultura + '\'' +
                '}';
    }
    public void mostrar(){
        System.out.println("El nombre del pais es: " + nombre);
    }

    public void hablando(){
        System.out.println("Los mexicanos estan hablando en su idioma: "+ idioma);
    }
}
