programa
{
	funcao inicio()
	{
		inteiro numero,impar=0,par=0


		para(inteiro i = 1;i<=20;i++){
			escreva("Informe um numero: ")
			leia(numero)

			se(numero % 2 == 0){
				par = par + 1
			}senao{
				impar = impar + 1
			}
		}

		escreva("Qtd de numeros pares: ",par)
		escreva("\nQtd de numeros impares: ",impar)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 90; 
 */