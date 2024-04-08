/*As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze. 
Escreva um programa que leia o número de maçãs compradas, calcule e escreva o valor total da compra.*/ 

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar o número de maçãs compradas
        System.out.print("Digite o número de maçãs compradas: ");
        int quantidade = scanner.nextInt();
        
        double precoPorMacas;
        
        // Verificar o preço por maçã com base na quantidade comprada
        if (quantidade < 12) {
            precoPorMacas = 0.30; // preço por maçã se compradas menos do que uma dúzia
        } else {
            precoPorMacas = 0.25; // preço por maçã se compradas pelo menos uma dúzia
        }
        
        // Calcular o valor total da compra
        double valorTotal = quantidade * precoPorMacas;
        
        // Imprimir o valor total da compra
        System.out.println("O valor total da compra é: R$ " + valorTotal);
        
        // Fechar o scanner
        scanner.close();
    }
}
