class SeatManager {
    private PriorityQueue<Integer> reserve;

    public SeatManager(int n) {
        this.reserve = new PriorityQueue();
        for (int i = 1; i <= n; i++)
            this.reserve.offer(i);
    }

    public int reserve() {
        return this.reserve.poll();
    }

    public void unreserve(int seatNumber) {
        this.reserve.offer(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */