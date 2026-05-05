class MyHashSet {

    private int bucket_size = 1000000;
    private List<Integer>[] t; 

    public int getHash(int key){
        return key%bucket_size;
    }

    public MyHashSet() {
        t=new LinkedList[bucket_size];
    }
    
    public void add(int key) {
        int index= getHash(key);
        if(t[index]==null){
            t[index] = new LinkedList<>();
        }
        if(!t[index].contains(key)){
            t[index].add(key);
        }
    }
    
    public void remove(int key) {
        int index= getHash(key);
        if(t[index]!=null){
            t[index].remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        int index= getHash(key);
        return t[index]!=null && t[index].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */