public class TrianguloRetangulo extends Figura {
    private double base;
    private double altura;

    public TrianguloRetangulo(double base, double altura) {
        super("Triângulo Retângulo");
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

    public double getHipotenusa() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    @Override
    public double area() {
        return base * altura / 2;
    }

    @Override
    public double perimetro() {
        return base + altura + getHipotenusa();
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
}
