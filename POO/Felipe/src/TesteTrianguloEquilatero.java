import java.lang.reflect.Modifier;

public class TesteTrianguloEquilatero extends Teste {
    // public boolean a_classe_retangulo_nao_deveria_ser_abstrata() {
    //     return !Modifier.isAbstract(Retangulo.class.getModifiers());
    // }

    // public boolean a_classe_retangulo_deveria_estender_poligono() {
    //     return Poligono.class.isAssignableFrom(Retangulo.class);
    // }

    // public boolean um_retangulo_deveria_ser_uma_instancia_de_figura() {
    //     Retangulo r = new Retangulo(1, 2);
    //     return r instanceof Figura;
    // }

    // public boolean um_retangulo_deveria_ser_uma_instancia_de_poligono() {
    //     Retangulo r = new Retangulo(1, 2);
    //     return r instanceof Poligono;
    // }

    // public boolean um_retangulo_deveria_ter_tipo_correto() {
    //     Retangulo r = new Retangulo(1, 2);
    //     return r.getTipo().equals("Retângulo");
    // }

    // public boolean um_retangulo_deveria_ter_o_numero_de_lados_correto() {
    //     Retangulo r = new Retangulo(1, 2);
    //     return r.getLados() == 4;
    // }

    // public boolean um_retangulo_deveria_ter_base_correta() {
    //     Retangulo r = new Retangulo(3, 4);
    //     return r.getBase() == 3;
    // }

    // public boolean um_retangulo_deveria_ter_altura_correta() {
    //     Retangulo r = new Retangulo(5, 6);
    //     return r.getAltura() == 6;
    // }

    // public boolean um_retangulo_deveria_retornar_as_informacoes_corretamente() {
    //     Retangulo r = new Retangulo(7, 8);
    //     String[] info = r.info();
    //     return info[0].equals("Lados: 4") && info[1].equals("Base: 7.0") && info[2].equals("Altura: 8.0");
    // }

    // public boolean um_retangulo_deveria_ter_area_correta() {
    //     Retangulo r = new Retangulo(9, 10);
    //     return r.area() == 90;
    // }

    // public boolean um_retangulo_deveria_ter_perimetro_correto() {
    //     Retangulo r = new Retangulo(11, 12);
    //     return r.perimetro() == 46;
    // }

    // public boolean um_retangulo_deveria_poder_ser_escalado() {
    //     Retangulo r = new Retangulo(13, 14);
    //     r.escalar(2);
    //     return r.getBase() == 26 && r.getAltura() == 28;
    // }

    // public boolean um_retangulo_nao_deveria_poder_ser_escalado_com_fator_negativo() {
    //     try {
    //         Retangulo r = new Retangulo(15, 16);
    //         r.escalar(-1);
    //         return false;
    //     } catch (IllegalArgumentException e) {
    //         return true;
    //     }
    // }

    // public boolean um_retangulo_nao_deveria_poder_ser_escalado_com_fator_zero() {
    //     try {
    //         Retangulo r = new Retangulo(17, 18);
    //         r.escalar(0);
    //         return false;
    //     } catch (IllegalArgumentException e) {
    //         return true;
    //     }
    // }

    // public boolean um_retangulo_nao_deveria_ter_base_negativa() {
    //     try {
    //         Retangulo r = new Retangulo(-1, 20);
    //         return false;
    //     } catch (IllegalArgumentException e) {
    //         return true;
    //     }
    // }

    // public boolean um_retangulo_nao_deveria_ter_altura_negativa() {
    //     try {
    //         Retangulo r = new Retangulo(21, -1);
    //         return false;
    //     } catch (IllegalArgumentException e) {
    //         return true;
    //     }
    // }

    // public boolean um_retangulo_nao_deveria_ter_base_zero() {
    //     try {
    //         Retangulo r = new Retangulo(0, 22);
    //         return false;
    //     } catch (IllegalArgumentException e) {
    //         return true;
    //     }
    // }

    // public boolean um_retangulo_nao_deveria_ter_altura_zero() {
    //     try {
    //         Retangulo r = new Retangulo(23, 0);
    //         return false;
    //     } catch (IllegalArgumentException e) {
    //         return true;
    //     }
    // }

    // public boolean um_retangulo_nao_deveria_ter_base_negativa_ao_ser_modificada() {
    //     try {
    //         Retangulo r = new Retangulo(24, 25);
    //         r.setBase(-1);
    //         return false;
    //     } catch (IllegalArgumentException e) {
    //         return true;
    //     }
    // }

    // public boolean um_retangulo_nao_deveria_ter_altura_negativa_ao_ser_modificada() {
    //     try {
    //         Retangulo r = new Retangulo(26, 27);
    //         r.setAltura(-1);
    //         return false;
    //     } catch (IllegalArgumentException e) {
    //         return true;
    //     }
    // }

    // public boolean um_retangulo_nao_deveria_ter_base_zero_ao_ser_modificada() {
    //     try {
    //         Retangulo r = new Retangulo(28, 29);
    //         r.setBase(0);
    //         return false;
    //     } catch (IllegalArgumentException e) {
    //         return true;
    //     }
    // }

    // public boolean um_retangulo_nao_deveria_ter_altura_zero_ao_ser_modificada() {
    //     try {
    //         Retangulo r = new Retangulo(30, 31);
    //         r.setAltura(0);
    //         return false;
    //     } catch (IllegalArgumentException e) {
    //         return true;
    //     }
    // }



    // private double lado;

    // public TrianguloEquilatero(double lado) {
    //     super("Triângulo Equilátero");
    //     setLado(lado);
    // }

    // public double getLado() {
    //     return lado;
    // }

    // public final void setLado(double lado) {
    //     if (lado <= 0) {
    //         throw new IllegalArgumentException("Lado deve ser positivo.");
    //     }
    //     this.lado = lado;
    // }

    // @Override
    // public double area() {
    //     return Math.sqrt(3) * Math.pow(lado, 2) / 4;
    // }

    // @Override
    // public double perimetro() {
    //     return 3 * lado;
    // }

    // @Override
    // public void escalar(double fator) {
    //     super.escalar(fator);
    //     lado *= fator;
    // }

    // @Override
    // public String[] info() {
    //     return new String[] {"Lado: " + lado};
    // }

    public boolean a_classe_triangulo_equilatero_nao_deveria_ser_abstrata() {
        return !Modifier.isAbstract(TrianguloEquilatero.class.getModifiers());
    }

    public boolean a_classe_triangulo_equilatero_deveria_estender_figura() {
        return Figura.class.isAssignableFrom(TrianguloEquilatero.class);
    }

    public boolean um_triangulo_equilatero_deveria_ser_uma_instancia_de_figura() {
        TrianguloEquilatero t = new TrianguloEquilatero(1);
        return t instanceof Figura;
    }

    public boolean um_triangulo_equilatero_deveria_ter_tipo_correto() {
        TrianguloEquilatero t = new TrianguloEquilatero(1);
        return t.getTipo().equals("Triângulo Equilátero");
    }

    public boolean um_triangulo_equilatero_deveria_ter_lado_correto() {
        TrianguloEquilatero t = new TrianguloEquilatero(2);
        return t.getLado() == 2;
    }

    public boolean um_triangulo_equilatero_deveria_retornar_as_informacoes_corretamente() {
        TrianguloEquilatero t = new TrianguloEquilatero(3);
        String[] info = t.info();
        return info[0].equals("Lado: 3.0");
    }

    public boolean um_triangulo_equilatero_deveria_ter_area_correta() {
        TrianguloEquilatero t = new TrianguloEquilatero(4);
        return t.area() == 4 * Math.sqrt(3);
    }

    public boolean um_triangulo_equilatero_deveria_ter_perimetro_correto() {
        TrianguloEquilatero t = new TrianguloEquilatero(5);
        return t.perimetro() == 15;
    }

    public boolean um_triangulo_equilatero_deveria_poder_ser_escalado() {
        TrianguloEquilatero t = new TrianguloEquilatero(6);
        t.escalar(2);
        return t.getLado() == 12;
    }

    public boolean um_triangulo_equilatero_deveria_poder_ser_escalado_com_fator_menor_que_1() {
        TrianguloEquilatero t = new TrianguloEquilatero(7);
        t.escalar(0.5);
        return t.getLado() == 3.5;
    }

    public boolean um_triangulo_equilatero_nao_deveria_poder_ser_escalado_com_fator_negativo() {
        try {
            TrianguloEquilatero t = new TrianguloEquilatero(8);
            t.escalar(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_triangulo_equilatero_nao_deveria_poder_ser_escalado_com_fator_zero() {
        try {
            TrianguloEquilatero t = new TrianguloEquilatero(9);
            t.escalar(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_triangulo_equilatero_nao_deveria_ter_lado_negativo() {
        try {
            TrianguloEquilatero t = new TrianguloEquilatero(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_triangulo_equilatero_nao_deveria_ter_lado_zero() {
        try {
            TrianguloEquilatero t = new TrianguloEquilatero(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_triangulo_equilatero_nao_deveria_ter_lado_negativo_ao_ser_modificado() {
        try {
            TrianguloEquilatero t = new TrianguloEquilatero(1);
            t.setLado(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_triangulo_equilatero_nao_deveria_ter_lado_zero_ao_ser_modificado() {
        try {
            TrianguloEquilatero t = new TrianguloEquilatero(1);
            t.setLado(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_triangulo_equilatero_deveria_ter_o_perimetro_equivalente_aos_triangulos_retangulos_formados_por_suas_metaades() {
        TrianguloEquilatero t = new TrianguloEquilatero(10);
        double altura = 10 * Math.sqrt(3) / 2.;
        TrianguloRetangulo t1 = new TrianguloRetangulo(5, altura);
        TrianguloRetangulo t2 = new TrianguloRetangulo(5, altura);
        return t.perimetro() == t1.perimetro() + t2.perimetro() - altura * 2;
    }

    public boolean um_triangulo_equilatero_deveria_ter_a_area_equivalente_aos_triangulos_retangulos_formados_por_suas_metaades() {
        TrianguloEquilatero t = new TrianguloEquilatero(11);
        double altura = 11 * Math.sqrt(3) / 2.;
        TrianguloRetangulo t1 = new TrianguloRetangulo(5.5, altura);
        TrianguloRetangulo t2 = new TrianguloRetangulo(5.5, altura);
        return t.area() == t1.area() + t2.area();
    }
}