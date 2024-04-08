'''Faça um conversos de temperaturas.'''

def celsius_para_fahrenheit(temp_celsius):
    return (temp_celsius * 9/5) + 32

def celsius_para_kelvin(temp_celsius):
    return temp_celsius + 273.15

def fahrenheit_para_celsius(temp_fahrenheit):
    return (temp_fahrenheit - 32) * 5/9

def fahrenheit_para_kelvin(temp_fahrenheit):
    return celsius_para_kelvin(fahrenheit_para_celsius(temp_fahrenheit))

def kelvin_para_celsius(temp_kelvin):
    return temp_kelvin - 273.15

def kelvin_para_fahrenheit(temp_kelvin):
    return celsius_para_fahrenheit(kelvin_para_celsius(temp_kelvin))

def main():
    print("Bem-vindo ao Conversor de Temperaturas!")
    origem = input("Por favor, insira a unidade de temperatura de origem (Digite C para Celsius, F para Fahrenheit, ou K para Kelvin): ").lower()
    destino = input("Agora, insira a unidade de temperatura para conversão (Digite C para Celsius, F para Fahrenheit, ou K para Kelvin): ").lower()
    valor = float(input("Insira o valor da temperatura a ser convertida: "))
    
    if origem == 'c':
        if destino == 'f':
            resultado = celsius_para_fahrenheit(valor)
            print(f"{valor} Celsius equivalem a {resultado:.2f} Fahrenheit.")
        elif destino == 'k':
            resultado = celsius_para_kelvin(valor)
            print(f"{valor} Celsius equivalem a {resultado:.2f} Kelvin.")
    elif origem == 'f':
        if destino == 'c':
            resultado = fahrenheit_para_celsius(valor)
            print(f"{valor} Fahrenheit equivalem a {resultado:.2f} Celsius.")
        elif destino == 'k':
            resultado = fahrenheit_para_kelvin(valor)
            print(f"{valor} Fahrenheit equivalem a {resultado:.2f} Kelvin.")
    elif origem == 'k':
        if destino == 'c':
            resultado = kelvin_para_celsius(valor)
            print(f"{valor} Kelvin equivalem a {resultado:.2f} Celsius.")
        elif destino == 'f':
            resultado = kelvin_para_fahrenheit(valor)
            print(f"{valor} Kelvin equivalem a {resultado:.2f} Fahrenheit.")

if __name__ == "__main__":
    main()


