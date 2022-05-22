package 부트캠프.과제2;

import java.util.*;

public class homework2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요. (금액) : ");
        int pay_money = s.nextInt();
        System.out.printf("결제 금액은 %d원이고, 캐시백은 %d원 입니다. ", pay_money, cash_back(pay_money));

        s.close();
    }

    public static int cash_back(int pay_money){
        int cashback = ((int)(pay_money * 0.1) - (int)((pay_money*0.1) % 100));

        return cashback < 300 ? cashback : 300;
    }
}
