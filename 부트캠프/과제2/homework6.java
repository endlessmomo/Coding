package 부트캠프.과제2;

import java.util.*;

public class homework6 {
    public static final String[] Candidate_Name = {"이재명", "윤석열", "심상정", "안철수"};
    public static final int total_vote = 10000;
    public static void main(String[] args) {
        int vote_count = 0;
        int[] candidate_vote_count = new int[Candidate_Name.length];

        for(int item : candidate_vote_count){
            item = 0;
        }

        // total_vote 개의 랜덤 투표를 실행 및 화면 출력
        for(int i=0; i<total_vote; i++){
            int vote_Num = new Random().nextInt(4);
            candidate_vote_count[vote_Num]++;
            vote_count++;
            election_relay(vote_count, vote_Num, candidate_vote_count);
        }

        int max_vote = 0;
        int max_vote_index=0;

        // 당선인 선출
        for(int i=0; i<candidate_vote_count.length; i++){
            if(max_vote < candidate_vote_count[i]){
                max_vote = candidate_vote_count[i];
                max_vote_index = i;
            }
        }

        System.out.printf("[투표결과] 당선인 : %s", Candidate_Name[max_vote_index]);
    }

    public static void election_relay(int vote_count, int vote_Num, int[] candidate_vote_count){
        System.out.printf("[투표진행률] : %s%%, %d명 투표 => %s \n", String.format("%.02f", (float)vote_count/total_vote*100), vote_count, Candidate_Name[vote_Num]);

        for(int i=0; i<Candidate_Name.length; i++){
            System.out.printf("[기호 %d] %s : %s%%, (투표수 : %d)\n", i+1, Candidate_Name[i], String.format("%.2f", (float)candidate_vote_count[i]/total_vote*100), candidate_vote_count[i]);
        }
    }
}
