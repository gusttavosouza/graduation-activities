programa
{
	funcao  realizaTest(inteiro A,inteiro B,inteiro C){
		se((B*B) + (C*C) == (A*A)){
			escreva("Igualdade Existe")
		}senao{
			escreva("Igualdade n�o existe")
		}
	}

	
	funcao inicio()
	{
		inteiro A,B,C
		escreva("Informe o valor de A : ")
		leia(A)
		escreva("Informe o valor de B : ")
		leia(B)
		escreva("Informe o valor de C : ")
		leia(C)

		realizaTest(A,B,C)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 8; 
 */