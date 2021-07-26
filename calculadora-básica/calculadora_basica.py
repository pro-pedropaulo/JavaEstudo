n1 = 0
n2 = 0
print('CALCULADORA')
while True:
    n1 = int(input('DIGITE O PRIMEIRO NUMERO: '))
    n2 = int(input('DIGITE O SEGUNDO NUMERO: '))
    print('ESCOLHA A OPERAÇÃO')
    print('[1] - SOMA\n[2] - SUBTRAÇÃO\n[3] - MULTIPLICAÇÃO\n[4] - DIVISÃO')
    escolha = int(input(''))
    while escolha > 4:
        print('OPÇÃO INCORRETA')
        print('ESCOLHA A OPERAÇÃO')
        print('[1] - SOMA\n[2] - SUBTRAÇÃO\n[3] - MULTIPLICAÇÃO\n[4] - DIVISÃO\n')
        escolha = int(input(''))
    if escolha == 1:
        soma = n1 + n2
        print(f'O resultado de {n1} + {n2} é {soma}')
    if escolha == 2:
        sub = n1 - n2
        print(f'O resultado de {n1} - {n2} é {sub}')
    if escolha == 3:
        mul = n1 * n2
        print(f'O resultado de {n1} * {n2} é {mul}')
    if escolha == 4:
        div = n1 / n2
        print(f'O resultado de {n1} / {n2} é {div}')
    outra_operacao = input('DESEJA REALIZAR OUTRA OPERAÇÃO [S] [N] ? ').upper()
    if outra_operacao == 'N':
        print('OBRIGADO POR USAR A CALCULADORA')
        break
    while True:
        while outra_operacao != 'S' and outra_operacao != 'N':
            print('OPÇÃO INCORRETA')
            outra_operacao = input('DESEJA REALIZAR OUTRA OPERAÇÃO ?').upper()
        if outra_operacao == 'S':
            break