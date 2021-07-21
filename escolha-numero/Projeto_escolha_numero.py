import random
n = random.randint(1,23)
nome = input('DIGITE SEU NOME: ').upper()
palpite = int(input('DIGITE SEU PALPITE: '))
acertou = False
tentativas = 1
while not acertou:
    if palpite < n:
        print('VOCE ERROU, TENTE UM NUMERO MAIS ALTO')
        palpite = int(input('DIGITE SEU PALPITE: '))
        tentativas += 1
    if palpite > n:
        print('VOCÊ ERROU, TENTE UM NUMERO MAIS BAIXO')
        palpite = int(input('DIGITE SEU PALPITE: '))
        tentativas += 1
    if palpite == n:
        acertou = True
if tentativas < 3:
    print('PARABÉNS {} VOCÊ É UM OTIMO JOGADOR'.format(nome))
elif tentativas <7:
    print('PARABÉNS {} VOCE É UM BOM JOGADOR '.format(nome))
elif tentativas <10:
    print('PARABÉNS {} VOCE CONSEGUIU'.format(nome))
else:
    print('VOCÊ CONSEGUIU {}, MAS DÁ PARA MELHORAR NÉ? '.format(nome))
print('VOCÊ PRECISOU DE {}'.format(tentativas))
