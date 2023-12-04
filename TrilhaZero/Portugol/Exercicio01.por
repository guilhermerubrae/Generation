programa
{
	funcao inteiro leituraVetor(var vetor: vetor[1..10] de inteiro)
	var
	    i: inteiro
	inicio
	    para i de 1 ate 10 faca
	        escreva("Digite o elemento ", i, " do vetor: ")
	        leia(vetor[i])
	    fimPara
	fimFuncao
}
funcao exibirElementosImpares(var vetor: vetor[1..10] de inteiro)
var
    i: inteiro
inicio
    escreva("\nElementos nos índices ímpares:\n")
    para i de 1 ate 10 passo 2 faca
        escreva(vetor[i], " ")
    fimPara
    escreva("\n")
fimFuncao

funcao exibirElementosPares(var vetor: vetor[1..10] de inteiro)
var
    i: inteiro
inicio
    escreva("\nElementos pares:\n")
    para i de 1 ate 10 faca
        se vetor[i] mod 2 = 0 entao
            escreva(vetor[i], " ")
        fimSe
    fimPara
    escreva("\n")
fimFuncao

funcao calcularSoma(var vetor: vetor[1..10] de inteiro): inteiro
var
    i, soma: inteiro
inicio
    soma := 0
    para i de 1 ate 10 faca
        soma := soma + vetor[i]
    fimPara
    retorne soma
fimFuncao

funcao calcularMedia(var vetor: vetor[1..10] de inteiro): real
var
    i, soma, qtdPares: inteiro
    media: real
inicio
    soma := 0
    qtdPares := 0
    para i de 1 ate 10 faca
        se vetor[i] mod 2 = 0 entao
            soma := soma + vetor[i]
            qtdPares := qtdPares + 1
        fimSe
    fimPara

    se qtdPares > 0 entao
        media := soma / qtdPares
    senao
        media := 0
    fimSe

    retorne media
fimFuncao

var
    vetor: vetor[1..10] de inteiro

inicio
    leituraVetor(vetor)
    exibirElementosImpares(vetor)
    exibirElementosPares(vetor)
    
    escreva("\nSoma:\n", calcularSoma(vetor), "\n")
    
    escreva("\nMédia:\n", arredonda(calcularMedia(vetor)), "\n")
fim.



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 30; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */