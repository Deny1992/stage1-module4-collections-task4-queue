package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        LinkedList<Integer> first = (LinkedList<Integer>) firstQueue;
        LinkedList<Integer> second = (LinkedList<Integer>) secondQueue;
        deque.add(Objects.requireNonNull(first.poll()));
        deque.add(Objects.requireNonNull(first.poll()));
        deque.add(Objects.requireNonNull(second.poll()));
        deque.add(Objects.requireNonNull(second.poll()));

        while (first.peek() != null){
            first.addLast(deque.pollLast());
            deque.add(Objects.requireNonNull(first.poll()));
            deque.add(Objects.requireNonNull(first.poll()));
            second.addLast(deque.pollLast());
            deque.add(Objects.requireNonNull(second.poll()));
            deque.add(Objects.requireNonNull(second.poll()));
        }

        return deque;
    }
}
