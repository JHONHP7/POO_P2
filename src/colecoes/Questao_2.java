package colecoes;
import java.util.*;


/* Faça um programa que converta um ArrayList em um HashSet, este em um 
PriorityQueue, este em um ArrayDeque e este em um TreeSet usando a versão 
de seus construtores que use um Collection como argumento. Comece criando um 
pequeno ArrayList de strings e exibindo a lista usando seu método toString().
Em seguida, faça o mesmo para construir e exibir os outros Collections, usando um 
como argumento do construtor do próximo. Ainda que todos os Collections
contenham as mesmas strings, você deve vê-los sendo exibidos em ordens diferentes 
em alguns deles. Por quê? */

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

