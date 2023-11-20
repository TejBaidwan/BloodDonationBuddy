package com.example.blooddonationbuddy.DonationViewPager;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.blooddonationbuddy.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DonationViewPagerHostFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DonationViewPagerHostFragment extends Fragment {

    ViewPager2 viewPager2;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DonationViewPagerHostFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DonationViewPagerHostFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DonationViewPagerHostFragment newInstance(String param1, String param2) {
        DonationViewPagerHostFragment fragment = new DonationViewPagerHostFragment();
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
        View view = inflater.inflate(R.layout.fragment_donation_view_pager_host, container, false);
        viewPager2 = view.findViewById(R.id.vpDonationHost);
        viewPager2.setAdapter(new DonationCustomVPAdapter(getActivity()));
        viewPager2.setOrientation(ViewPager2.ORIENTATION_VERTICAL);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TabLayout tabLayoutDonation = view.findViewById(R.id.donationStepNum);
        new TabLayoutMediator(tabLayoutDonation, viewPager2, (tab, position) ->
                tab.setText(position));
    }
}