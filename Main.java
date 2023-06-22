package com.demo;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(70);
        list.addFirst(30);
        list.addFirst(56);
        list.printList();
        list.removeFirst();
        list.printList();
        list.addFirst(56);
        list.removeLast();
        list.printList();


    }
}
