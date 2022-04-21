package 자료구조;

import java.util.ArrayList;

// FIFO(First In First Out) 구조
// EnQueue (데이터 삽입 ) / DeQueue ( 데이터 꺼내기 )
public class pQueue<T> {
    ArrayList<T> queue = new ArrayList<T>();
    
    public void enQueue(T item){
        queue.add(item);
    }

    public T deQueue(){
        if(queue.isEmpty()){
            return null;
        } 
        return queue.remove(0);
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        pQueue<Integer> q = new pQueue<Integer>();
        
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
            
    }
}
