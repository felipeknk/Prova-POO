public class Cubo extends Figura3D {

    private double aresta;

    public Cubo(double aresta) {
        super("Cubo");
        setAresta(aresta);
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {

        if (aresta <= 0) {
            throw new IllegalArgumentException("A aresta tem que ser positiva.");
        }
        
        this.aresta = aresta;
    }

    @Override
    public double volume() {
        return Math.pow(aresta, 3);
    }

    @Override
    public double area() {
        return 6 * Math.pow(aresta, 2);
    }

    @Override
    public double perimetro() {
        return 12 * aresta;
    }

    @Override
    public String[] info() {
        return new String[]{"Lado: " + aresta};
    }

    @Override
    protected void aplicarEscala(double fator) {
        setAresta(aresta * fator);
    }
}
