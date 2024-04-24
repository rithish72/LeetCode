class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> res = new ArrayList();
        for(int hr = 0;hr<12;hr++){
            for(int min = 0; min < 60; min++){
                if(Integer.bitCount(hr) + Integer.bitCount(min) == turnedOn){
                    if(min < 10) res.add(String.format("%d:0%d",hr,min));
                    else res.add(String.format("%d:%d",hr,min));
                }
            }
        }
        return res;
    }
}