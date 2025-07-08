public class ClockClass {
    private int hour;
    private int minute;
    private int second;

    public ClockClass(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        if (hour > 0 || hour < 23) {
            this.hour = hour;
        }else {
            this.hour = 0;
        }
    }
    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if(minute > 0 || minute < 59) {
            this.minute = minute;
        }else {
            this.minute = 0;
        }
    }
    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        if(second > 0 || second < 59) {
            this.second = second;
        }else {
            this.second = 0;
        }
    }
    public int getSecond() {
        return second;
    }
    public String clockClass(int hour, int minute, int second) {
        String clock = hour + ":" + minute + ":" + second;
        return clock;
    }
}

