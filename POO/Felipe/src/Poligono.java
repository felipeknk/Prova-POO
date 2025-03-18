public abstract class Poligono extends Figura {

    private int lados;

    public Poligono(String tipo, int lados) {
        super(tipo);
        setLados(lados);
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {

        if (lados < 3) {
            throw new IllegalArgumentException("Um polígono tem que ter pelo menos 3 lados.");
        }

        this.lados = lados;
    }

    @Override
    public String[] info() {
        return new String[]{"Lados: " + lados};
    }
}
