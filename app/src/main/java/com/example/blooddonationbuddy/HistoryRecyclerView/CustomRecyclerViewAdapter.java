package com.example.blooddonationbuddy.HistoryRecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.blooddonationbuddy.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class CustomRecyclerViewAdapter extends RecyclerView.Adapter {
    private ArrayList<DonationHistoryItem> donationHistoryItems;

    public CustomRecyclerViewAdapter(ArrayList<DonationHistoryItem> donationHistoryItems) {
        this.donationHistoryItems = donationHistoryItems;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.donation_history_item_view, null);
        CustomViewHolder viewHolder = new CustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        final DonationHistoryItem myDonationHistoryItem = donationHistoryItems.get(position);
        final CustomViewHolder viewHolder1 = (CustomViewHolder) holder;
        viewHolder1.historyItemYear.setText(myDonationHistoryItem.getYear());
        viewHolder1.historyItemImg.setImageResource(myDonationHistoryItem.getConnector());
        viewHolder1.historyItemName.setText(myDonationHistoryItem.getEvent());
    }

    @Override
    public int getItemCount() {
        return (donationHistoryItems != null ? donationHistoryItems.size() : 0);
    }

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
