import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer>Array=new HashSet<Integer>();
        for(int i=0;i<numbers.length;i++) {
        	for(int j=i;j<numbers.length;j++) {
        		if(i!=j)
        			Array.add(numbers[i]+numbers[j]);
        	}
        }
        int[] answer = new int[Array.size()];
        int j=0;
        for(Integer i:Array) {
        	answer[j]=i;
        	j++;
        }
        Arrays.sort(answer);
        return answer;
    }
}