class Solution {

    private int answer;

    private void init() {
        answer = 0;
    }

    private void solution(int[] nums) {
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i += 2) {
            answer += nums[i];
        }

    }

    public int arrayPairSum(int[] nums) {
        solution(nums);
        return answer;
    }
}