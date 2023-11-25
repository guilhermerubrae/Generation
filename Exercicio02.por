programa OperacoesComVetor

var
    vetor: vetor[1..10] de inteiro
    i, soma, qtdPares: inteiro
    media: real

// Leitura do vetor
para i de 1 ate 10 faca
    escreva("Digite o elemento ", i, " do vetor: ")
    leia(vetor[i])
fimPara

// Elementos nos índices ímpares
escreva("\nElementos nos índices ímpares:\n")
para i de 1 ate 10 passo 2 faca
    escreva(vetor[i], " ")
fimPara
escreva("\n")

// Elementos pares
escreva("\nElementos pares:\n")
para i de 1 ate 10 faca
    se vetor[i] mod 2 = 0 entao
        escreva(vetor[i], " ")
        soma := soma + vetor[i]
        qtdPares := qtdPares + 1
    fimSe
fimPara
escreva("\n")

// Soma
escreva("\nSoma:\n", soma, "\n")

// Média (arredondada)
se qtdPares > 0 entao
    media := soma / qtdPares
    escreva("\nMédia:\n", arredonda(media), "\n")
senao
    escreva("\nMédia:\n0\n")
fimSe

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 843; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */