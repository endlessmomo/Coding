package Level2;

public class next_big_value {
        public static int solution(int n) {
            // 일단 이진수로 n을 변환해주는 코드
            String binary_N = Integer.toBinaryString(n);
            int binary_1_count = b_1_counting(binary_N);
            int answer = 0;
            
            for(int i = n+1; ; i++){
                String binary_Sub = Integer.toBinaryString(i);
                if(binary_1_count == b_1_counting(binary_Sub)){
                    answer = i;
                    break;
                }
            }
            return answer;
        }
        
        public static int b_1_counting(String s){
            char[] count_String = s.toCharArray();
            int count = 0;
            
            for(int i = 0; i<count_String.length; i++){
                if(count_String[i] == 1){
                    count++;        
                }
            }
            return count;
        }
    
    public static void main(String[] args) {
         int n = 78;

         solution(n);
         
    }
}
