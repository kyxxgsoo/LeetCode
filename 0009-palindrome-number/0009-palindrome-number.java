class Solution {
    public boolean isPalindrome(int x) {
        char[] cArr = String.valueOf(x).toCharArray();

        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] != cArr[cArr.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}