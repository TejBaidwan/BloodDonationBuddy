package com.example.blooddonationbuddy.ViewPager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.blooddonationbuddy.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LearnBloodTypesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LearnBloodTypesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private int mParam2;
    private String mParam3;

    public LearnBloodTypesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LearnBloodTypesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LearnBloodTypesFragment newInstance(String param1, int param2, String param3) {
        LearnBloodTypesFragment fragment = new LearnBloodTypesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putInt(ARG_PARAM2, param2);
        args.putString(ARG_PARAM3, param3);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getInt(ARG_PARAM2);
            mParam3 = getArguments().getString(ARG_PARAM3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_learn_blood_types, container, false);

        TextView bloodType = view.findViewById(R.id.bloodTypeTitle);
        ImageView bloodTypeImg = view.findViewById(R.id.bloodTypeImage);
        TextView bloodTypeDesc = view.findViewById(R.id.bloodTypeDesc);

        if (mParam1 != null && mParam3 != null) {
            bloodType.setText(mParam1);
            bloodTypeImg.setImageResource(mParam2);
            bloodTypeDesc.setText(mParam3);
        }

        return view;
    }
}