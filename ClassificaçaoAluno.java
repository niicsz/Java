import java.util.Scanner;

public class ClassificacaoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da prova do aluno: ");
        double nota = scanner.nextDouble();

        if (nota >= 10) {
            System.out.println("Parabéns! Nota máxima!");
        } else if (nota >= 8 && nota <= 9) {
            System.out.println("Aprovado A");
        } else if (nota >= 6 && nota <= 7) {
            System.out.println("Aprovado B");
        } else if (nota >= 5) {
            System.out.println("Aprovado C");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
