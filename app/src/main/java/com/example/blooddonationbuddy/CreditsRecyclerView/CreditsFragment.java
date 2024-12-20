package com.example.blooddonationbuddy.CreditsRecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.blooddonationbuddy.HistoryRecyclerView.CustomRecyclerViewAdapter;
import com.example.blooddonationbuddy.HistoryRecyclerView.DonationHistoryItem;
import com.example.blooddonationbuddy.R;

import java.util.ArrayList;

/**
 * @author Tej Baidwan
 * A simple {@link Fragment} subclass.
 * Use the {@link CreditsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CreditsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CreditsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CreditsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CreditsFragment newInstance(String param1, String param2) {
        CreditsFragment fragment = new CreditsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_credits, container, false);

        //Create the recycler view to hold source objects and find nodes on screen
        ArrayList<SourceItem> sourceItems = new ArrayList<>();
        RecyclerView recyclerView = view.findViewById(R.id.sources);
        Button bloodTypesSource = view.findViewById(R.id.bloodTypeSource);
        Button donationProcessSource = view.findViewById(R.id.donationProcessSource);
        Button donationHistorySource = view.findViewById(R.id.donationHistorySource);

        //Take app to the website defined below for the source of said content
        bloodTypesSource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://my.clevelandclinic.org/health/treatments/21213-blood-types"));
                startActivity(i);
            }
        });

        //Take app to the website defined below for the source of said content
        donationProcessSource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.blood.ca/en/blood/donating-blood/donation-process"));
                startActivity(i);
            }
        });

        //Take app to the website defined below for the source of said content
        donationHistorySource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.aabb.org/news-resources/resources/transfusion-medicine" +
                                "/highlights-of-transfusion-medicine-history"));
                startActivity(i);
            }
        });

        //Adding the source items to the arraylist
        sourceItems.add(new SourceItem(R.drawable.welcomeimage, R.string.welcomeImgSource));
        sourceItems.add(new SourceItem(R.drawable.bloodtypea, R.string.bloodTypeSourceOne));
        sourceItems.add(new SourceItem(R.drawable.bloodtypeb, R.string.bloodTypeSourceTwo));
        sourceItems.add(new SourceItem(R.drawable.bloodtypeab, R.string.bloodTypeSourceThree));
        sourceItems.add(new SourceItem(R.drawable.bloodtypeo, R.string.bloodTypeSourceFour));
        sourceItems.add(new SourceItem(R.drawable.arrivestep, R.string.donationProcessSourceOne));
        sourceItems.add(new SourceItem(R.drawable.checkupstep, R.string.donationProcessSourceTwo));
        sourceItems.add(new SourceItem(R.drawable.donationstep, R.string.donationProcessSourceThree));
        sourceItems.add(new SourceItem(R.drawable.refreshstep, R.string.donationProcessSourceFour));
        sourceItems.add(new SourceItem(R.drawable.satisfactionstep, R.string.donationProcessSourceFive));
        sourceItems.add(new SourceItem(R.drawable.right_arrow, R.string.arrowImgSource));
        sourceItems.add(new SourceItem(R.drawable.appicon, R.string.launcherIconSource));

        //Setting the layout manager and adpater for the arraylist to the custom one made by myself
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new CustomRecyclerViewAdapterSource(sourceItems));

        return view;

    }
}