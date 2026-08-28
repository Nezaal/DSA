class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        HashMap<Integer, Integer> map = new HashMap<>();


        int maxFruits = 0;
        int i = 0;
        int j = 0;
        while(j < n){
            int fruit = fruits[j];

            map.put(fruit , map.getOrDefault(fruit,  0)+1);

            
            while(map.size() > 2){

                int leftInt = fruits[i];
                
                map.put(leftInt, map.get(leftInt)-1);

                if(map.get(leftInt) == 0){
                    map.remove(leftInt);
                }
                i++;
            }
            
            maxFruits = Math.max(maxFruits, j-i+1);
            
            j++;
        }
        return maxFruits;
    }
}

// 0 1 2 3 4
// 1 2 3 2 2      
//   i                 
//         j                  

                   
// distinct_no = 2;
// maxFruits   = 1;

//  


