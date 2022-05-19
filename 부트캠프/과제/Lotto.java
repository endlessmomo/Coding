package 부트캠프.과제;

import java.util.*;

public class Lotto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();


        int lotto_count = 0;

        System.out.println("[로또 당첨 프로그램]\n");
        System.out.print("로또 개수를 입력해 주세요. (숫자 1~10) : ");
        lotto_count = sc.nextInt();

        // 로또를 표현할 방법 n x 6 행렬로 표현
        int[][] lotto_Num = new int[lotto_count][6];

        // 로또 랜덤 번호를 생성
        if(lotto_count < 11){
            for(int i=0; i<lotto_Num.length; i++){
                for(int j=0; j<lotto_Num[i].length; j++){
                    lotto_Num[i][j] = rc.nextInt(45)+1;
                }
            Arrays.sort(lotto_Num[i]);
            }
        }

        // 로또 출력
        char lotto_order = 'A';
        for(int i=0; i<lotto_Num.length; i++){
            System.out.print(lotto_order++ + "  ");
            for(int j=0; j<lotto_Num[i].length; j++){
                System.out.print(String.format("%02d ", lotto_Num[i][j]));       
            }   
            System.out.println("");
        }

        // 당첨 로또 번호 
        int[] winning_Num = new int[6];
        for(int i=0; i<winning_Num.length; i++){
            winning_Num[i] = rc.nextInt(45) + 1;
        }
        Arrays.sort(winning_Num);

        System.out.println("\n[당첨 발표]");
        System.out.print("   ");
        for(int a : winning_Num){
            System.out.print(String.format("%02d ", a));
        }

        // 당첨 여부 확인

        for(int i=0; i<lotto_Num.length; i++){
            int w_count = 0;
            for(int j=0; j<lotto_Num[i].length; j++){
                
            }
        }

    }
}
