package com.example.blooddonationbuddy.HistoryRecyclerView;

public class DonationHistoryItem {
    private int year;
    private int event;

    public DonationHistoryItem(int year, int event) {
        this.year = year;
        this.event = event;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
