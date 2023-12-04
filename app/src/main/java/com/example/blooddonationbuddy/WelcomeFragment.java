package com.example.blooddonationbuddy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WelcomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WelcomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public WelcomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WelcomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static WelcomeFragment newInstance(String param1, String param2) {
        WelcomeFragment fragment = new WelcomeFragment();
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
        View view = inflater.inflate(R.layout.fragment_welcome, container, false);

        //Find the buttons on the welcome screen
        Button emailBtn = view.findViewById(R.id.email);
        Button mapBtn = view.findViewById(R.id.map);
        Button socialBtn = view.findViewById(R.id.socialMedia);

        //Make the email button open an email intent with prefilled values for opening an email app
        emailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SENDTO);
                String cc = "baidwantejvir@gmail.com";
                String subject = "Question regarding blood donation";
                String body = "I have a question regarding blood donation";
                Uri data = Uri.parse("mailto:feedback@blood.ca" + "?cc=" + Uri.encode(cc) + "&subject=" +
                        Uri.encode(subject) + "&body=" +
                        Uri.encode(body));
                i.setData(data);
                startActivity(i);
            }
        });

        //Make the map button open a map intent with the location of Canadian Blood Services Windsor
        mapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri location = Uri.parse("geo:42.275282386463715, -83.00919639999998?q=m3015HowardAve");
                Intent i = new Intent(Intent.ACTION_VIEW, location);
                startActivity(i);
            }
        });

        //Make the social media button open a SEND intent which open app to share the app with
        socialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SEND);

                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_TEXT, "I found the BloodDonationBuddy app! Take a look at it!");
                startActivity(Intent.createChooser(i, "Share the app with"));
            }
        });

        return view;
    }
}