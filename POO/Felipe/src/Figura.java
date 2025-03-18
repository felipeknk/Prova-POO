public abstract class Figura {

    private String tipo;

    public Figura(String tipo) {

        setTipo(tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {

        if (tipo == null || tipo.trim().isEmpty()) {
            throw new IllegalArgumentException("O tipo da figura não pode ser nulo ou vazio");
        }

        this.tipo = tipo;
    }

    public abstract String[] info();

    public abstract double area();

    public abstract double perimetro();

    public void escalar(double fator) {

        if (fator <= 0) {
            throw new IllegalArgumentException("O fator de escala tem que ser positivo.");
        }

        aplicarEscala(fator);
    }

    protected abstract void aplicarEscala(double fator);
}
