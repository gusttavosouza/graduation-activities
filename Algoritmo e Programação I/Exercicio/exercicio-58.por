programa
{
	funcao inicio()
	{
		real vetor[4][4], vetorSoma[4]={0,0,0,0},vetorMult[4]={0,0,0,0}
		
		para(inteiro i=0;i<4;i++){
			para(inteiro c = 0;c<4;c++){
				escreva("Informe o valor da posi��o: ",i+1," x ",c+1)
				leia(vetor[i][c])
			}
		}

		para(inteiro i=0;i<4;i++){
			para(inteiro c = 0;c<4;c++){
				vetorSoma[i] += vetor[i][c]
			}
		}

		para(inteiro i=0;i<4;i++){
			para(inteiro c = 0;c<4;c++){
				 vetorMult[i] += vetor[i][c] * vetorSoma[i]
			}
		}
		para(inteiro i=0;i<4;i++){		
			escreva(vetorMult[i],"\n")	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 531; 
 */