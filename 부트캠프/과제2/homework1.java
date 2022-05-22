package 부트캠프.과제2;

public class homework1 {
    public static void main(String[] args) {
        System.out.println("[구구단 출력]");
            for(int i=1; i<=9; i++){
                for(int j=1; j<=9; j++){
                    System.out.printf("%02d x %02d = %02d  ", i, j, i*j);
                }
                System.out.println("");
            }
         
    }
}
