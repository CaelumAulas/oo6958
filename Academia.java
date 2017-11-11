public class Academia {

    public static void main(String[] args) {

        String nome = "Thiago";
        int idade = 25;
        float peso = 90.5f;
        double altura = 1.8;
        char sexo = 'M';
        double imc = peso / (altura * altura);
        boolean ehFumante = false;

        System.out.println("imc: " + imc);
        
        boolean amigoDoDono = false;
        if(idade < 18 || amigoDoDono) {
            System.out.println("Pode se matricular");
        } else {
            System.out.println("Não pode se matricular");
        }

        for(int i = 0; i < 3; i++) {
            // peso = peso + 2;
            peso += 2;
        }

        while(idade < 18) {
            System.out.println("Ainda não pode!");
            idade++;
        }

    }
}
