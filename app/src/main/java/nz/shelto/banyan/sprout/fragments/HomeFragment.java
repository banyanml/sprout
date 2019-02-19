package nz.shelto.banyan.sprout.fragments;

import android.annotation.SuppressLint;
import android.app.Activity;

import java.util.Calendar;

@SuppressLint("ValidFragment")
public class HomeFragment extends DailyStatsFragment {

    @SuppressLint("ValidFragment")
    public HomeFragment(Activity parentActivity) {
        super(parentActivity, Calendar.getInstance());
    }

    public HomeFragment(){
        super(null, Calendar.getInstance());
    }


}
