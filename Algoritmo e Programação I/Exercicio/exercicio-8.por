programa
{
	funcao inicio()
	{
		inteiro numeroConta,milhar,centena,dezena,unidade,soma,mult, sub, mod
		escreva("Informe o numero da Conta: \n")
		leia(numeroConta)

			milhar = numeroConta / 1000
			centena = (numeroConta % 1000) / 100
			dezena = (numeroConta % 100) / 10
			unidade = (numeroConta % 10)

			soma = milhar + centena + dezena +unidade
			mult = milhar * centena *dezena *unidade
			sub = mult - soma
			mod = sub % 9

			escreva ("O codigo Verificador �: ",mod)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 479; 
 */