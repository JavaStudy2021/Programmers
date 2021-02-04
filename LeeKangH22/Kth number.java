import java.util.ArrayList;

class Solution {
	 public int[] solution(int[] array, int[][] commands) {
		    ArrayList<Integer>answer_temp=new ArrayList<Integer>();
	        ArrayList<Integer>temp=new ArrayList<Integer>();
	        for(int i=0;i<commands.length;i++) {
	        	temp.clear();
	        	for(int j=commands[i][0]-1;j<commands[i][1];j++) {
	        		temp.add(array[j]);
	        	}
	        	temp.sort(null);
	        	answer_temp.add(temp.get(commands[i][2]-1));
	        }
	        int[] answer = new int[answer_temp.size()];
	        int j=0;
	        for(Integer i:answer_temp) {
	        	answer[j]=i;
	        	j++;
	        }
	        return answer;
	    }
}
