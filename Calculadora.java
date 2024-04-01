package SobreCarga;

import java.util.Scanner;

public class Calculadora {
    public static void main(String []args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a operação: \n"
                         + "1 - Adição dois valores inteiros\n"
                         + "2 - Subtração\n"
                         + "3 - Multiplicação\n"
                         + "4 - Divisão\n"
                         + "5 - Exponenciação\n"
                         + "6 - Fatorial\n"
                         + "7 - Adição três valores\n"
                         + "8 - Adição dois valores texto");
        int tipo = scanner.nextInt();
        System.out.println("Digite o valor 1:");
        int valor1 = scanner.nextInt();
        int valor2 = 0;
        if (tipo != 5 && tipo != 6) {
            System.out.println("Digite o valor 2:");
            valor2 = scanner.nextInt();
        }
        scanner.close();

        Operacao operacao = new Operacao();

        switch (tipo) {
            case 1: System.out.println("Adição 2 valores inteiros " + operacao.soma(valor1, valor2));
            break;

            case 2: operacao.setMinuendo(valor1);
                   operacao.setSubtraendo(valor2);
                   System.out.println("Subtração " + operacao.subtracao());
            break;
            
            case 3: operacao.setNumeroGenerico1(valor1);
                   operacao.setNumeroGenerico2(valor2);
                   System.out.println("Multiplicação = " + (valor1 * valor2));
            break;

            case 4: operacao.setNumeroGenerico1(valor1);
                   operacao.setNumeroGenerico2(valor2);
                   System.out.println("Divisão = " + (valor1 / valor2));
            break;

            case 5: operacao.setNumeroGenerico1(valor1);
                    operacao.setNumeroGenerico2(valor2);
                    System.out.println("Exponencial = " + operacao.exponenciacao());
            break;

            case 6: operacao.setFatorial(valor1);
                   System.out.println("Fatorial = " + operacao.getFatorail());
            break;

            case 7: System.out.println("Adição 3 valores = " + operacao.soma(valor1, valor2, 78));
            break;

            case 8: System.out.println("Adição 2 valores textos = " + operacao.soma(Integer.toString(valor1), Integer.toString(valor2)));
            break;
            default: System.out.println("Operação inválida!");
        
        }
    }
    
}
