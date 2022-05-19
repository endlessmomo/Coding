package 부트캠프.과제;

import java.util.*;

public class ID_number {
    public static String making_ID_Number(String year, String month, String day, char gender){
        String preNumber = new String();
        preNumber = year.substring(2) + month + day;

        StringBuffer postNumber = new StringBuffer();

        int Intyear = Integer.valueOf(year);

        if(Intyear < 2000){
            if(gender == 'm' || gender == 'M'){
                postNumber.append("1");
            } else
                postNumber.append("2");
        } else {
            if(gender == 'm' || gender == 'M'){
                postNumber.append("3");
            } else
                postNumber.append("4");
        }

        Random rd = new Random();

        for(int i=0; i<6; i++){
            postNumber.append(rd.nextInt(10));
        }

        return preNumber + "-" + postNumber.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String year = "";
        String month = "";
        String day = "";
        char gender = ' ';
        
        System.out.println("[주민등록번호 생성기");
        System.out.print("출생년도를 입력해 주세요. (yyyy) : ");
        year = sc.next();
        System.out.print("출생월을 입력해 주세요. (mm) : ");
        month = sc.next();
        System.out.print("출생일을 입력해 주세요. (dd) : ");
        day = sc.next();
        System.out.print("성별을 입력해 주세요. (m/f) : ");
        gender = sc.next().charAt(0);

        System.out.println(making_ID_Number(year, month, day, gender));

    }
}
