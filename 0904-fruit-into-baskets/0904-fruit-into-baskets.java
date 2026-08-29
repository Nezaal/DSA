class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;

        HashMap<Integer , Integer> map = new HashMap<>();


        int maxFruits = 0;

        int i =0;

        for(int j = 0; j < n; j++){
            int fruit = fruits[j];
            map.put(fruit, map.getOrDefault(fruit , 0)+1);

            if(map.size() > 2 ){
                int leftFruit = fruits[i];
                map.put(leftFruit , map.get(leftFruit)-1);

                if(map.get(leftFruit) == 0){
                    map.remove(leftFruit);
                }
                i++;
            }

            maxFruits = Math.max(maxFruits, j - i +1);
        }
        return maxFruits;

    }
}