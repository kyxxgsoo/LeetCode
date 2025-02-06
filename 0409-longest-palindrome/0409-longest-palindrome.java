class Solution {

    private int[] alphabetCount;
    private int answer;
    
    private void init(String s) {
        // 대소문자 구별을 위해 26 + 26
        alphabetCount = new int[52];
        // answer는 무조건 1부터 시작. 
        answer = 0;
    }

    private void solution(String s) {
        init(s);

        boolean oddFlag = false;

        for (int i = 0; i < s.length(); i++) {
            char alphabet = s.charAt(i);
            if (Character.isUpperCase(alphabet)) {
                // System.out.println(alphabet - 'A');
                alphabetCount[alphabet - 'A']++;
            } else if (Character.isLowerCase(alphabet)) {
                // System.out.println(alphabet - 'a' + 26);
                alphabetCount[alphabet - 'a' + 26]++;
            }
        }

        for (int i = 0; i < 52; i++) {
            System.out.println(alphabetCount[i]);
            if (alphabetCount[i] % 2 == 0) {
                answer += alphabetCount[i];
            } else {
                oddFlag = true;
                answer += alphabetCount[i] - 1 ;
            }
        }

        if (oddFlag) {
            answer++;
        }
    }

    public int longestPalindrome(String s) {
        solution(s);

        return answer;
    }
}