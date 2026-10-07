public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro(
                "Toyota",
                "Hilux",
                2026,
                150.0,
                4
        );

        Motocicleta moto = new Motocicleta(
                "Honda",
                "Sahara",
                2026,
                100.0,
                300
        );

        System.out.println("-- CARRO --");
        carro.exibirInformacoes();

        System.out.println();

        System.out.println("-- MOTOCICLETA --");
        moto.exibirInformacoes();

        System.out.println();

        Veiculo veiculo1 = carro;
        Veiculo veiculo2 = moto;

        System.out.println("-- POLIMORFISMO --");

        veiculo1.exibirInformacoes();

        System.out.println();

        veiculo2.exibirInformacoes();

        System.out.println();

        System.out.println("Diária do carro: R$ "
                + veiculo1.calcularDiaria());

        System.out.println("Diária da moto: R$ "
                + veiculo2.calcularDiaria());

        System.out.println();


        System.out.println("--- SOBRECARGA ---");
        carro.exibirInformacoes(false);
    }
}
