class Solution {
    public String solution(int n) {
        String answer = "";
        String soo="��";
        String bak="��";
        
        for(int i=0;i<n;i++) {
        	if(i%2==0)
        		answer+=soo;
        	else
        		answer+=bak;
        }
        return answer;
    }
}