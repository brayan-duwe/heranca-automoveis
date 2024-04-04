package heranca2;

public class carro extends automovel {
    double capacidadePortaMalas;

    public carro (String marca, String modelo, String linha, int ano, String cambio, boolean eletrico, int potencia, int assentos, boolean temCobertura, double capacidadePortaMalas){
        super(marca, modelo, linha, ano, cambio, eletrico, potencia, assentos, temCobertura);
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    public void mostrarInformacoesCarro (){
        System.out.println("Capacidade porta-malas: " + capacidadePortaMalas);

    }
}