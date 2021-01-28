package Week_1;
import java.util.Arrays;

public class No_Goal_In {
	public String solution(String[] participant, String[] completion) {
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
        int i;
		for(i=0;i<participant.length;i++) {
			if(!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
        return participant[i];
	}
}
