package com.daniel.rascunho;

import java.util.PriorityQueue;


public class Main {

    public static void main(String[] args) {
        // fila de capacidade 11
        PriorityQueue<Double> queue = new PriorityQueue<>();
        
        // insere elementos na fila
        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);
        queue.offer(1.0);
        queue.offer(10.0);
        queue.offer(8.0);
        
        // exibe elementos na fila
        while (queue.size() > 0){
            System.out.println("Fila: " + queue.toString());
            System.out.printf("Frente da fila: %.1f\n", queue.peek()); // vizualiza o elemento superior
            queue.poll(); // remove o elementos superior
        }
    }
    
}
