class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = heights.clone();
        Arrays.sort(arr);
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(heights[i] != arr[i]){
                count++;
            }
        }
        return count;
    }
}