class Solution {
    public int totalFruit(int[] fruits) {
        int left =0; int maxfruit=0; int right=0;
        Map<Integer,Integer> frequencyFruit = new HashMap<>();
        for(right=0; right<fruits.length; right++){
            int fre = frequencyFruit.getOrDefault(fruits[right],0);
            frequencyFruit.put(fruits[right],fre+1);

            while(frequencyFruit.size()>2){
                int frecount = frequencyFruit.get(fruits[left]);
                if(frecount==1){
                    frequencyFruit.remove(fruits[left]);
                }else{
                    frequencyFruit.put(fruits[left],frecount-1);
                }
                left++;
            }
            maxfruit=Math.max(maxfruit,right-left+1);
        }
        return maxfruit;
    }
}
