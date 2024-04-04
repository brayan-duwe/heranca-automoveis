package heranca2;

public class moto extends automovel {
    boolean bagageiro;

    public moto (String marca, String modelo, String linha, int ano, String cambio, boolean eletrico, int potencia, int assentos, boolean temCobertura, double capacidadePortaMalas, boolean bagageiro){
        super(marca, modelo, linha, ano, cambio, eletrico, potencia, assentos, temCobertura);
        this.bagageiro = bagageiro;
    }

    public void mostrarInformacoesMoto (){
        System.out.println("Bagageiro: "+ bagageiro);
    }
}