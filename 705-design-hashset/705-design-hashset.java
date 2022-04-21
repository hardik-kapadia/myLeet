class MyHashSet {

    
    private List<Integer>[] list;

    private static int[] nums = new int[] { 7, 9, 2, 4, 6, 1, 5 };
    private static int[] powers = new int[] { 2, 0, 1, 2, 4, 3, 1 };
    private static int[] additive = new int[] { 2, 5, 8, 1, 3, 9, 6 };

    public MyHashSet() {
        this.list = new ArrayList[1000000];
    }

    public void add(int key) {

        int keyHash = hash(key);

        if (list[keyHash] == null)
            list[keyHash] = new ArrayList<>();

        List<Integer> temp = list[keyHash];

        if(!temp.contains(key))
            temp.add(key);

        System.out.println("It's now: " + list[keyHash]);

    }

    public void remove(int key) {

        int keyHash = hash(key);

        List<Integer> temp = list[keyHash];

        if (temp != null)
            if (temp.contains(key))
                temp.remove(Integer.valueOf(key));

    }

    public boolean contains(int key) {

        int keyHash = hash(key);

        List<Integer> temp = list[keyHash];

        if (temp != null)
            return temp.contains(key);

        return false;
    }

    private static int hash(int key) {

        int hash = 0;

        for (int i = 0; key > 0; key /= 10, i++)
            hash += Math.pow(10, powers[i]) * nums[i] * ((key % 10) + additive[i]);

        return hash;

    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */