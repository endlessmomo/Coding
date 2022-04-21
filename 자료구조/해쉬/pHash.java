package 자료구조.해쉬;

import java.util.*;

public class pHash {
    public Slot[] hashTable;

    public pHash(Integer size){
        this.hashTable = new Slot[size];
    }

    public class Slot{
        String value;
        
        Slot(String value){
            this.value = value;
        }
    }

    // 현재 사용된 해쉬함수는 디비전 함수를 이용

    public int hashFunc(String key){
        return (int)(key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value){
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null){
            this.hashTable[address].value = value;
        } else {
            this.hashTable[address] = new Slot(value);
        }
        return true;
    }

    //null을 사용하기 위해서 Wrapper 클래스를 사용 

    public String getData(String key){
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null) {
            return this.hashTable[address].value;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        pHash m = new pHash(20);
        m.saveData("Soohyuk", "010-3237-4176");
        m.saveData("Soohyun", "010-9037-4176");

        System.out.println(m.getData("Soohyun"));
        System.out.println(m.getData("Soohyck"));
    }
}
