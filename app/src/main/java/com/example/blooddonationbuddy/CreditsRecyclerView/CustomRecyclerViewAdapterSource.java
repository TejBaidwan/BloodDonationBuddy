package com.example.blooddonationbuddy.CreditsRecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.blooddonationbuddy.HistoryRecyclerView.DonationHistoryItem;
import com.example.blooddonationbuddy.R;

import java.util.ArrayList;

/**
 * @author - Tej Baidwan
 * This class represents the CustomAdapter which will handle the population of items into the Credits RecyclerView
 */

public class CustomRecyclerViewAdapterSource extends RecyclerView.Adapter {

    //Properties
    private ArrayList<SourceItem> sourceItems;

    //Constructor
    public CustomRecyclerViewAdapterSource(ArrayList<SourceItem> sourceItems) {
        this.sourceItems = sourceItems;
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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.source_item_view, null);
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
        final SourceItem mySourceItem = sourceItems.get(position);
        final CustomViewHolder viewHolder1 = (CustomViewHolder) holder;
        viewHolder1.sourceImg.setImageResource(mySourceItem.getImg());
        viewHolder1.sourceName.setText(mySourceItem.getSource());
    }

    /**
     * This method gets the item count of the arraylist of source items
     * @return int
     */
    @Override
    public int getItemCount() {
        return (sourceItems != null ? sourceItems.size() : 0);
    }

    /**
     * This class represents the ViewHolder class which contains the nodes found in the RecyclerView custom view
     */
    class CustomViewHolder extends RecyclerView.ViewHolder {
        protected ImageView sourceImg;
        protected TextView sourceName;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.sourceImg = itemView.findViewById(R.id.sourceImg);
            this.sourceName = itemView.findViewById(R.id.sourceName);
        }
    }
}
