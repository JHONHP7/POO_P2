package colecoes;

import entities.KaraokeMachine;

public class Questao_3 {
	
	public static void main(String[] args) {

		KaraokeMachine karaokeMachine = new KaraokeMachine();

		karaokeMachine.addSong("Song 1");
		karaokeMachine.addSong("Song 2");
		karaokeMachine.addSong("Song 3");

		karaokeMachine.addToQueue("Song 1");
		karaokeMachine.addToQueue("Song 2");
		karaokeMachine.addToQueue("Song 3");

		karaokeMachine.printAvailableSongs();
		karaokeMachine.printQueue();

		karaokeMachine.playNextSong(); // Reproduz a primeira música da fila

		karaokeMachine.printQueue();
	}
	
	

}
