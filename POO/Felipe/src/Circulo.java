public class Circulo extends Figura {

    private double raio;

    public Circulo(double raio) {
        super("Círculo");

        if (raio <= 0) {
            throw new IllegalArgumentException("O raio tem que ser positivo.");
        }

        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {

        if (raio <= 0) {
            throw new IllegalArgumentException("O raio tem que ser positivo.");
        }

        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public void escalar(double fator) {

        if (fator <= 0) {
            throw new IllegalArgumentException("O fator de escala tem que ser positivo.");
        }

        this.raio *= fator;
    }

    @Override
    public String[] info() {
        return new String[]{"Raio: " + raio};
    }

    @Override
    protected void aplicarEscala(double fator) {
        throw new UnsupportedOperationException("Método não implementado: 'aplicarEscala'");
    }
}
