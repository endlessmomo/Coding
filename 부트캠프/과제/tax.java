package 부트캠프.과제;

import java.util.*;

public class tax {
    //세금율과 인덱스 수를 맞추기 위해 0
    public static final long[] Income_Range = {0, 12000000, 46000000, 88000000, 150000000, 300000000, 500000000, 1000000000};
    public static final int[] Tax_Rate = {6, 15, 24, 35, 38, 40, 42, 45};
    public static final long[] deduction = {0, 1080000, 5220000, 14900000, 19400000, 25400000, 35400000, 65400000};
    
    public static long Income_Func(){
        Scanner s = new Scanner(System.in);
        long Y_Income;

        while(true){
            System.out.print("연소득을 입력해 주세요. : ");
            Y_Income = s.nextInt();

            if(Y_Income < 0){
                System.out.println("다시 입력해 주세요.");
                continue;
            }
            break;
        }
        return Y_Income;
    }
 
    public static void main(String[] args) {
        System.out.println("[과세금액 계산 프로그램]");

        long Y_Income = Income_Func();

        int Income_Range_Index = 0;
        long tax = 0;

        while(true){
            long tmp = 0;

           if(Income_Range_Index == 8){
               break;
           } else if(Y_Income < Income_Range[0]){
               tax = Y_Income * Tax_Rate[Income_Range_Index] / 100;
               System.out.printf("%,12d원 * %2d%% = %,12d원\n\n", Y_Income, Tax_Rate[Income_Range_Index], tax);
               break;
           } else if(Y_Income > Income_Range[Income_Range_Index+1]){
                tmp = (Income_Range[Income_Range_Index+1] - Income_Range[Income_Range_Index]) * Tax_Rate[Income_Range_Index] / 100;
                System.out.printf("%,12d원 * %2d%% = %,12d원\n", Income_Range[Income_Range_Index+1] - Income_Range[Income_Range_Index], Tax_Rate[Income_Range_Index], tmp);
                Income_Range_Index++;
                tax += tmp;
           } else if(Y_Income <= Income_Range[Income_Range_Index+1]){
                tmp = (Y_Income - Income_Range[Income_Range_Index]) * Tax_Rate[Income_Range_Index] / 100;
                System.out.printf("%,12d원 * %2d%% = %,12d원\n\n", (Y_Income-Income_Range[Income_Range_Index]), Tax_Rate[Income_Range_Index], tmp);
                tax += tmp;
                break;
           }
        }

        System.out.printf("[세금에 의한 세금] : %,16d\n", tax);
        System.out.printf("[누진공세에 의한 세금] : %,12d", (Y_Income*Tax_Rate[Income_Range_Index]/100)-deduction[Income_Range_Index]);
    }
}
