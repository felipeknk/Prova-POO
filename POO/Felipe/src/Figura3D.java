public abstract class Figura3D extends Figura {

    public Figura3D(String tipo){
        super(tipo);

        if(tipo == null) {
            throw new IllegalArgumentException("O tipo não pode ser nulo");
        }
    }
    
    public abstract double volume();

    @Override
    public void escalar(double fator) {

        if (fator <= 0) {
            throw new IllegalArgumentException("O fator de escala tem que ser positivo.");
        }

        aplicarEscala(fator);
    }

    protected abstract void aplicarEscala(double fator);
}

