package 부트캠프.과제;

import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class Cash_Back {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 0;
        int cashback = 0;

        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요. (금액) : ");
        money = sc.nextInt();
        System.out.println(String.format("결제 금앤은 %d원이고, 캐시백은 %d원 입니다.", money, cashback_Cal(money)));

    }
    
    public static int cashback_Cal(int money){
        int cashback = 0;

        cashback = (int)((money * 0.1)/100);

        if(cashback >= 3){
            return 300;
        } else if( cashback == 2){
            return 200;
        } else if ( cashback == 1){
            return 100;
        } else
            return 0;
    }
}
