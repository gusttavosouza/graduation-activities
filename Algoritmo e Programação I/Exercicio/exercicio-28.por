programa
{
	funcao inicio()
	{
		inteiro numero,qtdNumeroPares =0, total = 0, result
		
		escreva("Informe o Numero real positivo:\n")
		leia(numero)
			se(numero <0){
				escreva("Numero invalido, tente novamente\n")
			}senao{
				escreva("Numero � valido")
			}
		
		enquanto(numero < 0){
			escreva("Informe o Numero real positivo:\n")
			leia(numero)

			se(numero < 0){
				escreva("Numero invalido, tente novamente\n")
			}senao{
				escreva("Numero � valido")
			}
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 372; 
 */