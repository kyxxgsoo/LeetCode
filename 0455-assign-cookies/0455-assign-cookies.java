class Solution {

    private int answer;

    private void init() {
        answer = 0;
    }

    private void solution(int[] g, int[] s) {
        init();

        Arrays.sort(g);
        Arrays.sort(s);

        int sIndex = 0;
        for (int i = 0; i < g.length; i++) {
            if (sIndex < s.length) {
                // 맞으면 다음아이
                if (s[sIndex] >= g[i]) {
                    answer++;
                } else {
                    i--;
                }
                sIndex++;
            }
        }
    }

    public int findContentChildren(int[] g, int[] s) {
        solution(g, s);

        return answer;
    }
}