package com.example.blooddonationbuddy.HistoryRecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.blooddonationbuddy.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * @author - Tej Baidwan
 * This class represents the CustomAdapter which will handle the population of items into the History RecyclerView
 */
public class CustomRecyclerViewAdapter extends RecyclerView.Adapter {

    //Property
    private ArrayList<DonationHistoryItem> donationHistoryItems;

    //Constructor
    public CustomRecyclerViewAdapter(ArrayList<DonationHistoryItem> donationHistoryItems) {
        this.donationHistoryItems = donationHistoryItems;
    }

    /**
     * This method creates a viewholder for the view layout file
     * @param parent - The view
     * @param viewType - View type
     * @return
     */
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.donation_history_item_view, null);
        CustomViewHolder viewHolder = new CustomViewHolder(view);
        return viewHolder;
    }

    /**
     * This method gets the source item at a give position and populates it
     * @param holder - Viewholder
     * @param position - Position in RecyclerView
     */
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        final DonationHistoryItem myDonationHistoryItem = donationHistoryItems.get(position);
        final CustomViewHolder viewHolder1 = (CustomViewHolder) holder;
        viewHolder1.historyItemYear.setText(myDonationHistoryItem.getYear());
        viewHolder1.historyItemImg.setImageResource(myDonationHistoryItem.getConnector());
        viewHolder1.historyItemName.setText(myDonationHistoryItem.getEvent());
    }

    /**
     * This method gets the item count of the arraylist of donationHistory items
     * @return int
     */
    @Override
    public int getItemCount() {
        return (donationHistoryItems != null ? donationHistoryItems.size() : 0);
    }

    /**
     * This class represents the ViewHolder class which contains the nodes found in the RecyclerView custom view
     */
    class CustomViewHolder extends RecyclerView.ViewHolder {
        protected TextView historyItemYear;
        protected ImageView historyItemImg;
        protected TextView historyItemName;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.historyItemYear = itemView.findViewById(R.id.year);
            this.historyItemImg = itemView.findViewById(R.id.arrow);
            this.historyItemName = itemView.findViewById(R.id.event);
        }
    }
}
