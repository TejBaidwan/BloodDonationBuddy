package com.example.blooddonationbuddy.DonationViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.blooddonationbuddy.R;

public class DonationCustomVPAdapter extends FragmentStateAdapter {
    public DonationCustomVPAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return DonationProcessFragment.newInstance(R.string.arrive, R.drawable.arrivestep, R.string.arriveDesc);
            case 1:
                return DonationProcessFragment.newInstance(R.string.checkup, R.drawable.checkupstep, R.string.checkupDesc);
            case 2:
                return DonationProcessFragment.newInstance(R.string.donate, R.drawable.donationstep, R.string.donateDesc);
            case 3:
                return DonationProcessFragment.newInstance(R.string.refreshments, R.drawable.refreshstep, R.string.refreshmentDesc);
            case 4:
                return DonationProcessFragment.newInstance(R.string.satisfaction, R.drawable.satisfactionstep, R.string.satisfactionDesc);
            default:
                return DonationProcessFragment.newInstance(0, 0, 0);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}