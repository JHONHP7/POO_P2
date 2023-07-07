package colecoes;
import java.util.*;

public class Questao_2 {
    public static void main(String[] args) {
        // Criando um ArrayList de strings
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Maçã");
        arrayList.add("Banana");
        arrayList.add("Laranja");
        arrayList.add("Abacaxi");
        arrayList.add("Uva");

        // Exibindo o ArrayList original
        System.out.println("ArrayList: " + arrayList);

        // Convertendo o ArrayList em HashSet
        HashSet<String> hashSet = new HashSet<>(arrayList);

        // Exibindo o HashSet
        System.out.println("HashSet: " + hashSet);

        // Convertendo o HashSet em PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(hashSet);

        // Exibindo a PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);

        // Convertendo a PriorityQueue em ArrayDeque
        ArrayDeque<String> arrayDeque = new ArrayDeque<>(priorityQueue);

        // Exibindo o ArrayDeque
        System.out.println("ArrayDeque: " + arrayDeque);

        // Convertendo o ArrayDeque em TreeSet
        TreeSet<String> treeSet = new TreeSet<>(arrayDeque);

        // Exibindo o TreeSet
        System.out.println("TreeSet: " + treeSet);
    }
}

