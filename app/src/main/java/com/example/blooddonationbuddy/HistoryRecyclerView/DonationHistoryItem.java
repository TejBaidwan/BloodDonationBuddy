package com.example.blooddonationbuddy.HistoryRecyclerView;

/**
 * @author Tej Baidwan
 * This class represents a DonationHistoryItem which are the views which are scrolled thorugh in the History RecyclerView
 */
public class DonationHistoryItem {

    //Properties
    private int year;
    private int connector;
    private int event;

    //Constructor
    public DonationHistoryItem(int year, int connector, int event) {
        this.year = year;
        this.connector = connector;
        this.event = event;
    }

    //Getters and Setters
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
