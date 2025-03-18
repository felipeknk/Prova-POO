public class Cilindro extends Figura3D {
    
    private double raio;
    private double altura;

    public Cilindro(double raio, double altura) {
        super("Cilindro"); 
        
        if (raio <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Raio e altura devem ser maiores que zero.");
        }
        
        this.raio = raio;
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser maior que zero.");
        }
        this.raio = raio;
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
        return new String[] { "Raio: " + raio, "Altura: " + altura };
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    @Override
    public double area() {
        return 2 * Math.PI * raio * altura + 2 * Math.PI * Math.pow(raio, 2);
    }

    @Override
    protected void aplicarEscala(double fator) {
        if (fator <= 0) {
            throw new IllegalArgumentException("O fator de escala deve ser maior que zero.");
        }
        this.raio *= fator;
        this.altura *= fator;
    }
}
