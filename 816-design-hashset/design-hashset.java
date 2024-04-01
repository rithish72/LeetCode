class MyHashSet {
    boolean[] arr  ;
    
    public MyHashSet() {
        arr  = new boolean[1000001];
    }
    
    public void add(int i) {
        arr[i] = true;
    }
    
    public void remove(int i) {
        arr[i] = false;
    }
    
    public boolean contains(int i) {
        return arr[i];
    }
}