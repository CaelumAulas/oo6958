class TestaConta {

    public static void main(String[] args) {

        Conta contaNiko = new Conta();
        contaNiko.setTitular("Niko");
        contaNiko.deposita(5000.5);

        Conta contaJef = new Conta();
        contaJef.setTitular("Jeferson");
        contaJef.deposita(3000);

        contaNiko.deposita(300);
        contaNiko.saca(400);

        contaJef.deposita(200);
        contaJef.saca(150);

        System.out.println("Titular: " + contaNiko.getTitular() + ", saldo: " + contaNiko.getSaldo());
    }
}