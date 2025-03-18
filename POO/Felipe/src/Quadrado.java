public class Quadrado extends Retangulo {
    
    public Quadrado(double lado) {
        super(lado, lado);
    }

    @Override
    public String getTipo() {
        return "Quadrado";
    }

    public double getLado() {
        return getBase(); 
    }

    public void setLado(double lado) {
        setBase(lado);
        setAltura(lado);
    }

    @Override
    public String[] info() {
        return new String[]{
            "Lados: 4",
            "Lado: " + getLado()
        };
    }
}
