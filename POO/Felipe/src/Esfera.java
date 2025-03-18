public class Esfera extends Figura3D {

    private double raio;

    public Esfera(double raio) {
        super("Esfera");
        setRaio(raio);
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
    public String[] info() {
        return new String[]{"Raio: " + raio};
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    protected void aplicarEscala(double fator) {
        setRaio(raio * fator);
    }
}
