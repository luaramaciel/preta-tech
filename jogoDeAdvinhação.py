
'''Jogo de adivinhação:

Crie um programa que gere um número aleatório entre 1 e 100.

O programa deve solicitar ao usuário que adivinhe o número.

Dê dicas ao usuário, informando se o palpite é maior ou menor que o número secreto.

O programa deve parar quando o usuário adivinhar o número secreto.'''

from random import randint

def numero_aleatorio():
  aleatorio = randint(1,100)
  chute=0
  while aleatorio != chute:
    chute=int(input("Digite um valor (1 a 100): "))
    if (aleatorio == chute):
      print("Parabéns. Você acertou!")
    elif (aleatorio > chute):
      print("O número é maior que o seu chute!")
    elif (aleatorio < chute):
      print("O número é menor que o seu chute!")
    else:
      print("Operação inválida")
      
numero_aleatorio()