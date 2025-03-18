public class Retangulo extends Poligono {

    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        super("Retângulo", 4);
        setBase(base);
        setAltura(altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {

        if (base <= 0) {
            throw new IllegalArgumentException("A base tem que ser positiva.");
        }

        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {

        if (altura <= 0) {
            throw new IllegalArgumentException("A altura tem que ser positiva.");
        }

        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void escalar(double fator) {

        if (fator <= 0) {
            throw new IllegalArgumentException("O fator de escala tem que ser positivo.");
        }

        setBase(base * fator);
        setAltura(altura * fator);
    }

    @Override
    public String[] info() {
        return new String[]{
            "Lados: 4",
            "Base: " + base,
            "Altura: " + altura
        };
    }

    @Override
    protected void aplicarEscala(double fator) {
        throw new UnsupportedOperationException("Método não implementado: 'aplicarEscala'");
    }
}
