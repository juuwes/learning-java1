/**
 * 
 */
package br.com.juuwes;

/**
 * @author juuwes
 *
 *         Exercício sobre as condicionais if; else; expressões booleanas.
 *
 */
public class TestaCondicional2 {
	public static void main(String[] args) {
		int idade = 20;
		int quantidadePessoas = 2;
		boolean acompanhado;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		if (idade >= 18 || acompanhado) {
			System.out.println("Entrada Permitida");
		} else {
			System.out.println("Entrada Proibida");
		}

	}

}
