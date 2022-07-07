package EstruturasRepeticao;

import java.util.Scanner;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Teste! Aqui é quando eu sei quantas vezes vão repetir");
        }

        Scanner leitorScanner = new Scanner(System.in);
        int totalAlunos = 10;
        while (totalAlunos > 0) {
            String nomeAluno = leitorScanner.nextLine();

            int idadeAluno = leitorScanner.nextInt();

            System.out.println("O nome do aluno é: " + nomeAluno + " e sua idade é: "
                    + idadeAluno);
            totalAlunos = totalAlunos - 1;
        }
    }
}
