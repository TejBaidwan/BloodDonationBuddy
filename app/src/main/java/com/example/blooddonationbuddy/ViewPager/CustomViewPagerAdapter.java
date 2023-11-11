package com.example.blooddonationbuddy.ViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.blooddonationbuddy.R;

public class CustomViewPagerAdapter extends FragmentStateAdapter {
    public CustomViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return LearnBloodTypesFragment.newInstance("TYPE A BLOOD", R.drawable.bloodtypea, "FILLER TEXT1");
            case 1:
                return LearnBloodTypesFragment.newInstance("TYPE B BLOOD", R.drawable.bloodtypeb, "FILLER TEXT2");
            case 2:
                return LearnBloodTypesFragment.newInstance("TYPE AB BLOOD", R.drawable.bloodtypeab, "FILLER TEXT3");
            case 3:
                return LearnBloodTypesFragment.newInstance("TYPE O BLOOD", R.drawable.bloodtypeo, "FILLER TEXT4");
            default:
                return LearnBloodTypesFragment.newInstance("ERROR", R.drawable.bloodinfo, "NO TEXT AVAILABLE");

        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
