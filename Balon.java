public class Balon {
    private boolean quieto;
    private boolean rueda;
    private String material;

    public Balon() {
        this.material = "";
        this.quieto = false;
        this.rueda = true;
    }

    public Balon(boolean quieto, boolean rueda, String material) {
        this.quieto = quieto;
        this.rueda = rueda;
        this.material = material;
    }

    public void setQuieto(boolean quieto) {
        this.quieto = quieto;
    }

    public void setRueda(boolean rueda) {
        this.rueda = rueda;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isQuieto() {
        return quieto;
    }

    public boolean isRueda() {
        return rueda;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "quieto=" + quieto +
                ", rueda=" + rueda +
                ", material='" + material + '\'' +
                '}';
    }
    public void quieto(){
        quieto = false;
        System.out.println("El balon no esta quieto");
    }
    public void girar(){
        rueda = true;
        System.out.println("El balon esta girando");
    }
}
