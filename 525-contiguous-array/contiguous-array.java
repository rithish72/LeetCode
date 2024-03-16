class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0, l = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i] == 0 ? -1 : 1;
            if(sum == 0){
                l = i + 1;
            }
            else if(map.containsKey(sum)){
                l = Math.max(l, i-map.get(sum));
            }
            else{
                map.put(sum, i);
            }
        }
        return l;
    }
}