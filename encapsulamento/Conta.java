class Conta {

    private String titular;
    private double saldo;

    public void deposita(double valor) {
        this.saldo = saldo + valor;
    }

    public boolean saca(double valor) {
        if(saldo >= valor) {
            saldo = saldo - valor;
            return true;
        }

        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}