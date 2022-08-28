package model;

import java.util.HashMap;

public class TimeWaitingModel extends HashMap<Integer, TimeWaitingModel> {

    private int time;

    public TimeWaitingModel(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return time + " " + "\n";
    }
}