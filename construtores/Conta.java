class Conta {

    String titular;
    double saldo;
    int numero;

    public Conta(String titular) {
        this.titular = titular;
    }

    // construtor padrao sem argumentos
    public Conta() {
    }

    public Conta(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
    }

    void deposita(double valor) {
        this.saldo = saldo + valor;
    }

    boolean saca(double valor) {
        if(saldo >= valor) {
            saldo = saldo - valor;
            return true;
        }

        return false;
    }
}