programa
{
	funcao inteiro LeNumero(inteiro n1,inteiro n2){
		inteiro numero
		
		escreva("Informe um numero: ")
		leia(numero)
		
		enquanto(numero <= n1 ou numero > n2){
			escreva("Numero Invalido! Informe um outro numero: ")
			leia(numero)
		}
		retorne numero
	}

	funcao inteiro tabuada(inteiro numero){

		para(inteiro i = 1;i <= 10;i++){
			escreva(numero," X ", i," = ", numero*i,"\n")
		}
		
	}
	
	funcao inicio()
	{
		inteiro x
		x = LeNumero(1,10)
		tabuada(x)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 394; 
 * @DOBRAMENTO-CODIGO = [2];
 */