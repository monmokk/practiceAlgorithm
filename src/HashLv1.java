import java.util.Arrays;

public class HashLv1 {

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        String tmp = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;

        while(i < completion.length) {
            if(!completion[i].equals(participant[i])) {
                tmp = participant[i];
                break;
            } else {
                i++;
            }
        }

        if(!tmp.equals("")){
            answer = tmp;
        } else {
            answer = participant[participant.length-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        HashLv1 hashLv1 = new HashLv1();
        String[] participant = {"강명지", "정지원"};
        String[] completion = {"정지원"};
        System.out.println(hashLv1.solution(participant, completion));
    }
}
