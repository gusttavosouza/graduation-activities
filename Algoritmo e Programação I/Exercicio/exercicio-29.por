programa
{
	funcao inicio()
	{
		inteiro numero1,numero2,operacao,result
		
		faca{
			escreva("Informe o primeiro numero: ")
			leia(numero1)
			escreva("Informe o segundo Numero: ")
			leia(numero2)
			escreva("Escolha a Opera��o :\n")
			escreva("[1] Soma\n")
			escreva("[2] Subtrair\n")
			escreva("[3] Multiplica��o\n")
			escreva("[4] Divis�o\n")
			leia(operacao)

			escolha (operacao){
				caso 1:
					result  = numero1 + numero2
					escreva(result,"\n")
					pare
				caso 2:
					result = numero1 - numero2
					escreva(result,"\n")
					pare
				caso 3:
					result = numero1 * numero2
					escreva(result,"\n")
					pare
				caso 4:
					result = numero1 / numero2
					escreva(result,"\n")
					pare
				caso contrario:
					escreva("Escolha a Opera��o novamente :\n")
						escreva("[1] Soma\n")
						escreva("[2] Subtrair\n")
						escreva("[3] Multiplica��o\n")
						escreva("[4] Divis�o\n")
						leia(operacao)
				
			}
					
		}enquanto(numero1 != 0 e numero2 != 0)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 706; 
 */