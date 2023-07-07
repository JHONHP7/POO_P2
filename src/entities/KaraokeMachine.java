package entities;

import java.util.ArrayList;
import java.util.List;

public class KaraokeMachine {

	private List<String> availableSongs; // Lista de músicas disponíveis
	private List<String> queue; // Fila de músicas

	public KaraokeMachine() {
		availableSongs = new ArrayList<>();
		queue = new ArrayList<>();
	}

	public void addSong(String song) {
		availableSongs.add(song);
	}

	public void removeSong(String song) {
		availableSongs.remove(song);
	}

	public void addToQueue(String song) {
		queue.add(song);
	}

	public void playNextSong() {
		if (!queue.isEmpty()) {
			String song = queue.remove(0);
			System.out.println("Playing: " + song);
		} else {
			System.out.println("Queue is empty.");
		}
	}

	public void printAvailableSongs() {
		System.out.println("Available Songs:");
		for (String song : availableSongs) {
			System.out.println(song);
		}
	}

	public void printQueue() {
		System.out.println("Queue:");
		for (String song : queue) {
			System.out.println(song);
		}
	}

}
