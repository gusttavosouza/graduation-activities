programa
{
	funcao inicio()
	{
		
		inteiro valor[5],diferente = 0
		
		para(inteiro i = 0; i < 5; i++){
			escreva("Informe uo codigo do produto: ")
			leia(valor[i])
			
		}

		para(inteiro c = 0; c < 5; c++){
			para(inteiro i = 0; i < 5; i++){
				se(i != c){
					se(valor[c] !=valor[i]){
						diferente++
					}
				}

			
				
			}
		}
		escreva(diferente/5)
		

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 365; 
 */