public class App {
    public static void main(String[] args) throws Exception {
        
        Notas notas = new Notas(8.5, 7.3, 9.1, 10.0);
        
        System.out.printf("A média das notas é: %.2f%n", notas.calcularMedia());
        
        
    }
}
