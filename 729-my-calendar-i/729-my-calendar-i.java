class MyCalendar {

    Map<Integer, Integer> booked;
    List<Integer> keySet;

    public MyCalendar() {

        this.booked = new HashMap<>();
        this.keySet = new ArrayList<>();

    }

    public boolean book(int start, int end) {

        int j = this.keySet.size();

        for (int i = 0; i < this.keySet.size(); i++) {

            int k = this.keySet.get(i);

            if (k > start)
                j = i;

            if (k >= end)
                break;

            if (this.booked.get(k) > start)
                return false;

        }
        
        this.keySet.add(j, start);
        this.booked.put(start, end);

        return true;

    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */