package 자료구조;
import java.util.*;

import javax.crypto.spec.PBEKeySpec;

/* 링크드리스트의 특징
   노드(하나의 데이터 / |data|pointer|로 구성) -> |데이터|다음데이터의주소| --> |데이터|다음데이터의주소| 식으로 연결됨
   노드에서 다음데이터의 주소값을 알고있기에 접근은 빠르지만, 공간을 더 많이 할당하기에 공간복잡도 효율은 떨어진다.
   배열과 다르게 미리 배열의 크기를 할당하지 않아도 된다.
*/
public class pSingleLinkedList<T> {
    public Node<T> head = null; // 링크드 리스트의 가장 첫번째

    public class Node<T>{
        T data;
        Node<T> next = null;

        public Node(T data){
        this.data = data;
        }
    }

    // |head(주소값)| --> |data|pointer(node.next)| --> |data|pointer(null)|
    public void addNode(T data){
        // 처음 노드가 없을 때 
        if(head == null){
            head = new Node<T>(data);
        } else {       
            Node<T> node = this.head;
            //포인터가 가르키는 곳이 없는 곳으로 이동
            while(node.next != null){
                node = node.next;
            }
            node.next = new Node<T>(data); 
        }
    }

    // 중간에 데이터 삽입
    // isData 어느 데이터 뒤에 삽입할 지 알기 위해서
    public void addNodeInside(T data, T isData)  {
        Node<T> searchedNode = this.search(isData);

        if(searchedNode == null){
            this.addNode(data);
        } else {
            Node<T> nextNode = searchedNode.next;
            searchedNode.next = new Node<T>(data);
            searchedNode.next.next = nextNode; 
        }
    }

    // 노드 삭제
    // 메모리 자체는 가비지 컬렉션에 의해 자동 삭제가 된다.
    public boolean delNode(T isData){
        if(this.head == null){
            return false;
        } else {
            Node<T> node = this.head;

            if(node.data == isData){
                this.head = this.head.next;
                return true;
            } else {
                while(node.next != null){
                    if(node.next.data == isData){
                        node.next = node.next.next;
                        return true;
                    } 
                    node = node.next;
                }
                return false;
            }
        }
    }

    public Node<T> search(T data){
        if(this.head == null){
            return null;
        } else{
            Node<T> node = this.head;

            while(node != null){
                if(node.data == data){
                    return node ;
                } else {
                    node = node.next;
                }
            }
        }
        return null;
    }
     
    public void printAll(){
        if(head != null){
            Node<T> node = this.head;
            System.out.println(node.data);
            while(node.next != null ){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public static void main(String[] args) {
        pSingleLinkedList<Integer> MyLinkedList = new pSingleLinkedList<Integer>();
        MyLinkedList.addNode(3);
        MyLinkedList.addNode(5);
        MyLinkedList.addNode(7);
        MyLinkedList.addNodeInside(8, 7);
        MyLinkedList.addNode(9);
        MyLinkedList.delNode(5);

        MyLinkedList.printAll();
    }
}
