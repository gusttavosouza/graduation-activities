programa
{
	funcao ordene(inteiro &a,inteiro &b, inteiro &c){
		inteiro x =0 
		se(a < b e a < c){
			pare

			
		}senao se(b < a e b < c){
			x = a
			a = b
			b = x
			
			
		}senao se( c < a e c < b){
			x = a 
			a = c
			c = x
		}
		se(c < b){
				x = c 
				c = b
				b = x
			}

		
		
	}
	funcao inicio(){
		inteiro  x=6,y=4,z=5
		ordene(x,y,z)

		escreva(x,"\n",y,"\n",z)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 284; 
 */