package 부트캠프.과제;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class park {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        int entrance_time = 0;
        char national_merit = ' ';
        char benefit_card = ' ';

        System.out.print("나이를 입력해 주세요. (숫자) : ");
        age = sc.nextInt();
        System.out.print("입장시간을 입력해 주세요. (숫자입력) : ");
        entrance_time = sc.nextInt();
        System.out.print("국가유공자 여부를 입력해 주세요.(y/n) : ");
        national_merit = sc.next().charAt(0);
        System.out.print("복지카드 여부를 입력해 주세요.(y/n) : ");
        benefit_card = sc.next().charAt(0);

        System.out.print(String.format("입장료 : %d원", entrance_fee(age, entrance_time, national_merit, benefit_card)));
    }

    public static int entrance_fee(int age, int entrance_time, char national_merit, char benefit_card){
        
        if(age < 3){
            return 0;
        } else if ( (age >= 3 && age<13) || entrance_time >= 17){
            return 4000;
        } else if ( national_merit == 'y' || national_merit == 'Y' || benefit_card == 'y' || benefit_card == 'Y'){
            return 8000;
        } else
            return 10000;
    }
    
}
