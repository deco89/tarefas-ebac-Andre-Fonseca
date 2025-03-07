import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite as notas do aluno");
        System.out.println("\nNota 1:");
        double n1 = sc.nextDouble();
        System.out.println("Nota 2:");
        double n2 = sc.nextDouble();
        System.out.println("Nota 3:");
        double n3 = sc.nextDouble();
        System.out.println("Nota 4:");
        double n4 = sc.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        if(media < 5) {
            System.out.println("Aluno reprovado com média: " + media);
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno  está de recuperação com média: " + media);
        } else if (media <= 10) {
            System.out.println("Aluno está aprovado com média: " + media);
        } else {
            System.out.println("Nota inválida");
        }


        sc.close();
    }
}
