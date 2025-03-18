import java.lang.reflect.Modifier;

public class TesteTrianguloIsosceles extends Teste {
    // public class TrianguloIsosceles extends Figura {
    //     private double base;
    //     private double altura;
    
    //     public TrianguloIsosceles(double base, double altura) {
    //         super("Triângulo Isósceles");
    //         setBase(base);
    //         setAltura(altura);
    //     }
    
    //     public double getBase() {
    //         return base;
    //     }
    
    //     public final void setBase(double base) {
    //         if (base <= 0) {
    //             throw new IllegalArgumentException("Base deve ser positiva.");
    //         }
    //         this.base = base;
    //     }
    
    //     public double getAltura() {
    //         return altura;
    //     }
    
    //     public final void setAltura(double altura) {
    //         if (altura <= 0) {
    //             throw new IllegalArgumentException("Altura deve ser positiva.");
    //         }
    //         this.altura = altura;
    //     }
    
    //     @Override
    //     public double area() {
    //         return base * altura / 2;
    //     }
    
    //     @Override
    //     public double perimetro() {
    //         return 2 * (new TrianguloRetangulo(base / 2, altura)).getHipotenusa() + base;
    //     }
    
    //     @Override
    //     public void escalar(double fator) {
    //         super.escalar(fator);
    //         base *= fator;
    //         altura *= fator;
    //     }
    
    //     @Override
    //     public String[] info() {
    //         return new String[] {"Base: " + base, "Altura: " + altura};
    //     }
    // }
    

    // public boolean a_classe_triangulo_equilatero_nao_deveria_ser_abstrata() {
    //     return !Modifier.isAbstract(TrianguloEquilatero.class.getModifiers());
    // }

    // public boolean a_classe_triangulo_equilatero_deveria_estender_figura() {
    //     return Figura.class.isAssignableFrom(TrianguloEquilatero.class);
    // }

    // public boolean um_triangulo_equilatero_deveria_ser_uma_instancia_de_figura() {
    //     TrianguloEquilatero t = new TrianguloEquilatero(1);
    //     return t instanceof Figura;
    // }

    // public boolean um_triangulo_equilatero_deveria_ter_tipo_correto() {
    //     TrianguloEquilatero t = new TrianguloEquilatero(1);
    //     return t.getTipo().equals("Triângulo Equilátero");
    // }

    // public boolean um_triangulo_equilatero_deveria_ter_lado_correto() {
    //     TrianguloEquilatero t = new TrianguloEquilatero(2);
    //     return t.getLado() == 2;
    // }

    // public boolean um_triangulo_equilatero_deveria_retornar_as_informacoes_corretamente() {
    //     TrianguloEquilatero t = new TrianguloEquilatero(3);
    //     String[] info = t.info();
    //     return info[0].equals("Lado: 3.0");
    // }

    // public boolean um_triangulo_equilatero_deveria_ter_area_correta() {
    //     TrianguloEquilatero t = new TrianguloEquilatero(4);
    //     return t.area() == 4 * Math.sqrt(3);
    // }

    // public boolean um_triangulo_equilatero_deveria_ter_perimetro_correto() {
    //     TrianguloEquilatero t = new TrianguloEquilatero(5);
    //     return t.perimetro() == 15;
    // }

    // public boolean um_triangulo_equilatero_deveria_poder_ser_escalado() {
    //     TrianguloEquilatero t = new TrianguloEquilatero(6);
    //     t.escalar(2);
    //     return t.getLado() == 12;
    // }

    // public boolean um_triangulo_equilatero_deveria_poder_ser_escalado_com_fator_menor_que_1() {
    //     TrianguloEquilatero t = new TrianguloEquilatero(7);
    //     t.escalar(0.5);
    //     return t.getLado() == 3.5;
    // }

    // public boolean um_triangulo_equilatero_nao_deveria_poder_ser_escalado_com_fator_negativo() {
    //     try {
    //         TrianguloEquilatero t = new TrianguloEquilatero(8);
    //         t.escalar(-1);
    //         return false;
    //     } catch (IllegalArgumentException e) {
    //         return true;
    //     }
    // }

    // public boolean um_triangulo_equilatero_nao_deveria_poder_ser_escalado_com_fator_zero() {
    //     try {
    //         TrianguloEquilatero t = new TrianguloEquilatero(9);
    //         t.escalar(0);
    //         return false;
    //     } catch (IllegalArgumentException e) {
    //         return true;
    //     }
    // }

    // public boolean um_triangulo_equilatero_nao_deveria_ter_lado_negativo() {
    //     try {
    //         TrianguloEquilatero t = new TrianguloEquilatero(-1);
    //         return false;
    //     } catch (IllegalArgumentException e) {
    //         return true;
    //     }
    // }

    // public boolean um_triangulo_equilatero_nao_deveria_ter_lado_zero() {
    //     try {
    //         TrianguloEquilatero t = new TrianguloEquilatero(0);
    //         return false;
    //     } catch (IllegalArgumentException e) {
    //         return true;
    //     }
    // }

    // public boolean um_triangulo_equilatero_nao_deveria_ter_lado_negativo_ao_ser_modificado() {
    //     try {
    //         TrianguloEquilatero t = new TrianguloEquilatero(1);
    //         t.setLado(-1);
    //         return false;
    //     } catch (IllegalArgumentException e) {
    //         return true;
    //     }
    // }

    // public boolean um_triangulo_equilatero_nao_deveria_ter_lado_zero_ao_ser_modificado() {
    //     try {
    //         TrianguloEquilatero t = new TrianguloEquilatero(1);
    //         t.setLado(0);
    //         return false;
    //     } catch (IllegalArgumentException e) {
    //         return true;
    //     }
    // }

    // public boolean um_triangulo_equilatero_deveria_ter_o_perimetro_equivalente_aos_triangulos_retangulos_formados_por_suas_metaades() {
    //     TrianguloEquilatero t = new TrianguloEquilatero(10);
    //     double altura = 10 * Math.sqrt(3) / 2;
    //     TrianguloRetangulo t1 = new TrianguloRetangulo(5, altura);
    //     TrianguloRetangulo t2 = new TrianguloRetangulo(5, altura);
    //     return t.perimetro() == t1.perimetro() + t2.perimetro() - altura * 2;
    // }

    // public boolean um_triangulo_equilatero_deveria_ter_a_area_equivalente_aos_triangulos_retangulos_formados_por_suas_metaades() {
    //     TrianguloEquilatero t = new TrianguloEquilatero(11);
    //     double altura = 11 * Math.sqrt(3) / 2;
    //     TrianguloRetangulo t1 = new TrianguloRetangulo(5.5, altura);
    //     TrianguloRetangulo t2 = new TrianguloRetangulo(5.5, altura);
    //     return t.area() == t1.area() + t2.area();
    // }

    public boolean a_classe_triangulo_isosceles_nao_deveria_ser_abstrata() {
        return !Modifier.isAbstract(TrianguloIsosceles.class.getModifiers());
    }

    public boolean a_classe_triangulo_isosceles_deveria_estender_figura() {
        return Figura.class.isAssignableFrom(TrianguloIsosceles.class);
    }

    public boolean um_triangulo_isosceles_deveria_ser_uma_instancia_de_figura() {
        TrianguloIsosceles t = new TrianguloIsosceles(1, 1);
        return t instanceof Figura;
    }

    public boolean um_triangulo_isosceles_deveria_ter_tipo_correto() {
        TrianguloIsosceles t = new TrianguloIsosceles(1, 1);
        return t.getTipo().equals("Triângulo Isósceles");
    }

    public boolean um_triangulo_isosceles_deveria_ter_base_correta() {
        TrianguloIsosceles t = new TrianguloIsosceles(2, 3);
        return t.getBase() == 2;
    }

    public boolean um_triangulo_isosceles_deveria_ter_altura_correta() {
        TrianguloIsosceles t = new TrianguloIsosceles(3, 4);
        return t.getAltura() == 4;
    }

    public boolean um_triangulo_isosceles_deveria_retornar_as_informacoes_corretamente() {
        TrianguloIsosceles t = new TrianguloIsosceles(4, 5);
        String[] info = t.info();
        return info[0].equals("Base: 4.0") && info[1].equals("Altura: 5.0");
    }

    public boolean um_triangulo_isosceles_deveria_ter_area_correta() {
        TrianguloIsosceles t = new TrianguloIsosceles(5, 6);
        return t.area() == 15;
    }

    public boolean um_triangulo_isosceles_deveria_ter_perimetro_correto() {
        TrianguloIsosceles t = new TrianguloIsosceles(6, 4);
        return t.perimetro() == 16;
    }

    public boolean um_triangulo_isosceles_deveria_poder_ser_escalado() {
        TrianguloIsosceles t = new TrianguloIsosceles(7, 5);
        t.escalar(2);
        return t.getBase() == 14 && t.getAltura() == 10;
    }

    public boolean um_triangulo_isosceles_deveria_poder_ser_escalado_com_fator_menor_que_1() {
        TrianguloIsosceles t = new TrianguloIsosceles(8, 6);
        t.escalar(0.5);
        return t.getBase() == 4 && t.getAltura() == 3;
    }

    public boolean um_triangulo_isosceles_nao_deveria_poder_ser_escalado_com_fator_negativo() {
        try {
            TrianguloIsosceles t = new TrianguloIsosceles(9, 7);
            t.escalar(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_triangulo_isosceles_nao_deveria_ser_escalado_com_fator_zero() {
        try {
            TrianguloIsosceles t = new TrianguloIsosceles(10, 8);
            t.escalar(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_triangulo_isosceles_nao_deveria_ter_base_negativa() {
        try {
            TrianguloIsosceles t = new TrianguloIsosceles(-1, 9);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_triangulo_isosceles_nao_deveria_ter_base_zero() {
        try {
            TrianguloIsosceles t = new TrianguloIsosceles(0, 10);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_triangulo_isosceles_nao_deveria_ter_base_negativa_ao_ser_modificada() {
        try {
            TrianguloIsosceles t = new TrianguloIsosceles(1, 11);
            t.setBase(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_triangulo_isosceles_nao_deveria_ter_base_zero_ao_ser_modificada() {
        try {
            TrianguloIsosceles t = new TrianguloIsosceles(1, 12);
            t.setBase(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_triangulo_isosceles_nao_deveria_ter_altura_negativa() {
        try {
            TrianguloIsosceles t = new TrianguloIsosceles(13, -1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_triangulo_isosceles_nao_deveria_ter_altura_zero() {
        try {
            TrianguloIsosceles t = new TrianguloIsosceles(14, 0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_triangulo_isosceles_nao_deveria_ter_altura_negativa_ao_ser_modificada() {
        try {
            TrianguloIsosceles t = new TrianguloIsosceles(15, 1);
            t.setAltura(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_triangulo_isosceles_nao_deveria_ter_altura_zero_ao_ser_modificada() {
        try {
            TrianguloIsosceles t = new TrianguloIsosceles(16, 1);
            t.setAltura(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean um_triangulo_isosceles_deveria_ter_o_perimetro_equivalente_aos_triangulos_retangulos_formados_por_suas_metaades() {
        TrianguloIsosceles t = new TrianguloIsosceles(18, 17);
        TrianguloRetangulo t1 = new TrianguloRetangulo(18 / 2, 17);
        TrianguloRetangulo t2 = new TrianguloRetangulo(18 / 2, 17);
        double epsilon = 0.1;
        return t.perimetro() > t1.perimetro() + t2.perimetro() -  17 * 2 - epsilon && t.perimetro() < t1.perimetro() + t2.perimetro() -  17 * 2 + epsilon;
    }

    public boolean um_triangulo_isosceles_deveria_ter_a_area_equivalente_aos_triangulos_retangulos_formados_por_suas_metaades() {
        TrianguloIsosceles t = new TrianguloIsosceles(19, 20);
        TrianguloRetangulo t1 = new TrianguloRetangulo(19 / 2., 20);
        TrianguloRetangulo t2 = new TrianguloRetangulo(19 / 2., 20);
        return t.area() == t1.area() + t2.area();
    }
}