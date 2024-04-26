package com.example.tablayoutexample;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerMessengerAdapter extends FragmentPagerAdapter {


    public ViewPagerMessengerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment f;
        switch (position){
            case 0:
                f=new ChatFragment();
                break;
            case 1:
                f= new StatusFragment();
                break;
            default:
                f= new CallFragment();
        }
        return f;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        CharSequence title;
        switch (position){
            case 0:
                title = "Chats";
                break;
            case 1:
                title = "Status";
                break;
            default:
                title = "Calls";
        }
        return title;
    }

}
