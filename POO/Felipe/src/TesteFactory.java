import java.util.HashMap;
import java.util.Map;

public class TesteFactory {
    public static Teste getTestes(String tipo) {
        Map<String, Teste> testes = new HashMap<String, Teste>(){{
            put("figura", new TesteFigura());
            put("poligono", new TestePoligono());
            put("circulo", new TesteCirculo());
            put("retangulo", new TesteRetangulo());
            put("quadrado", new TesteQuadrado());
            put("figura3d", new TesteFigura3D());
            put("cubo", new TesteCubo());
            put("esfera", new TesteEsfera());
            put("cilindro", new TesteCilindro());
            put("piramide", new TestePiramideQuadrada());
            put("trianguloIsosceles", new TesteTrianguloIsosceles());
            put("trianguloEquilatero", new TesteTrianguloEquilatero());
        }};
        try {
            return testes.get(tipo);
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Teste não encontrado.");
        }
    }
}
