public class Motocicleta extends Veiculo {

    private int cilindradas;

    public Motocicleta(String marca, String modelo, int ano,
                       double valorDiaria, int cilindradas) {

        super(marca, modelo, ano, valorDiaria);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularDiaria() {
        return getValorDiaria() + 20.0;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cilindradas: " + cilindradas + " cc");
        System.out.println("Diária calculada: R$ " + calcularDiaria());
    }
}
