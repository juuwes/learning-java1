/**
 * 
 */
package br.com.juuwes;

/**
 * @author juuwes
 *
 *  Exercício sobre o comando swtich.
 *
 */
public class TestaSwitch {

	public static void main(String[] args) {
		int diaDaSemana = 1;
		switch (diaDaSemana) {
		case 1:
			System.out.println("Segunda");
			break;
		case 2:
			System.out.println("Terça");
			break;
		case 3:
			System.out.println("Quarta");
			break;
		case 4:
			System.out.println("Quinta");
			break;
		case 5:
			System.out.println("Sexta");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Dia da semana inválido");
			break;
		}

	}

}
