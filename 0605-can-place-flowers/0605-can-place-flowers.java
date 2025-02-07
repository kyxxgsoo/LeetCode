class Solution {

    private boolean answer;
    private int[] tempFlowerbed;

    private void init(int[] flowerbed, int n) {
        answer = true;
        tempFlowerbed = new int[flowerbed.length + 2];

        // 코드의 획일화(셋 다 비었으면 가운데를 채우는 방식)를 위해 앞 뒤로 0이 채워진 배열에 flowerbed를 복사하여 넣는다.
        for (int i = 0; i < flowerbed.length; i++) {
            tempFlowerbed[i + 1] = flowerbed[i];
        }
    }

    private void solution(int[] flowerbed, int n) {
        init(flowerbed, n);
        
        // 현재 선택된 flowerbed를 기준으로 앞과 뒤가 비었는지 확인하고, 모두 비어있다면 가운데에 꽃을 심는다.
        for (int i = 1; i <= flowerbed.length; i++) {
            boolean isPrevFlower = tempFlowerbed[i - 1] == 1 ? true : false;
            boolean isCurFlower = tempFlowerbed[i] == 1 ? true : false;
            boolean isNextFlower = tempFlowerbed[i + 1] == 1 ? true : false;

            if (!(isPrevFlower || isCurFlower || isNextFlower)) {
                tempFlowerbed[i] = 1;
                n--;
            }
        }

        if (n > 0) {
            answer = false;
        }
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        solution(flowerbed, n);
        return answer;
    }
}