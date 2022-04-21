package 자료구조.해쉬;

import java.security.Key;

public class pHash_Chaining {
    public Slot[] hashTable;

    public pHash_Chaining(Integer size){
        this.hashTable = new Slot[size];
    }

    public class Slot{
        String value;
        String key;
        Slot next; // 체이닝기법에선 링크드 리스트가 사용되기에 다음을 나타낼 포인터 변수

        Slot(String key, String value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    //해시 함수 -> division 기법을 활용
    public int hashFunc(String key){
        return (int)(key.charAt(0)) % hashTable.length;
    }

    public boolean saveData(String key, String value){
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null){
            Slot findSlot = this.hashTable[address];
            Slot prevSlot = this.hashTable[address];
            while(findSlot != null) {
                if(findSlot.key == key){
                    findSlot.value = value;
                    return true;
                } else {
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
            }   
            prevSlot.next = new Slot(key, value);
        } else {
            this.hashTable[address] = new Slot(key, value);
        }
        return true;
    }

    public String getData(String key){
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null) {
            Slot findSlot = this.hashTable[address];
            while(findSlot != null){
                if(findSlot.key == key){
                    return findSlot.value;
                } else {
                    findSlot = findSlot.next;
                }
            }
            return null;
        } else {
        return null;
        }
    }
    
}
