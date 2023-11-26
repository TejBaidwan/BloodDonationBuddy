package com.example.blooddonationbuddy;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DonationEligibilityFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DonationEligibilityFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DonationEligibilityFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DonationEligibilityFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DonationEligibilityFragment newInstance(String param1, String param2) {
        DonationEligibilityFragment fragment = new DonationEligibilityFragment();
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
        View view = inflater.inflate(R.layout.fragment_donation_eligibility, container, false);

        Spinner ageSpinner = view.findViewById(R.id.ageSpinner);
        String[] ages = getResources().getStringArray(R.array.ageOptions);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, ages);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ageSpinner.setAdapter(adapter);

        ToggleButton tattooToggle = view.findViewById(R.id.tattooToggle);
        ToggleButton dentalToggle = view.findViewById(R.id.dentalToggle);
        ToggleButton pregnantToggle = view.findViewById(R.id.pregnantToggle);
        ToggleButton weightToggle = view.findViewById(R.id.weightToggle);
        ToggleButton medicineToggle = view.findViewById(R.id.medicationToggle);

        TextView eligibilityResult = view.findViewById(R.id.eligibleResult);

        Button determine = view.findViewById(R.id.checkEligibility);

        determine.setOnClickListener(new View.OnClickListener() {
            boolean ageEligible = false;
            boolean tattooEligible = true;
            boolean dentalEligible = true;
            boolean pregnantEligible = true;
            boolean weightEligible = false;
            boolean medicineEligible = true;

            @Override
            public void onClick(View v) {
                ageSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0 :
                                ageEligible = false;
                            default:
                                ageEligible = true;
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                if (tattooToggle.isChecked()) {
                    tattooEligible = false;
                }
                if (dentalToggle.isChecked()) {
                    dentalEligible = false;
                }
                if (pregnantToggle.isChecked()) {
                    pregnantEligible = false;
                }
                if (weightToggle.isChecked()) {
                    weightEligible = true;
                }
                if (medicineToggle.isChecked()) {
                    medicineEligible = false;
                }
            }



        });


        return view;
    }
}