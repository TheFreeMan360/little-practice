class UndergroundSystem {
    private class Info{
        public String station;
        public int checkInTime;

        Info(String s, int t){
            this.station = s;
            this.checkInTime = t;
        }
    }

    private Map<String, double[]> timeRecord;
    private Map<Integer, Info> checkInfo;

    public UndergroundSystem() {
        this.timeRecord = new HashMap<>();
        this.checkInfo = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        this.checkInfo.put(id, new Info(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Info checkInInfo = this.checkInfo.remove(id);
        String key = checkInInfo.station + "->" + stationName;
        this.timeRecord.putIfAbsent(key, new double[2]);
        double[] tmp = this.timeRecord.get(key);
        tmp[0] += t - checkInInfo.checkInTime;
        tmp[1] += 1;
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String key = startStation + "->" + endStation;
        double[] tmp = this.timeRecord.get(key);
        return tmp[0] / tmp[1];
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */