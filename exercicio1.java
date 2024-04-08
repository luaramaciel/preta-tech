/*Escreva um programa para ler 2 valores (considere que não serão informados valores iguais) e escrever 
o maior deles. */ 

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler o primeiro valor
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        
        // Ler o segundo valor
        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        
        // Verificar qual é o maior valor
        double maior = valor1 > valor2 ? valor1 : valor2;
        
        // Imprimir o resultado
        System.out.println("O maior valor é: " + maior);
        
        // Fechar o scanner
        scanner.close();
    }
}
