package 부트캠프.과제2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class homework7 {
    public static void main(String[] args) throws IOException {

       System.out.print("[로또 당첨 프로그램\n\n]");
       
       // 구매할 로또 개수 및 범위 유효 검사
       int lotto_count = lotto_count_func();

       // 랜덤 로또 생성 및 중복
       int[][] lotto_Num = new int[lotto_count][6];
       char order = 'A';
       
       for(int i=0; i<lotto_count; i++){
           for(int j=0; j<lotto_Num[i].length; j++){
                lotto_Num[i][j] = new Random().nextInt(45)+1;
            
                for(int k=0; k<j; k++){
                    if(lotto_Num[i][j] == lotto_Num[i][k]){
                        j--;
                        break;
                    }
                }
           }
           Arrays.sort(lotto_Num[i]);
       }

       // 화면단 구성
        for(int[] itemA : lotto_Num){
            System.out.print(order++ + "  ");
            for(int itemB : itemA){
                System.out.printf("%2d ", itemB);
            }
            System.out.println("");
        }

        // 로또 구현 및 화면 출력

        int[] lotto_winning_num = new int[6];
        for(int i=0; i<lotto_winning_num.length; i++){
            lotto_winning_num[i] = new Random().nextInt(45)+1;

            for(int j=0; j<i; j++){
                if(lotto_winning_num[i] == lotto_winning_num[j]){
                    i--;
                    continue;
                }
                break;
            }
        }

        Arrays.sort(lotto_winning_num);
        System.out.println("\n[당첨 번호 발표]");
        System.out.print("  ");
        for(int item : lotto_winning_num){
            System.out.printf("%d ", item);
        }

        // 로또 결과 및 맞춘 갯수
        int[] lotto_winning_count = new int[6];
        
        lotto_winning_count = lotto_winning_count_func(lotto_Num, lotto_winning_num);

        //화면과 맞은 갯수 출력
        System.out.println("\n\n[결과 발표]");
        int idx = 0;
        order = 'A';

        for(int[] itemA : lotto_Num){
            
            System.out.print(order++ + "  ");
            for(int itemB : itemA){
                System.out.printf("%2d ", itemB);
            }
            System.out.printf("=> %d개 일치", lotto_winning_count[idx++]);
            System.out.println(" ");
        }

    }
    
    public static int lotto_count_func(){
        Scanner s = new Scanner(System.in);
        int lotto_count = 0;

        while(true){
            System.out.print("로또 개수를 입력해 주세요. (숫자 1~10) : ");
            
            lotto_count = s.nextInt();

            if(lotto_count <1 || lotto_count > 10){
                System.out.println("범위를 초과하였습니다. 다시 입력하세요.");
                continue;
            }
            break;
        }

        s.close();

        return lotto_count;
    }

    public static int[] lotto_winning_count_func(int[][] lotto_Num, int[] lotto_winning_num){
        int[] lotto_w_count = new int[lotto_Num.length];

        for(int i=0; i<lotto_Num.length; i++){
            lotto_w_count[i] = 0;
            for(int j=0; j<lotto_Num[i].length; j++){
                for(int k=0; k<lotto_winning_num.length; k++){
                    if(lotto_Num[i][j] == lotto_winning_num[k]){
                        lotto_w_count[i]++;
                        break;
                    }
                }
                
            }
        }
        return lotto_w_count;
    }
}
