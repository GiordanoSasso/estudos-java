package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();

        //Offer e Add --> adicionam elementos na fila

        //Diferença é o comportamento que ocorre
        //quando a fila está cheia!
        fila.add("Ana");//retorna false
        fila.offer("Bia");//lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");


        //Peek e Element --> obter o próximo elemento
        //da fila(sem remover)

        //Diferença é o comportamento que ocorre
        //quando a fila está vazia!
        System.out.println(fila.peek());//retorna false
        System.out.println(fila.peek());
        System.out.println(fila.element());//lança uma execeção
        System.out.println(fila.element());


        //Poll e remove --> obter o próximo elemento
        //da fila e remove!

        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());
    }
}
