package com.example.blooddonationbuddy.DonationViewPager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.blooddonationbuddy.R;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DonationProcessFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DonationProcessFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";

    // TODO: Rename and change types of parameters
    private int mParam1;
    private int mParam2;
    private int mParam3;

    public DonationProcessFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DonationProcessFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DonationProcessFragment newInstance(int param1, int param2, int param3) {
        DonationProcessFragment fragment = new DonationProcessFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, param1);
        args.putInt(ARG_PARAM2, param2);
        args.putInt(ARG_PARAM3, param3);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getInt(ARG_PARAM1);
            mParam2 = getArguments().getInt(ARG_PARAM2);
            mParam3 = getArguments().getInt(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_donation_process, container, false);

        TextView donationStep = view.findViewById(R.id.donationStep);
        ImageView donationStepImg = view.findViewById(R.id.donationStepImg);
        TextView donationStepDesc = view.findViewById(R.id.donationStepDesc);

        if (mParam1 != 0 && mParam2 != 0 && mParam3 != 0) {
            donationStep.setText(mParam1);
            donationStepImg.setImageResource(mParam2);
            donationStepDesc.setText(mParam3);
        }

        return view;
    }
}