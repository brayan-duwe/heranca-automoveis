package heranca2;

public class Main {
    public static void main(String[] args){
        carro carro = new carro("BMW","X1", "X",2024, "Automática", false,204,5,true,476);

        carro.mostrarInformacoes();

        carro.setModelo("X6");
        System.out.println("Modelo: " + carro.getModelo() + "\n");
        carro.mostrarInformacoes();
    }
}