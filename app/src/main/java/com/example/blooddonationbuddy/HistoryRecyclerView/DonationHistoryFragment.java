package com.example.blooddonationbuddy.HistoryRecyclerView;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.blooddonationbuddy.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DonationHistoryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DonationHistoryFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DonationHistoryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DonationHistoryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DonationHistoryFragment newInstance(String param1, String param2) {
        DonationHistoryFragment fragment = new DonationHistoryFragment();
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
        View view = inflater.inflate(R.layout.fragment_donation_history, container, false);

        ArrayList<DonationHistoryItem> donationHistoryItems = new ArrayList<>();
        RecyclerView recyclerView = view.findViewById(R.id.donationHistory);

        donationHistoryItems.add(new DonationHistoryItem(R.string.yearOne, R.drawable.right_arrow, R.string.eventOne));
        donationHistoryItems.add(new DonationHistoryItem(R.string.yearTwo, R.drawable.right_arrow, R.string.eventTwo));
        donationHistoryItems.add(new DonationHistoryItem(R.string.yearThree, R.drawable.right_arrow, R.string.eventThree));
        donationHistoryItems.add(new DonationHistoryItem(R.string.yearFour, R.drawable.right_arrow, R.string.eventFour));
        donationHistoryItems.add(new DonationHistoryItem(R.string.yearFive, R.drawable.right_arrow, R.string.eventFive));
        donationHistoryItems.add(new DonationHistoryItem(R.string.yearSix, R.drawable.right_arrow, R.string.eventSix));
        donationHistoryItems.add(new DonationHistoryItem(R.string.yearSeven, R.drawable.right_arrow, R.string.eventSeven));
        donationHistoryItems.add(new DonationHistoryItem(R.string.yearEight, R.drawable.right_arrow, R.string.eventEight));
        donationHistoryItems.add(new DonationHistoryItem(R.string.yearNine, R.drawable.right_arrow, R.string.eventNine));
        donationHistoryItems.add(new DonationHistoryItem(R.string.yearTen, R.drawable.right_arrow, R.string.eventTen));
        donationHistoryItems.add(new DonationHistoryItem(R.string.yearEleven, R.drawable.right_arrow, R.string.eventEleven));
        donationHistoryItems.add(new DonationHistoryItem(R.string.yearTwelve, R.drawable.right_arrow, R.string.eventTwelve));
        donationHistoryItems.add(new DonationHistoryItem(R.string.yearThirteen, R.drawable.right_arrow, R.string.eventThirteen));
        donationHistoryItems.add(new DonationHistoryItem(R.string.yearFourteen, R.drawable.right_arrow, R.string.eventFourteen));
        donationHistoryItems.add(new DonationHistoryItem(R.string.yearFifteen, R.drawable.right_arrow, R.string.eventFifteen));
        donationHistoryItems.add(new DonationHistoryItem(R.string.yearSixteen, R.drawable.right_arrow, R.string.eventSixteen));
        donationHistoryItems.add(new DonationHistoryItem(R.string.yearSeventeen, R.drawable.right_arrow, R.string.eventSeventeen));
        donationHistoryItems.add(new DonationHistoryItem(R.string.yearEighteen, R.drawable.right_arrow, R.string.eventEighteen));
        donationHistoryItems.add(new DonationHistoryItem(R.string.yearNineteen, R.drawable.right_arrow, R.string.eventNineteen));
        donationHistoryItems.add(new DonationHistoryItem(R.string.yearNTwenty, R.drawable.right_arrow, R.string.eventNTwenty));
        donationHistoryItems.add(new DonationHistoryItem(R.string.yearTwentyOne, R.drawable.right_arrow, R.string.eventTwentyOne));

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new CustomRecyclerViewAdapter(donationHistoryItems));

        return view;
    }
}