package heranca2;

public class onibus extends automovel {
    boolean banheiro;
    boolean wifi;

    public onibus (String marca, String modelo, String linha, int ano, String cambio, boolean eletrico, int potencia, int assentos, boolean temCobertura, boolean banheiro, boolean wifi){
        super(marca, modelo, linha, ano, cambio, eletrico, potencia, assentos, temCobertura);
        this.banheiro = banheiro;
        this.wifi = wifi;
    }

    public void mostrarInformacoesOnibus (){
        System.out.println("Tem banheiro: " + banheiro);
        System.out.println("Tem Wi-Fi: " + wifi);
    }
}