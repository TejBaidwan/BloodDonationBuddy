package com.example.blooddonationbuddy.HistoryRecyclerView;

public class DonationHistoryItem {
    private int year;
    private int connector;
    private int event;

    public DonationHistoryItem(int year, int connector, int event) {
        this.year = year;
        this.connector = connector;
        this.event = event;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getConnector() {
        return connector;
    }

    public void setConnector(int connector) {
        this.connector = connector;
    }

    public int getEvent() {
        return event;
    }

    public void setEvent(int event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "DonationHistoryItem{" +
                "year=" + year +
                ", event=" + event +
                '}';
    }
}
