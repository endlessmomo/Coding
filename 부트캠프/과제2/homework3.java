package 부트캠프.과제2;

import java.util.*;

public class homework3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요. (숫자) : ");
        int age = s.nextInt();
        System.out.print("입장시간을 입력해 주세요. (숫자) : ");
        int time = s.nextInt();
        System.out.print("국가유공자 여부를 입력해 주세요(y/n) : ");
        String National_Benefit = s.next();
        System.out.print("복지카드 여부를 입력해 주세요.(y/n) : ");
        String Social_Benefit = s.next();
        
        s.close();
        
        System.out.print("입장료 : " + pee(age, time, National_Benefit, Social_Benefit) + "원 입니다.");
    }    

    public static int pee(int age, int time, String National_Benefit, String Social_BeneFit){
        if(age < 3 )
            return 0;
        else if(age < 13)
            return 4000;
        else if(time > 17)
            return 4000;
        else if("y".equals(National_Benefit) || "Y".equals(National_Benefit)|| "y".equals(Social_BeneFit)|| "Y".equals(Social_BeneFit))
            return 8000;
        else
            return 10000;
    }
}
