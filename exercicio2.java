/*Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano 
(não é necessário considerar o mês em que ela nasceu).*/ 

import java.util.Scanner;
import java.time.LocalDate;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Obtém o ano atual
        int anoAtual = LocalDate.now().getYear();
        
        // Ler o ano de nascimento
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        
        // Calcular a idade
        int idade = anoAtual - anoNascimento;
        
        // Verificar se a pessoa pode votar
        if (idade >= 16) {
            System.out.println("Você pode votar este ano!");
        } else {
            System.out.println("Você não pode votar este ano.");
        }
        
        // Fechar o scanner
        scanner.close();
    }
}
