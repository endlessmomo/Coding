package 부트캠프.과제;

import java.util.*;


public class Calander {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String year = "";
        String month = "";

        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요. (yyyy) : ");
        year = sc.next();
        System.out.print("달력의 월을 입력해 주세요. (mm) : ");
        month = sc.next();

        Calendar start_Day = Calendar.getInstance();
        Calendar end_Day = Calendar.getInstance();

        sc.close();
    }    
}


