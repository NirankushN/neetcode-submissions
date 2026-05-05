class MyHashMap {
    private int bucket_size = 1000000;
    private List<Integer>[] t; 

    public int getHash(int key){
        return key%bucket_size;
    }

    public MyHashMap() {
        t=new LinkedList[bucket_size];
    }
    
    public void put(int key, int value) {
        int index=getHash(key);
        t[index] = new LinkedList<>();
        t[index].add(value);
    }
    
    public int get(int key) {
        int index=getHash(key);
        if(t[index]==null){
            return -1;
        }
        System.out.println(t[index].toString());
        return t[index].get(0);
    }
    
    public void remove(int key) {
        int index=getHash(key);
        if(t[index]==null){
            return;
        }
        t[index]=null;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */