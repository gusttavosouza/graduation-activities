programa
{
	funcao inicio()
	{
		inteiro num = 0
	
		escreva("Informe a QTD de Linhas")
		leia(num)

		para(inteiro i = 0; i < num;i++){
			para(inteiro y = 0;y < i + num ;y++){
				se(y < num - i - 1){
					escreva(" ")
				}senao{
					escreva("*")
				}
			
		}
		escreva("\n")	
	}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 174; 
 */