programa
{
	funcao inicio()
	{
		inteiro vetor[10],posicao=0,maiorValor=0

		para(inteiro i = 0;i < 10;i++){
			escreva("Informe o valor: ")
			leia(vetor[i])

			se(vetor[i] > maiorValor){
				posicao = i
				maiorValor = vetor[i]
			}
		}

		escreva("O maior valor digitado foi ",maiorValor, " e sua posi��o � ",posicao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 322; 
 */