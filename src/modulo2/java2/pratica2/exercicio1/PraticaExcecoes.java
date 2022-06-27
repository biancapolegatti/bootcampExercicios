package modulo2.java2.pratica2.exercicio1;

public class PraticaExcecoes {

    int a = 0;
    int b = 300;

    public int calcularRazao() {
        int resultado = 0;
        try {
            resultado = b / a;

        } catch (ArithmeticException ex) {
            throw new IllegalArgumentException("Não pode ser dividido por zero");
        } finally {
            System.out.println("Programa finalizado.");
        }
        return resultado;
    }

    public static void main(String[] args) {

        PraticaExcecoes excecao = new PraticaExcecoes();
        excecao.calcularRazao();
    }
}