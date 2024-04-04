package heranca2;

public class automovel {
    public String marca;
    public String modelo;
    public String linha;
    public int ano;
    public String cambio;
    public boolean eletrico;
    public int potencia;
    public int assentos;
    public boolean temCobertura;



    public automovel (String marca, String modelo, String linha, int ano, String cambio, boolean eletrico, int potencia, int assentos, boolean temCobertura){
        this.marca = marca;
        this.modelo = modelo;
        this.linha = linha;
        this.ano = ano;
        this.cambio = cambio;
        this.eletrico = eletrico;
        this.potencia = potencia;
        this.assentos = assentos;
        this.temCobertura = temCobertura;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getLinha(){
        return linha;
    }
    public void setLinha(String linha){
        this.linha = linha;
    }
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public String getCambio(){
        return cambio;
    }
    public void setCambio(String cambio){
        this.cambio = cambio;
    }
    public boolean getEletrico(){
        return eletrico;
    }
    public void setEletrico(boolean eletrico){
        this.eletrico = eletrico;
    }
    public int getPotencia(){
        return potencia;
    }
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    public int getAssentos(){
        return assentos;
    }
    public void setAssentos(int assentos){
        this.assentos = assentos;
    }
    public boolean getTemCobertura(){
        return temCobertura;
    }
    public void setTemCobertura(boolean temCobertura){
        this.temCobertura = temCobertura;
    }

    public void mostrarInformacoes () {
        System.out.println("----------Automóvel----------");
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Linha: "+ linha);
        System.out.println("Ano: "+ ano);
        System.out.println("Câmbio: "+ cambio);
        System.out.println("É elétrico: "+ (eletrico ? "Sim" : "Não"));
        System.out.println("Potência: " + potencia + "CV");
        System.out.println("Assentos: " + assentos + "L");
        System.out.println("Tem cobertura: " + (temCobertura ? "Sim" : "Não"));
        System.out.println("-------------Fim-------------\n");
    }
}