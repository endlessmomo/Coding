package 부트캠프.수학;

import java.util.*;

class Set_Mine {
    ArrayList<Integer> list;

    Set_Mine(){
        this.list = new ArrayList<Integer>();
    }

    Set_Mine(int[] arr){
        this.list = new ArrayList<Integer>();

        for(int item:arr){
            this.list.add(item);
        }
    }

// 원소 추가 (중복 x)
    public void add(int x) {
        for(int item : this.list){
            if (item == x){
                return;
            }
        }
        this.list.add(x);
    }

// 교집합
    public Set_Mine retainAll(Set_Mine b){
        Set_Mine result = new Set_Mine();

        for(int itemA : this.list){
            for(int itemB : b.list){
                if ( itemA == itemB){
                    result.add(itemA);
                }
            }
        }
        return result;
    }    

// 합집합
    public Set_Mine addAll(Set_Mine b){
        Set_Mine result = new Set_Mine();

        for(int itemA : this.list){
            result.add(itemA);
        }

        for(int itemB : this.list){
            result.add(itemB);
        }

        return result;
    }

// 차집합
    public Set_Mine removeAll(Set_Mine b){
        Set_Mine result = new Set_Mine();

        for(int itemA : this.list){
            boolean containFlag = false;

            for(int itemB : b.list) {
                if ( itemA == itemB ){
                    containFlag =true;
                    break;
                }
            }

            if(!containFlag){
                result.add(itemA);
            }
        }
    } 
}

public class MySet {
    public static void main(String[] args) {
        
    }    
}
