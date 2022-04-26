package 자료구조.스택;

/* 제네릭 형식으로 선언을 하여 어떠한 자료형으로도 넣을 수 있도록 해줌
   스택의 기본적인 구조 LIFO(Last in First Out) 
   push(데이터 삽입) / pop(데이터 꺼내기) */

import java.util.ArrayList;

public class pStack<T> {
    private ArrayList<T> stack = new ArrayList<T>();

    public void push(T item){
        stack.add(item);
    }
    
    public T pop(){
        if(stack.isEmpty()){
            return null;
        }        
        return stack.remove(stack.size()-1);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        pStack<Integer> s = new pStack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
