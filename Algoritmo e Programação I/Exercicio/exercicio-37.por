programa
{
	funcao inicio()
	{
		inteiro num, total=0
		
		escreva("Informe um numero: ")
		leia (num)
		
		para(inteiro i = 1; i <= num; i++){
			se(num % i == 0){
				total = total + 1
			}
		}
		se(total == 2 ou num == 1){
			escreva("Numero � Primo")
		}senao{
			escreva("Numero n�o � primo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 218; 
 */