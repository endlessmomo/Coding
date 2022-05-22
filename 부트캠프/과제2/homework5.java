package 부트캠프.과제2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class homework5 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Calendar cal = Calendar.getInstance();

        int year, month;
        int day;

        while(true) {
            System.out.print("달력의 년도를 입력해 주세요. (yyyy) : ");
            year = Integer.parseInt(br.readLine());

            if(year < 1 ){
                System.out.println("다시 입력해 주세요. ");
                continue;
            }
            break;
        } 

        while(true){
            System.out.print("달력의 월을 입력해 주세요. (mm) : ");
            month = Integer.parseInt(br.readLine());

            if(month >= 1 || month <= 12){
                break;
            } else {
                System.out.println("다시 입력해 주세요.");
                continue;
            }
        }

        cal.set(year, month-1, 1);
        day = cal.get(Calendar.DAY_OF_WEEK);

        System.out.println(); 
		System.out.println("\n[ " + year + "년 " +  month + "월 ]");
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println(" ===========================");
		
        for(int i=1; i<day; i++){
            System.out.print("    ");
        }

        for(int i=1; i<=cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++){
            System.out.printf("%4d", i);
            day++;

            if(day%7 == 1)
                System.out.println("");
        }

    }
}

