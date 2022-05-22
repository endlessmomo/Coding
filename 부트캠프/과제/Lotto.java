package 부트캠프.과제;

import java.util.*;

public class Lotto {
    public static void main(String[] args) {

        System.out.println("[로또 당첨 프로그램]\n");
        int lotto_count = lotto_count_func();

        char lotto_order = 'A';
        int[][] lotto_R_Num = new int[lotto_count][6];

        // 로또 랜덤 번호 부여 및 중복 검사를 실행
        for(int i=0; i<lotto_R_Num.length; i++){
            for(int j=0; j<6; j++){
                lotto_R_Num[i][j] = new Random().nextInt(45)+1;
                
                for(int a=0; a<j; a++){
                    if(lotto_R_Num[i][j] == lotto_R_Num[i][a]){
                        j--;
                        break;
                    }
                }
            }
            Arrays.sort(lotto_R_Num[i]);
        }

        lotto_Screen(lotto_R_Num, lotto_order);
        
        System.out.println("\n[당첨 번호 발표]");
        int[] winning_Num = new int[6];
        winning_Num = winning_Num();
        lotto_winning_screen(winning_Num);

      //  lotto_collect_Num(int[][] lotto_R_Num, int[] winning_Num);

        }
    
    // 갯수 입력 및 범위 체크
    public static int lotto_count_func(){
        Scanner sc = new Scanner(System.in);
        int lotto_count = 0;
        
        while(true){
            System.out.print("구매할 로또의 개수를 입력해 주세요. (숫자 1~10) : ");
            lotto_count = sc.nextInt();
            
            if(lotto_count < 1 || lotto_count >11){
                System.out.println("범위를 초과했습니다. 다시 입력하세요. ");
                continue;
            }   
            break;
        }
        sc.close();
        return lotto_count;
    }
    
    // 로또 번호 출력
    public static void lotto_Screen(int[][] lotto_R_Num, char lotto_order){
        for(int[] itemA : lotto_R_Num){
            System.out.print(lotto_order++ + "  ");
            for(int itemB : itemA){
                System.out.print(String.format("%2d ", itemB));
            }
            System.out.println("");
        }
    }

    // 로또 당첨 번호 생성 및 중복 검사
    public static int[] winning_Num(){
        int[] result = new int[6];
        for(int i=0; i<result.length; i++){
            result[i] = new Random().nextInt(45)+1;

            for(int j=0; j<i; j++){
                if(result[i] == result[j]){
                    j--;
                    continue;
                }
                break;
            }
        }

        return result;
    }

    // 로또 당첨 번호 화면 출력
    public static void lotto_winning_screen(int[] winning_Num){
        System.out.print("   ");
        for(int item : winning_Num){
            System.out.print(String.format("%2d ", item));
        }
    }

    // 로또 당첨 및 결과 화면
    public static void lotto_collect_Num(int[][] lotto_R_Num, int[] winning_Num){
        int[] collect_count = new int[6]; 
        for(int[] itemA : lotto_R_Num){
            for(int itemB : itemA){
                for(int i=0; i < winning_Num.length; i++){
                    itemB = winning_Num[i];

                }
            }
        }
    }
}
