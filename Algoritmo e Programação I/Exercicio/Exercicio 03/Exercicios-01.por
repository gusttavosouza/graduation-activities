programa
{

	funcao calculaHora(inteiro minutosPassados, inteiro &horaCorrente, inteiro &minutoCorrente){

		horaCorrente = minutosPassados / 60
		minutoCorrente = minutosPassados % 60
		
	}
	funcao inicio(){
		inteiro minutosPassados, minutoCorrente = 0, horaCorrente = 0
		
		escreva("Informe quantos minutos se passaram desde a meia Noite: ")
		leia(minutosPassados)

		calculaHora(minutosPassados,horaCorrente,minutoCorrente)
			
		
		escreva("s�o ",horaCorrente,":",minutoCorrente)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 486; 
 */