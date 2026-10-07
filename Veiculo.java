public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private double valorDiaria;

    public Veiculo(String marca, String modelo, int ano, double valorDiaria) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }


    public double calcularDiaria() {
        return valorDiaria;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Valor da diária: R$ " + valorDiaria);
    }

   
    public void exibirInformacoes(boolean mostrarDiaria) {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);

        if (mostrarDiaria) {
            System.out.println("Valor da diária: R$ " + valorDiaria);
        }
    }
}
