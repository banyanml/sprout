package nz.shelto.banyan.sprout;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import nz.shelto.banyan.sprout.fragments.DailyStatsFragment;
import nz.shelto.banyan.sprout.fragments.OnFragmentInteractionListener;

public class DailyStatsActivity extends AppCompatActivity implements OnFragmentInteractionListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_stats);
        final Calendar calendar = (Calendar)this.getIntent().getExtras().getSerializable("calendar");
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
        Log.d("CAL_TIME", simpleDateFormat.format(calendar.getTime()));
        final DailyStatsFragment fragment = new DailyStatsFragment(this, calendar);
        final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        fragment.setParentActivity(this);
        transaction.replace(R.id.fragment2, fragment);
        transaction.commit();
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
