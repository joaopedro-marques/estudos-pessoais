package EstruturasRepeticao;

import java.util.Scanner;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Teste! Aqui � quando eu sei quantas vezes v�o repetir");
        }

        Scanner leitorScanner = new Scanner(System.in);
        int totalAlunos = 10;
        while (totalAlunos > 0) {
            String nomeAluno = leitorScanner.nextLine();

            int idadeAluno = leitorScanner.nextInt();

            System.out.println("O nome do aluno �: " + nomeAluno + " e sua idade �: "
                    + idadeAluno);
            totalAlunos = totalAlunos - 1;
        }
    }
}
