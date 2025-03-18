public class TrianguloEquilatero extends Figura {
    private double lado;

    public TrianguloEquilatero(double lado) {
        super("Triângulo Equilátero");
        setLado(lado);
    }

    public double getLado() {
        return lado;
    }

    public final void setLado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("Lado deve ser positivo.");
        }
        this.lado = lado;
    }

    @Override
    public double area() {
        return Math.sqrt(3) * Math.pow(lado, 2) / 4;
    }

    @Override
    public double perimetro() {
        return 3 * lado;
    }

    @Override
    public void escalar(double fator) {
        super.escalar(fator);
        lado *= fator;
    }

    @Override
    public String[] info() {
        return new String[] {"Lado: " + lado};
    }

    @Override
    protected void aplicarEscala(double fator) {
        throw new UnsupportedOperationException("Unimplemented method 'aplicarEscala'");
    }
}
