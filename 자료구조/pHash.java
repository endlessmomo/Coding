package 자료구조;
/* 해쉬 테이블 
    키(Key)와 데이터(Value)를 매핑할 수 있는 데이터 구조
    해쉬 함수를 통해 배열에 키에 대한 데이터를 저장할 수 있는 주소(인덱스 번호)를 계산
    Key를 통해 바로 데이터가 저장되어 있는 주소를 알 수 있으므로 저장 및 탐색 속도가 획기적으로 빨라짐
    미리 해쉬 함수가 생성할 수 있는 주소(인덱스 번호)에 대한 공간을 배열로 할당한 후, 키에 따른 데이터 저장 및 탐색 지원

    해쉬 함수 : 임의의 데이터를 고정된 길이의 값을로 리턴해주는 함수

    해쉬 테이블 : 키 값의 연산에 의해 직접 접근이 가능한 데이터 구조
     슬롯(slot) : 해쉬 테이블에서 한 개의 데이터를 저장할 수 있는 공간
*/
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
        m.saveData("Soohyun", "010=9037-4176");

        System.out.println(m.getData("Soohyun"));
        System.out.println(m.getData("Soohyck"));
    }
}
