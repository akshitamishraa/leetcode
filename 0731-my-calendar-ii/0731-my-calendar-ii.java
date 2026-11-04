class MyCalendarTwo {

    List<int[]> bookings;
    List<int[]> overlapBookings;

    public MyCalendarTwo() {
        bookings = new ArrayList<>();
        overlapBookings = new ArrayList<>();
    }

    public boolean overlap(int[] i1, int s2, int e2) {
        int s1 = i1[0];
        int e1 = i1[1];

        return e1 > s2 && e2 > s1;
    }

    public boolean book(int startTime, int endTime) {

        for (int i = 0; i < overlapBookings.size(); i++) {
            if (overlap(overlapBookings.get(i), startTime, endTime)) {
                return false;
            }
        }

        for (int i = 0; i < bookings.size(); i++) {
            if (overlap(bookings.get(i), startTime, endTime)) {

                overlapBookings.add(new int[] {
                        Math.max(bookings.get(i)[0], startTime),
                        Math.min(bookings.get(i)[1], endTime)
                });
            }
        }

        bookings.add(new int[] { startTime, endTime });

        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(startTime,endTime);
 */