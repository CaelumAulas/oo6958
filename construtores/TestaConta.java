class TestaConta {

    public static void main(String[] args) {

        Conta contaNiko = new Conta("Niko");
        contaNiko.saldo = 5000.5;
        contaNiko.numero = 123;

        Conta contaJef = new Conta("Jeferson");
        contaJef.saldo = 3000;
        contaJef.numero = 345;

        contaNiko.deposita(300);
        contaNiko.saca(400);

        contaJef.deposita(200);
        contaJef.saca(150);

        System.out.println("Titular: " + contaNiko.titular + ", saldo: " + contaNiko.saldo);
    }
}