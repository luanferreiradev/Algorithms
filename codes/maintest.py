from faker import Faker
import random

# Inicializa o Faker para gerar nomes
fake = Faker()

# Gera uma lista de 128 nomes
nomes = [fake.name() for _ in range(128)]

# Ordena a lista de nomes
nomes.sort()

# Função para busca binária
def busca_binaria(lista, elemento):
    inicio = 0
    fim = len(lista) - 1
    while inicio <= fim:
        meio = (inicio + fim) // 2
        if lista[meio] == elemento:
            return meio
        elif lista[meio] < elemento:
            inicio = meio + 1
        else:
            fim = meio - 1
    return -1

# Nome a ser procurado
nome_procurado = nomes[random.randint(0, len(nomes) - 1)]

# Realiza a busca binária
indice = busca_binaria(nomes, nome_procurado)

# Verifica se o nome foi encontrado
if indice != -1:
    print(f"O nome '{nome_procurado}' foi encontrado na posição {indice}.")
else:
    print(f"O nome '{nome_procurado}' não foi encontrado.")
