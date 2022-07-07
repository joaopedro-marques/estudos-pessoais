package ListaExercicios;

import java.util.Scanner;

public class App {

    public float celsiusParaFarenheit(float C) {
        return (9 * C + 160) / 5;
    }

    public String getGreeting() {
        return "Hello World!";
    }

    public int Multiplicacao(int num1, int num2) {
        return num1 * num2;
    }

    public float divisao(int num1, int num2) {
        return num1 / num2;
    }

    public double salarioVariavel(float salario, float vendas) {
        double salarioVariavel = vendas * 0.15;
        return salarioVariavel + salario;
    }

    public float consumoMedio(float num1, float num2) {
        return num1 / num2;
    }

    public int Soma(int num1, int num2) {
        return num1 + num2;
    }

    public int subtracao(int num1, int num2) {
        return num1 - num2;
    }

    public String estaEntreCemOuDuzentos(int num) {
        if (num < 200 && num > 100) {
            return "Seu Numero está entre 100 e 200!";
        }
        return "Número não encontrado!";
    }

    public String ePositivoNegativoOuZero(int num) {
        if (num == 0) {
            return "Seu número é 0!";
        } else {
            if (num > 0) {
                return "Seu número é positivo!";
            } else {
                return "O número é negativo!";
            }
        }
    }

    public String prejuizoOuLucro(float preco, float venda) {
        if (venda > preco) {
            return "Você obteve lucro!";
        } else {
            if (venda < preco) {
                return "você obteve prejuízo!";
            } else {
                return "Conseguimos nos livrar da mercadoria";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        Scanner leitor = new Scanner(System.in);
        //Exercício 1
//        int num1, num2; 
//        
//        System.out.println("Digite um número:");
//        num1 = leitor.nextInt();
//        System.out.println("Digite o segundo número:");
//        num2 = leitor.nextInt();
//        
//        System.out.println("A soma dos dois números é: " + new App().Soma(num1, num2));

        //Exercício 2
//        int num1, num2; 
//        
//        System.out.println("Digite um número:");
//        num1 = leitor.nextInt();
//        System.out.println("Digite o segundo número:");
//        num2 = leitor.nextInt();
//        
//        System.out.println("A soma dos dois números é: " + new App().Soma(num1, num2));
//        System.out.println("A subtracao dos dois números é: " + new App().subtracao(num1, num2));
//        System.out.println("A multiplicacao dos dois números é: " + new App().Multiplicacao(num1, num2));
//        System.out.println("A divisão dos dois números é: " + new App().divisao(num1, num2));
//        //Exercicio3
//         float combustivel, distancia; 
////        
//        System.out.println("Digite a distanicia em KM:");
//        distancia = leitor.nextFloat();
//        System.out.println("Digite o gasto de combustível em L");
//        combustivel = leitor.nextFloat();
////        
//        System.out.println("Consumo médio é : " + new App().consumoMedio(distancia, combustivel) + "Km por litro");
        //Exercicio4
//        float salario, vendas;
//        String nome;
//        System.out.println("Digite o nome:");
//        nome = leitor.nextLine();
//        System.out.println("Digite o salario fixo:");
//        salario = leitor.nextFloat();
//        System.out.println("Digite o total de vendas");
//        vendas = leitor.nextFloat();
////        
//        System.out.println("Se nome é : " + nome + "Seu salário fixo é: " + salario + "Seu salário do mês é: " + new App().salarioVariavel(salario, vendas));
//        //Exercício 5;
//        float nota1 = 0.0f, nota2 = 0.0f, nota3 = 0.0f;
//        String nome;
//        System.out.println("Digite o nome:");
//        nome = leitor.nextLine();
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("Digite a nota " + i + " :");
//            switch (i) {
//                case 1:
//                    nota1 = leitor.nextFloat();
//                    break;
//                case 2:
//                    nota2 = leitor.nextFloat();
//                    break;
//                default:
//                    nota3 = leitor.nextFloat();
//            }
//        }
//        float media = (nota1 + nota2 + nota3) / 3;
//
//        System.out.println(
//                "Se nome é : " + nome + "Sua média é : " + media);
//        
//        //Exercício 6
//        int a , b, i;
//
//        System.out.println("Digite A :");
//
//        a = leitor.nextInt();
//        
//        System.out.println("Digite B"
//                + " :");
//        b = leitor.nextInt();
//
//        i = a;
//        a = b;
//        b = i;
//        
//        System.out.println("A = " + a + "B = " + b );
//        //Exercício 7
//        float C;
//
//        System.out.println("Digite a temperatura em Celsius :");
//
//        C = leitor.nextFloat();
//        
//        
//        System.out.println("A temperatura em Farenheit é: " + new App().celsiusParaFarenheit(C) );
//        //Exercício 8
//        float reais, cotacao, dolar;
//
//        System.out.println("Digite a cotação atual de dolar :");
//
//        cotacao = leitor.nextFloat();
//        
//        System.out.println("Digite o valor em dolar :");
//
//        dolar = leitor.nextFloat();
//        
//        reais = dolar * cotacao;
//        
//        System.out.println("o valor que você tem em reais é: " + reais);
//        //Exercício 9
//        double reais, valorFinal;
//
//        System.out.println("Deposite um valor:");
//
//        reais = leitor.nextFloat();        
//        
//        valorFinal = reais + reais * 0.07;
//        
//        System.out.println("o valor que você tem em reais após um mês é: " + valorFinal);
//        //Exercício 10
//        float compra, parcelas;
//
//        System.out.println("Escreva o valor de compra:");
//
//        compra = leitor.nextFloat();        
//        
//        parcelas = compra/5;
//        
//        System.out.println("o valor qdar parcelas é: " + parcelas);
//        //Exercício 11
//        float custo, venda, percentual;
//
//        System.out.println("Escreva o valor de custo:");
//
//        custo = leitor.nextFloat();  
//        
//        System.out.println("Escreva o valor percentual:");
//
//        percentual = leitor.nextFloat();        
//        
//        venda = custo + custo * (percentual/100);
//        
//        System.out.println("o valor de venda é: " + venda);
////        //Exercício 12
//        double custo, preco, aposImposto;
//
//        System.out.println("Escreva o valor de custo:");
//
//        custo = leitor.nextDouble();
//        
//        aposImposto = custo + (custo * 0.45);
//        
//        preco =  aposImposto + (aposImposto * 0.28);
//        
//        System.out.println("o valor do carro é: " + preco);
//     //Exercício 13
//        int numero;
//
//        System.out.println("Escreva um número:");
//
//        numero = leitor.nextInt();
//        
//        if (numero > 10){
//            System.out.println("O número é maior que 10");
//        }
//        
//        //Exercício 14
//        int numero, numero2;
//
//        System.out.println("Escreva o 1º número:");
//
//        numero = leitor.nextInt();
//        
//        System.out.println("Escreva o 2º número:");
//
//        numero2 = leitor.nextInt();
//        
//        if (numero > numero2){
//            System.out.println("O primeiro número é maior");
//        } else {
//            System.out.println("O segundo número é maior");
//        }
////Exercício 15
//        int numero;
//
//        System.out.println("Escreva o 1º número:");
//
//        numero = leitor.nextInt();
//        
//        
//        if (numero > 100 && numero < 200){
//              System.out.println("Esse número está entre 100 e 200");
//         
//        }
//////Exercício 16
//        float nota1 =  0.0f, nota2 =  0.0f, nota3 = 0.0f, media;
//        String nome;
//        
//        System.out.println("Qual o nome do aluno?");
////
//        nome = leitor.nextLine();
//
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("Digite a nota " + i + " :");
//            switch (i) {
//                case 1:
//                    nota1 = leitor.nextFloat();
//                    break;
//                case 2:
//                    nota2 = leitor.nextFloat();
//                    break;
//                default:
//                    nota3 = leitor.nextFloat();
//            }
//        }
//        
//        media = (nota1+nota2+nota3)/3;
//        
//        if (media <=5){
//            System.out.println(nome + " você está de reprovado");
//        } else if (media <=7){
//            System.out.println(nome + " você está de recuperação!");
//        } else {
//            System.out.println(nome + " Você está aprovado!");      
//        }
////Exercício 17
//    int contagemNumeros = 0;
//    for(int i = 0; i < 80; i++){
//        System.out.println("Escreva o número");
//        int num = leitor.nextInt();
//        if (num >= 10 && num <= 150){
//            contagemNumeros += 1;
//        }
//    }
//    
//    System.out.println("São " + contagemNumeros + "Maior do que 10 e menores que 150"); 
//////Exercício 18
//    
//    for(int i = 0; i < 75; i++){
//        System.out.println("Escreva a idade");
//        int idade = leitor.nextInt();
//        if (idade >= 18){
//            System.out.println("Maior de idade!");
//        } else {
//            System.out.println("Menor de idade");
//        }
//    }
////Exercício 19;
//    int contagemHomens = 0, contagemMulheres = 0;
//    
//    for(int i = 0; i < 56; i++){
//        System.out.println("Escreva o nome");
//        String nome = leitor.nextLine();
//        System.out.println("Escreva o sexo: H- Homens ou M-Mulheres");
//        char sexo = leitor.next().charAt(0);
//        if (sexo == 'H'){
//            contagemHomens += 1;
//        } else {
//            contagemMulheres += 1;
//        }
//    }
//    
//    System.out.println("São " + contagemMulheres + "e" + contagemHomens + " homens");  
//////Exercício 20;
//    int totalAte2000 = 0, totalGeral = 0;
//    char continuar = 'S';
//    while(continuar  == 'S' || continuar == 's'){
//        System.out.println("Escreva o valor do carro");
//        double valor = leitor.nextDouble();
//        System.out.println("Escreva o ano do carro");
//        int ano = leitor.nextInt();
//        if(ano <= 2000){
//            valor = valor * 0.88;
//            totalAte2000 += 1;
//            totalGeral += 1;
//            System.out.println("O valor do carro é:" + valor);
//        } else {
//            valor = valor * 0.93;
//            totalGeral += 1;
//            System.out.println("O valor do carro é:" + valor);
//        }
//        System.out.println("Você deseja continuar cadastrar carros? S para sim e N para não");
//        continuar = leitor.next().charAt(0);
//    }
//    System.out.println("Total de carro até o ano 2000:" + totalAte2000);
//    System.out.println("Total de carro Geral:" + totalGeral);
//////Exercício 21;
//    int totalApto = 0, totalNaoApto = 0;
//    System.out.println("Quantas pessoas você quer cadastrar?");
//    int pessoas = leitor.nextInt();
//    int i = 0;
//    while( i < pessoas){
//        System.out.println("Escreva o nome:");
//        String nome = leitor.nextLine();
//        System.out.println("Escreva a saúde: B- Boa ou R - Ruim");
//        char saude = leitor.next().charAt(0);
//        System.out.println("Escreva a sexo: Mulher - M ou Homem - M");
//        char sexo = leitor.next().charAt(0);
//        System.out.println("Escreva a idade");
//        int idade = leitor.nextInt();
//        if(idade >= 18 && saude == 'B'){
//            System.out.println("Pessoa apta ao serviço milita!");
//            totalApto += 1;
//        } else {
//            System.out.println("Pessoa não apta!");
//            totalNaoApto += 1;
//        }
//        
//    }
//    System.out.println("Total de aptos:" + totalApto);
//    System.out.println("Total denão aptos:" + totalNaoApto);
////Exercício 22;;
//        int totalPrecoCusto = 0, totalPrecoVenda = 0;
//        for (int i = 0; i < 40; i++) {
//            System.out.println("Escreva o preco de custo:");
//            int custo = leitor.nextInt();
//            System.out.println("Escreva o preco de venda:");
//            int venda = leitor.nextInt();
//            totalPrecoCusto = totalPrecoCusto + custo;
//            totalPrecoVenda = totalPrecoVenda + venda;
//            if (venda == custo) {
//                System.out.println("Empate! Valor:" + custo);
//
//            } else if (venda > custo) {
//                System.out.println("Lucro! Valor de custo:" + custo + "Valor de venda " + venda);
//            } else {
//                System.out.println("Prejuízo!Valor de custo:" + custo + "Valor de venda " + venda);
//            }
//        }
//        float mediaCusto = totalPrecoCusto / 40;
//        float mediaVenda = totalPrecoVenda / 40;
//
//        System.out.println("Media preços de custo:" + mediaCusto);
//        System.out.println("Media preços de venda" + mediaVenda);
////Exercício 23;;
//        System.out.println("Escreva um número:");
//        int numero = leitor.nextInt();
//        
//        if( numero > 80 || numero == 40 || numero < 25){
//            System.out.println("Acertou!");
//        }
////Exercício 24;;
//    char flag = 'S';
//    while (flag == 'S' || flag == 's'){
//        System.out.println("Escreva o número");
//        int numero = leitor.nextInt();
//        if (numero > 0){
//            System.out.println("Positivo!");
//        } else if (numero < 0){
//            System.out.println("Negativo!");
//        } else {
//            System.out.println("Número 0");
//        }
//        System.out.println("Quer continuar? S - sim ou N - não");
//        flag = leitor.next().charAt(0);
//    }
////Exercício 25;;
//    
//        System.out.println("Escreva 1º número");
//        int numero = leitor.nextInt();
//        System.out.println("Escreva 2º número");
//        int numero2 = leitor.nextInt();
//        if (numero == numero2){
//            System.out.println("Os números são iguais");
//        } else if (numero > numero2){
//            System.out.println("Primeiro número maior");
//        } else {
//            System.out.println("Segundo numero maior!");
//        }
//       //Exercício 26;
//    
//        System.out.println("Escreva 1 número de um a cinco:");
//        int numero = leitor.nextInt();
//        switch(numero){
//            case 1:
//                System.out.println("Um");
//                break;
//            case 2:
//                System.out.println("Dois");
//                break;
//            case 3:
//                System.out.println("Três");
//                break;
//            case 4:
//                System.out.println("Quatro");
//                break;
//            case 5:
//                System.out.println("Cinco");
//                break;
//            default:
//                System.out.println("Número inválido");
//                break;
//        }
////Exercício 27;
//        double totalDesconto = 0, totalVendas = 0;
//        double valor = 1;
//        while (valor != 0) {
//            System.out.println("Digite o valor do carro:");
//            valor = leitor.nextDouble();
//            System.out.println("Escreva 1 - Àlcool, 2 - Gasolina, 3 - Diesel");
//            int combustivel = leitor.nextInt();
//            switch (combustivel) {
//                case 1:
//                    totalDesconto = totalDesconto + valor * 0.25;
//                    valor = valor * 0.75;
//                    System.out.println("O valor do carro é: " + valor);
//                    break;
//                case 2:
//                    totalDesconto = totalDesconto + valor * 0.21;
//                    valor = valor * 0.79;
//                    System.out.println("O valor do carro é: " + valor);
//                    break;
//                case 3:
//                    totalDesconto = totalDesconto + valor * 0.14;
//                    valor = valor * 0.86;
//                    System.out.println("O valor do carro é: " + valor);
//                    break;
//            }
//        }

////Exercício 28;
//        double totalAumento = 0;
//        System.out.println("Salário Mínimo");
//           double salarioMinimo = leitor.nextDouble();
//        for( int i = 0 ; i <5; i++){
//            System.out.println("Nome funcionário:");
//            String nome = leitor.nextLine();
//            System.out.println("Salário");
//            double salario = leitor.nextDouble();
//            if( salario <= 3*salarioMinimo){
//                totalAumento += salario *0.5;
//                salario = salario * 1.5;
//                System.out.println(nome + " seu salário foi reajustado em 50% totalizando: " + salario);
//            } else if (salario <= 10*salarioMinimo){
//                totalAumento += salario *0.2;
//                salario = salario * 1.2;
//                System.out.println(nome + " seu salário foi reajustado em 20% totalizando: " + salario);
//            } else if ( salario <= 20*salarioMinimo){
//                totalAumento += salario *0.15;
//                salario = salario * 1.15;
//                System.out.println(nome + " seu salário foi reajustado em 15% totalizando: " + salario);
//            } else {
//                totalAumento += salario *0.1;
//                salario = salario * 1.1;
//                System.out.println(nome + " seu salário foi reajustado em 10% totalizando: " + salario);
//            }
//            
//            System.out.println("O aumento na folha é de: " + totalAumento);
//        }

////Exercício 29;
//   
//        System.out.println("Escreva o número do mês:");
//        int mes = leitor.nextInt();
//        switch(mes){
//            case 1:
//                System.out.println("Janeiro");
//                break;
//            case 2:
//                System.out.println("Fevereiro");
//                break;
//            case 3:
//                System.out.println("Março");
//                break;
//            case 4:
//                System.out.println("Abril");
//                break;
//            case 5:
//                System.out.println("Maio");
//                break;
//            case 6:
//                System.out.println("Junho");
//                break;
//            case 7:
//                System.out.println("Julho");
//                break;
//            case 8:
//                System.out.println("Agosto");
//                break;
//            case 9:
//                System.out.println("Setembro");
//                break;
//            case 10:
//                System.out.println("Outubro");
//                break;
//            case 11:
//                System.out.println("Novembro");
//                break;
//            case 12:
//                System.out.println("Dezembro");
//                break;
//            default:
//                System.out.println("Mês inválido");
//                break;
//        } 

////Exercício 30 
//
//    int numero1 = 0, numero2 = 0, numero3 = 0;
//    for (int i = 1; i <= 3; i++){
//        System.out.println("Escreva um número:");
//        if (i == 1){
//         numero1 = leitor.nextInt();
//        } else if (i == 2){
//            numero2 = leitor.nextInt();
//        } else {
//            numero3 = leitor.nextInt();
//        }
//    }
//    
//    if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3){
//        System.out.println(numero1 + " "+ numero2 + " "+ numero3);
//    } else if (numero2>numero1 && numero2>numero3 && numero3>numero1){
//        System.out.println(numero2 + " " + numero3 +" " + numero1);
//    } else {
//        System.out.println(numero3 +" "+ numero1 +" "+ numero2);
//    }


//Exercicio 1
//        System.out.println("Digite um valor");
//        numero = leitorScanner.nextInt();
//        
//        System.out.println(new App().estaEntreCemOuDuzentos(numero));
//        
        //Exercício 02
//        while(desejaContinuar == 'S' || desejaContinuar == 's'){
//            System.out.println("Digite um valor");
//            int test = leitorScanner.nextInt();
//            System.out.println(new App().ePositivoNegativoOuZero(test));
//            System.out.println("Deseja continuar com a checagem? S- Sim N-Não");
//            desejaContinuar = leitorScanner.next().charAt(0);
//        }
        //Exercício 03;;
////        String nomeProduto
//        float precoCusto;
//        float precoVenda;
//        float totalCusto = 0;
//        float totalVenda = 0;
//        
//        
//        for(int i =0; i <40 ;i++) {
//            System.out.println("Digite o nome do produto");
//            nomeProduto = leitorScanner.nextLine();
//            
//            System.out.println("Digite o preço de custo");
//            precoCusto = leitorScanner.nextFloat();
//            
//            System.out.println("Digite o preço de venda");
//            precoVenda = leitorScanner.nextFloat();
//            
//            totalCusto = totalCusto + precoCusto;
//            totalVenda = totalVenda + precoVenda;
//            
//            System.out.println(new App().prejuizoOuLucro(precoCusto, precoVenda));
//        }
//        System.out.println("")
////Exercício 20;
//
//    int anoFabricacao = 0;
//    float valorVeiculo = 0.0f;
//    float porcentagemDesconto = 0.0f;
//    float valorDesconto = 0.0f;
//    
//    boolean desejaRepetir = true;
//    
//    while(desejaRepetir = true){
//        System.out.println("Digite o ano de fabricação do veículo:");
//        anoFabricacao = leitorScanner.nextInt();
//        
//        System.out.println("Digite o valor do veículo:");
//        valorVeiculo = leitorScanner.nextFloat();
//        
//        if(anoFabricacao <= 2000){
//            porcentagemDesconto = 0.12f;
//            //12%
//        } else {
//            porcentagemDesconto = 0.07f;
//            //7%
//        }
//        
//        valorDesconto = valorVeiculo * porcentagemDesconto;
//        System.out.println("Deseja fazer mais cadastros? 1-  SIM 2- NÃO");
//    }
    }
}
