package 부트캠프.과제2;

import java.util.*;

public class homework4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char gender;

        System.out.println("[주민등록번호 계산]");
        System.out.print("출생년도를 입력해 주세요. (YYYY) : ");
        String b_year = s.next();
        System.out.print("출생월을 입력해 주세요. (mm) : ");
        String b_month = s.next();
        System.out.print("출생일을 입력해 주세요. (dd) : ");
        String b_day = s.next();
        while(true){
            System.out.print("성별을 입력해 주세요, (m/f) : ");
            gender = s.next().charAt(0);

            if( gender == 'm' || gender =='M' || gender == 'f' || gender == 'F'){
                break;
            } else {
                System.out.println("다시 입력해주세요.");
                continue;
            }
        }

        System.out.print(making_Identification_Number(b_year, b_month, b_day, gender));

        s.close();
    }
    
    public static String making_Identification_Number(String b_year, String b_month, String b_day, char gender){
        String prev_Num = new String();
        prev_Num = b_year.substring(2) + (String)b_month + (String)b_day;

        StringBuffer post_Num = new StringBuffer();
        
        int Int_b_year = Integer.valueOf(b_year);

        if(gender == 'm' || gender == 'M')
             post_Num= Int_b_year < 2000 ? post_Num.append(1) : post_Num.append(3);
        else
             post_Num= Int_b_year < 2000 ? post_Num.append(2) : post_Num.append(4);

        for(int i=0; i<6; i++){
            post_Num.append(new Random().nextInt(9));
        }

        return prev_Num + "-" +post_Num.toString();
    }
}
