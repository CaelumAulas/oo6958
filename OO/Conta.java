class Conta {

    String titular;
    double saldo;
    int numero;

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