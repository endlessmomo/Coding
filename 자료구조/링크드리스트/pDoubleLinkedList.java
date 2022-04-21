package 자료구조;

import java.util.*;

public class pDoubleLinkedList<T> {
    private Node<T> head = null;
    private Node<T> tail = null;
    
    public class Node<T> {
        T data;
        Node<T> prev =null;
        Node<T> pointer = null;

        public Node(T data){
            this.data = data;
        }
    }
    
    public void addNode(T data){
        if(head == null){
            this.head = new Node<T>(data);
            this.tail = head;
        } else {
            Node<T> node = this.head;
            while(node.pointer != null){
                node = node.pointer;
            }
            node.pointer = new Node<T>(data);
            node.pointer.prev = node;
        }
    }

    public void printAll(){
        if(head != null){
            Node<T> node = head;
            System.out.println(node.data);
            while(node.pointer != null){
                node = node.pointer;
                System.out.println(node.data);
            }
        }
    }

    public T searchFromHead(T isData){
        if(this.head == null){
            return null;
        } else {
            Node<T> node = this.head;
            while(node!=null){
                if(node.data == isData){
                    return node.data;
                } else{
                    node = node.pointer;
                }
            }
            return null;
        }
    }

    public T searchFromTail(T isData){
        if(this.head == null){
            return null;
        } else {
            Node<T> node = this.tail;
            while(node != null) {
                if(node.data == isData){
                    return node.data;
                } else {
                    node = node.prev;
                }
            }
            return null;
        }

    }

    public static void main(String[] args) {
        pDoubleLinkedList<Integer> m = new pDoubleLinkedList<Integer>();

        m.addNode(1);
        m.addNode(2);
        m.addNode(3);
        m.addNode(4);
        m.addNode(5);

        m.printAll();

        System.out.println(m.searchFromHead(1));
    }
}
