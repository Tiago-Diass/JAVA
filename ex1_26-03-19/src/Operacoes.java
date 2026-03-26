public class Operacoes {
    public int soma(int n1, int n2) {
        return n1 + n2;
    }

    public int subtracao(int n1, int n2) {
        return n1 - n2;
    }

    public int multiplicacao(int n1, int n2) {
        return n1 * n2;
    }

    public double divisao(int n1, int n2) {
        if (n2 != 0) {
            return (double) n1 / n2;
        } else {
            return 0;
        }
    }
}
