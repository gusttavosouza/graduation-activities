programa
{
	funcao inicio()
	{
		real numero1,numero2,numero3,media

		escreva("Informe a Primeira nota ")
		leia(numero1)
		escreva("Informe a Segunda nota: ")
		leia(numero2)
		escreva("Informe a Terceira nota: ")
		leia(numero3)

		media = (numero1+numero2+numero3) / 3

		se(media >= 6){
			escreva("Aprovado")
		}senao {
			escreva("Reprovado")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 349; 
 */