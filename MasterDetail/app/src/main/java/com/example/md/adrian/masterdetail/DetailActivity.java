package com.example.md.adrian.masterdetail;

import android.app.Activity;
<<<<<<< HEAD
import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
=======
>>>>>>> 4a6f75d860b2dea1454dcbef1f5d30d4bdc38d8f
import android.os.Bundle;

public class DetailActivity extends Activity {

<<<<<<< HEAD
    public static final int BASIC_DATA = 0;
    public static final int DETAILS = 1;
    public static final String TO_SHOW = "TO_SHOW";

=======
>>>>>>> 4a6f75d860b2dea1454dcbef1f5d30d4bdc38d8f
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
<<<<<<< HEAD

        int toShow = getIntent().getIntExtra(TO_SHOW, BASIC_DATA);

        FragmentManager fm = getFragmentManager();
        DetailFragment detailFragment = (DetailFragment) fm.findFragmentById(R.id.detailFragment);

        if (toShow == BASIC_DATA) {
            detailFragment.showBasicData();
        } else if (toShow == DETAILS) {
            detailFragment.showDetailsData();
        }
=======
>>>>>>> 4a6f75d860b2dea1454dcbef1f5d30d4bdc38d8f
    }
}
