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
                return LearnBloodTypesFragment.newInstance(R.string.typeA, R.drawable.bloodtypea, R.string.typeAContent);
            case 1:
                return LearnBloodTypesFragment.newInstance(R.string.typeB, R.drawable.bloodtypeb, R.string.typeBContent);
            case 2:
                return LearnBloodTypesFragment.newInstance(R.string.typeAB, R.drawable.bloodtypeab, R.string.typeABContent);
            case 3:
                return LearnBloodTypesFragment.newInstance(R.string.typeO, R.drawable.bloodtypeo, R.string.typeOContent);
            default:
                return LearnBloodTypesFragment.newInstance(R.string.typeError, R.drawable.bloodinfo, R.string.typeError);

        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
