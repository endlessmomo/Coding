package 부트캠프.과제;

public class gugudan {
    public static void main(String[] args) {
        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                System.out.print(String.format(("%02d x %02d = %02d"), i, j, i*j));
                System.out.print("     ");
            }
            System.out.println("");
        }
        
    }
    
}
