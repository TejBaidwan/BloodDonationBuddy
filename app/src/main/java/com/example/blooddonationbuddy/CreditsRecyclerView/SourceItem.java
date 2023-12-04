package com.example.blooddonationbuddy.CreditsRecyclerView;

/**
 * @author Tej Baidwan
 * This class represents a SourceItem used in the CreditsRecyclerView
 */
public class SourceItem {

    //Properties
    private int img;
    private int source;

    //Constructor
    public SourceItem(int img, int source) {
        this.img = img;
        this.source = source;
    }

    //Getters and Setters
    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }
}
