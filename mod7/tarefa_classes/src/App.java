public class App {
    public static void main(String[] args) throws Exception {

        Carro carro = new Carro("Gol", "Wolkswagen", "Preto", 2024, 29900, false);

        // System.out.println("----------------------");
        // System.out.println("Infoermações sobre o carro: ");
        // System.out.println("Nome: " + carro.getNome());
        // System.out.println("Fabricante: " + carro.getFabricante());
        // System.out.println("Ano: " + carro.getAno());
        // System.out.println("Cor: " + carro.getCor());
        // carro.setMotorLigado(false);

        carro.informacoesDoCarro();
        carro.ligarMotor();
        carro.ligarMotor();
        carro.desligarMotor();

        carro.acelerar(60);
        carro.freiar(30);
        carro.desligarMotor();

        

    
    }
}
