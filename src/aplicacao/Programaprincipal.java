package aplicacao;

import xadrez.PartidaDeXadrez;

public class Programaprincipal {

	public static void main(String[] args) {
		
		PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
		UI.printTabuleiro(partidaDeXadrez.getPeca());

	}

}
