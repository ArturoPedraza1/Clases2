public class computadora {
    private boolean encender;
    private String App;
    private boolean apagar;

    public computadora() {
        this.encender = false;
        this.App = "";
        this.apagar = false;
    }

    public computadora(boolean encender, String app, boolean apagar) {
        this.encender = encender;
        App = app;
        this.apagar = apagar;
    }

    public void setEncender(boolean encender) {
        this.encender = encender;
    }

    public void setApp(String app) {
        App = app;
    }

    public void setApagar(boolean apagar) {
        this.apagar = apagar;
    }

    public boolean getEncender() {
        return encender;
    }

    public String getApp() {
        return App;
    }

    public boolean getApagar() {
        return apagar;
    }

    @Override
    public String toString() {
        return "computadora{" +
                "encender='" + encender + '\'' +
                ", App='" + App + '\'' +
                ", apagar='" + apagar + '\'' +
                '}';
    }

    public void prender(){
        encender = true;
        System.out.println("Acaba de prender la computadora");
    }
    public void apagar(){
        apagar = true;
        System.out.println("Esta usando la computadora con una");
    }
}
