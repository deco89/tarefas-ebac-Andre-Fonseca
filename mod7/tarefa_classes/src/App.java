public class App {
    public static void main(String[] args) throws Exception {

        Carro carro = new Carro("Gol", "Wolkswagen", "Preto", 2024, 29900, false);

        carro.informacoesDoCarro();
        carro.ligarMotor();
        carro.ligarMotor();
        carro.desligarMotor();

        carro.acelerar(60);
        carro.freiar(30);
        carro.desligarMotor();

        

    
    }
}
