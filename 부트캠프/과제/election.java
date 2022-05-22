package 부트캠프.과제;

import java.util.*;

public class election {
    public static final String[] candidate_name = {"이재명", "윤석열", "심상정", "안철수"};
    public static final int total_vote_count = 10000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int[] candidate_count = new int[candidate_name.length];

        for(int i=0; i<total_vote_count; i++){
            int voteNumber = rd.nextInt(4);
            candidate_count[voteNumber]++;
            election_relay(voteNumber, i+1,candidate_count);
        }

        int max_vote_candidate = 0;
        int max_vote_candidate_Index = 0;

        for(int i=0; i<candidate_name.length; i++){  
            if(max_vote_candidate < candidate_count[i])
                max_vote_candidate = candidate_count[i];
                max_vote_candidate_Index = i;
        }
        
        System.out.print("[투표결과] 당선인 : " + candidate_name[max_vote_candidate_Index]);
                
    }   

    public static void election_relay(int voteNumber, int currentVote, int[] candidate_count){
        System.out.printf("[투표 진행율] : %s%%, %d명 투표 => %s\n", String.format("%.02f", (float)currentVote/total_vote_count*100), currentVote, candidate_name[voteNumber]);
    
        for(int i=0; i < candidate_name.length; i++){
            System.out.printf("[기호 : %d] %s : %s%%, (투표수 : %d)\n", i+1, candidate_name[i], String.format("%.2f", (float)candidate_count[i]/total_vote_count*100), candidate_count[i]);
        }
    }
}


