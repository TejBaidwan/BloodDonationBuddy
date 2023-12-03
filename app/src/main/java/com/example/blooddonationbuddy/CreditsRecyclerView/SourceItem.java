package com.example.blooddonationbuddy.CreditsRecyclerView;

public class SourceItem {

    private int img;
    private int source;
    private int buttonText;
    private int buttonLocation;

    public SourceItem(int img, int source, int buttonText, int buttonLocation) {
        this.img = img;
        this.source = source;
        this.buttonText = buttonText;
        this.buttonLocation = buttonLocation;
    }

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

    public int getButtonText() {
        return buttonText;
    }

    public void setButtonText(int buttonText) {
        this.buttonText = buttonText;
    }

    public int getButtonLocation() {
        return buttonLocation;
    }

    public void setButtonLocation(int buttonLocation) {
        this.buttonLocation = buttonLocation;
    }
}
