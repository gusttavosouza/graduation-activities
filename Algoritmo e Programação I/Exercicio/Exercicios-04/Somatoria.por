programa
{

	funcao inteiro somatorio(inteiro x){
		se (x == 1){
			retorne 1
		}senao{
			retorne x + somatorio(x-1)
		}
	}
	funcao inicio()
	{
		inteiro n = somatorio(5)
		escreva(n)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 62; 
 */