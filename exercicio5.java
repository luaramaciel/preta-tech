/*Escreva um programa para ler 3 valores inteiros 
(considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.*/ 

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler os três valores inteiros
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();
        
        System.out.print("Digite o terceiro valor: ");
        int valor3 = scanner.nextInt();
        
        // Encontrar o menor valor
        int menor = valor1;
        if (valor2 < menor) {
            menor = valor2;
        }
        if (valor3 < menor) {
            menor = valor3;
        }
        
        // Encontrar o maior valor
        int maior = valor1;
        if (valor2 > maior) {
            maior = valor2;
        }
        if (valor3 > maior) {
            maior = valor3;
        }
        
        // Encontrar o valor do meio
        int meio;
        if ((valor1 != menor) && (valor1 != maior)) {
            meio = valor1;
        } else if ((valor2 != menor) && (valor2 != maior)) {
            meio = valor2;
        } else {
            meio = valor3;
        }
        
        // Imprimir os valores em ordem crescente
        System.out.println("Valores em ordem crescente: " + menor + ", " + meio + ", " + maior);
        
        // Fechar o scanner
        scanner.close();
    }
}
