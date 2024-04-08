/*Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número 1234. Devem ser impressas as seguintes mensagens: 
ACESSO PERMITIDO caso a senha seja válida. ACESSO NEGADO caso a senha seja inválida*/ 

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar a senha ao usuário
        System.out.print("Digite a senha: ");
        int senha = scanner.nextInt();
        
        // Verificar se a senha está correta
        if (senha == 1234) {
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }
        
        // Fechar o scanner
        scanner.close();
    }
}
