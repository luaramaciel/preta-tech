/*Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1:feminino 2:masculino) de uma pessoa, construa um programa que calcule e imprima seu peso ideal, 
utilizando as seguintes Fórmulas: - para homens: (72.7 * Altura) – 58 - para mulheres: (62.1 * Altura) – 44.7 */ 

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar a altura
        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();
        
        // Solicitar o sexo (1 para feminino, 2 para masculino)
        System.out.print("Digite o sexo (1 para feminino, 2 para masculino): ");
        int sexo = scanner.nextInt();
        
        // Calcular o peso ideal com base no sexo
        double pesoIdeal;
        if (sexo == 1) { // Feminino
            pesoIdeal = 62.1 * altura - 44.7;
        } else if (sexo == 2) { // Masculino
            pesoIdeal = 72.7 * altura - 58;
        } else {
            System.out.println("Sexo inválido. Por favor, digite 1 para feminino ou 2 para masculino.");
            return;
        }
        
        // Imprimir o peso ideal
        System.out.println("O peso ideal é: " + pesoIdeal + " kg");
        
        // Fechar o scanner
        scanner.close();
    }
}

