programa
{
	funcao inicio()
	{
		inteiro numero,fator = 0

		escreva("Informe um numero :")
		leia(numero)
		fator = numero
		
		para(inteiro i = numero;i > 1;i--){
			escreva(i," X ")
			fator = (fator * (i-1))
	
		}
		escreva("1")

		escreva("\n o fatorial � : ",fator)


		
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 213; 
 */