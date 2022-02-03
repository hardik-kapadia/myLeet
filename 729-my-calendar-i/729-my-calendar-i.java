class MyCalendar {

    List<int[]> booked;

    public MyCalendar() {

        this.booked = new ArrayList<>();

    }

    public boolean book(int start, int end) {

        for (int[] is : booked)
            if (is[0] < end && is[1] > start)
                return false;

        booked.add(new int[] { start, end });

        // booked.sort((p, q) -> p[0] - q[0] != 0 ? p[0] - q[0] : p[1] - q[1]);

        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */