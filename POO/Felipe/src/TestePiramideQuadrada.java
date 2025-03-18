public class TestePiramideQuadrada extends Teste {
    public boolean a_classe_piramide_quadrada_deveria_ser_subclasse_de_figura() {
        return Figura.class.isAssignableFrom(PiramideQuadrada.class);
    }

    public boolean uma_piramide_quadrada_deveria_ter_tipo_correto() {
        PiramideQuadrada p = new PiramideQuadrada(1, 2);
        return p.getTipo().equals("Pirâmide Quadrada");
    }

    public boolean uma_piramide_quadrada_deveria_ter_base_correta() {
        PiramideQuadrada p = new PiramideQuadrada(2, 3);
        return p.getBase() == 2;
    }

    public boolean uma_piramide_quadrada_deveria_ter_altura_correta() {
        PiramideQuadrada p = new PiramideQuadrada(3, 4);
        return p.getAltura() == 4;
    }

    public boolean uma_piramide_quadrada_deveria_retornar_as_informacoes_corretamente() {
        PiramideQuadrada p = new PiramideQuadrada(4, 5);
        String[] info = p.info();
        return info[0].equals("Base: 4.0") && info[1].equals("Altura: 5.0");
    }

    public boolean uma_piramide_quadrada_deveria_ter_volume_correto() {
        PiramideQuadrada p = new PiramideQuadrada(5, 6);
        return p.volume() == 5 * 5 * 6 / 3;
    }

    public boolean uma_piramide_quadrada_deveria_ter_area_correta() {
        PiramideQuadrada p = new PiramideQuadrada(6, 7);
        return p.area() == 6 * 6 + 2 * 6 * Math.sqrt(Math.pow(6 / 2, 2) + Math.pow(7, 2));
    }

    public boolean uma_piramide_quadrada_deveria_poder_ser_escalada() {
        PiramideQuadrada p = new PiramideQuadrada(7, 8);
        p.escalar(2);
        return p.getBase() == 14 && p.getAltura() == 16;
    }

    public boolean uma_piramide_quadrada_deveria_poder_ser_escalada_com_fator_menor_que_1() {
        PiramideQuadrada p = new PiramideQuadrada(8, 9);
        p.escalar(0.5);
        return p.getBase() == 4 && p.getAltura() == 4.5;
    }

    public boolean uma_piramide_quadrada_nao_deveria_poder_ser_escalada_com_fator_negativo() {
        try {
            PiramideQuadrada p = new PiramideQuadrada(8, 9);
            p.escalar(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean uma_piramide_quadrada_nao_deveria_ser_escalada_com_fator_zero() {
        try {
            PiramideQuadrada p = new PiramideQuadrada(9, 10);
            p.escalar(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean uma_piramide_quadrada_nao_deveria_ter_base_negativa() {
        try {
            PiramideQuadrada p = new PiramideQuadrada(-1, 11);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean uma_piramide_quadrada_nao_deveria_ter_altura_negativa() {
        try {
            PiramideQuadrada p = new PiramideQuadrada(12, -1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean uma_piramide_quadrada_nao_deveria_ter_base_zero() {
        try {
            PiramideQuadrada p = new PiramideQuadrada(0, 13);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean uma_piramide_quadrada_nao_deveria_ter_altura_zero() {
        try {
            PiramideQuadrada p = new PiramideQuadrada(14, 0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean uma_piramide_quadrada_nao_deveria_ter_base_negativa_ao_ser_modificada() {
        try {
            PiramideQuadrada p = new PiramideQuadrada(1, 15);
            p.setBase(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean uma_piramide_quadrada_nao_deveria_ter_altura_negativa_ao_ser_modificada() {
        try {
            PiramideQuadrada p = new PiramideQuadrada(16, 1);
            p.setAltura(-1);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean uma_piramide_quadrada_nao_deveria_ter_base_zero_ao_ser_modificada() {
        try {
            PiramideQuadrada p = new PiramideQuadrada(1, 17);
            p.setBase(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public boolean uma_piramide_quadrada_nao_deveria_ter_altura_zero_ao_ser_modificada() {
        try {
            PiramideQuadrada p = new PiramideQuadrada(18, 1);
            p.setAltura(0);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    
}
