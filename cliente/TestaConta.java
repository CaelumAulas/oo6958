class TestaConta {

    public static void main(String[] args) {

        Cliente niko = new Cliente();
        niko.nome = "Nikolai";
        niko.cpf = "789.789.908-09";

        Conta contaNiko = new Conta();
        contaNiko.titular = niko;
        contaNiko.saldo = 5000.5;
        contaNiko.numero = 123;

        Conta contaJef = new Conta();
        contaJef.titular = new Cliente();
        contaJef.titular.nome = "Jeferson";
        contaJef.titular.cpf = "787.786.798-98";
        contaJef.saldo = 3000;
        contaJef.numero = 345;

        contaNiko.deposita(300);
        contaNiko.saca(400);

        contaJef.deposita(200);
        contaJef.saca(150);

        System.out.println("Titular: " + contaNiko.titular.nome + ", saldo: " + contaNiko.saldo);
    }
}