public class PiramideQuadrada extends Figura {
    private double base;
    private double altura;

    public PiramideQuadrada(double base, double altura) {
        super("Pirâmide Quadrada");  
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Base e altura devem ser maiores que zero.");
        }
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("A base deve ser maior que zero.");
        }
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("A altura deve ser maior que zero.");
        }
        this.altura = altura;
    }

    @Override
    public String[] info() {
        return new String[] { "Base: " + base, "Altura: " + altura };
    }

    @Override
    public double area() {
        double areaBase = base * base;
        double areaFaces = 4 * (base * Math.sqrt(Math.pow(base / 2, 2) + Math.pow(altura, 2)) / 2);
        return areaBase + areaFaces;
    }

    @Override
    public double perimetro() {
        return 4 * base;  
    }

    @Override
    protected void aplicarEscala(double fator) {
        if (fator <= 0) {
            throw new IllegalArgumentException("O fator de escala deve ser maior que zero.");
        }
        this.base *= fator;
        this.altura *= fator;
    }

    public double volume() {
        return (base * base * altura) / 3;
    }
}
