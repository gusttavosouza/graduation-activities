programa
{
	funcao inicio()
	{
		inteiro numeroConta,centena,dezena,unidade
		escreva("Informe o numero : \n")
		leia(numeroConta)

			centena = (numeroConta % 1000) / 100
			dezena = (numeroConta % 100) / 10
			unidade = (numeroConta % 10)

			

			escreva ("O codigo Verificador �: ",unidade,dezena,centena)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 303; 
 */