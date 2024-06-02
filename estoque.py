class LojaDeRoupas:
    def __init__(self):
        self.roupas = {
            'camisemalha': 30,
            'casaco': 20,
            'short': 10,
            'blusa': 10,
            'regata': 23,
            'jeans': 32
        }

    def get_roupas(self):
        return self.roupas

    def update_roupa(self, nome, quantidade):
        if nome in self.roupas:
            self.roupas[nome] = quantidade
        else:
            raise KeyError(f"Roupa '{nome}' não encontrada.")
