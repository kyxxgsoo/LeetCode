class Solution {

    private int answer;

    private void init() {
        answer = 0;
    }

    private void solution(int[] g, int[] s) {
        init();

        Arrays.sort(g);
        Arrays.sort(s);

        int gIndex = 0;
        int sIndex = 0;

        while (gIndex < g.length) {
            if (sIndex < s.length) {
                // 아이가 원하는 크기보다 쿠키의 크기가 클 때
                if (s[sIndex] >= g[gIndex]) {
                    // 다음 쿠키, 다음 아이, answer++
                    gIndex++;
                    sIndex++;
                    answer++;
                } else {
                    sIndex++;
                }
            } else {
                break;
            }
        }
    }

    public int findContentChildren(int[] g, int[] s) {
        solution(g, s);

        return answer;
    }
}