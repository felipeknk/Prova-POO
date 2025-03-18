public class TrianguloIsosceles extends Figura {
    private double base;
    private double altura;

    public TrianguloIsosceles(double base, double altura) {
        super("Triângulo Isósceles");
        setBase(base);
        setAltura(altura);
    }

    public double getBase() {
        return base;
    }

    public final void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("Base deve ser positiva.");
        }
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public final void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser positiva.");
        }
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura / 2;
    }

    @Override
    public double perimetro() {
        return 2 * (new TrianguloRetangulo(base / 2, altura)).getHipotenusa() + base;
    }

    @Override
    public void escalar(double fator) {
        super.escalar(fator);
        base *= fator;
        altura *= fator;
    }

    @Override
    public String[] info() {
        return new String[] {"Base: " + base, "Altura: " + altura};
    }

    @Override
    protected void aplicarEscala(double fator) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'aplicarEscala'");
    }
}
