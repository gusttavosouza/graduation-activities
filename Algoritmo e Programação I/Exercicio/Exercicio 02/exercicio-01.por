programa
{

	funcao logico parOuImpar(inteiro num){
		logico k
		se(num % 2 == 0){
			k = verdadeiro
		}senao{
			k = falso
		}
		retorne k
	}
	funcao inicio(){
		inteiro num
		logico x
		escreva("Informe um numero: ")
		leia(num)
		x = parOuImpar(num)

		escreva(x)
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 268; 
 */