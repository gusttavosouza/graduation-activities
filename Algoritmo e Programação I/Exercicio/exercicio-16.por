programa
{
	funcao inicio()
	{
		real numero1,numero2

		escreva("Informe um numero: ")
		leia(numero1)
		escreva("Informe outro numero:")
		leia(numero2)

		se(numero1 > numero2){
			escreva(numero1 ," � maior")
		}senao se(numero2 > numero1){
			escreva(numero2," � maior")		
		}senao{
			escreva("os numeros informados s�o iguais")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 224; 
 */