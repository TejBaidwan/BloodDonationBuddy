package com.example.blooddonationbuddy.CreditsRecyclerView;

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

public class CustomRecyclerViewAdapterSource extends RecyclerView.Adapter {
    private ArrayList<SourceItem> sourceItems;

    public CustomRecyclerViewAdapterSource(ArrayList<SourceItem> sourceItems) {
        this.sourceItems = sourceItems;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.source_item_view, null);
        CustomViewHolder viewHolder = new CustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        final SourceItem mySourceItem = sourceItems.get(position);
        final CustomViewHolder viewHolder1 = (CustomViewHolder) holder;
        viewHolder1.sourceImg.setImageResource(mySourceItem.getImg());
        viewHolder1.sourceName.setText(mySourceItem.getSource());
        viewHolder1.sourceButton.setText(mySourceItem.getButtonText());
        viewHolder1.sourceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return (sourceItems != null ? sourceItems.size() : 0);
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {
        protected ImageView sourceImg;
        protected TextView sourceName;
        protected Button sourceButton;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.sourceImg = itemView.findViewById(R.id.sourceImg);
            this.sourceName = itemView.findViewById(R.id.sourceName);
            this.sourceButton = itemView.findViewById(R.id.sourceButton);
        }
    }
}
