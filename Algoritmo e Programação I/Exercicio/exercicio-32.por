programa
{
	funcao inicio()
	{
		inteiro idade,maior = 0,menor = 0,i = 1
		faca{
			escreva("Informe a Idade: ")
			leia(idade)

			se(idade >= 18){
				maior = maior + 1	
			}senao{
				menor = menor + 1
				
			}
			
			i= i + 1
		}enquanto( i <= 10)

		escreva("\nQTD de pessoas maiores de idade: ",maior,"\n")
		escreva("QTD de pessoas menores de idade: ",menor)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 365; 
 */