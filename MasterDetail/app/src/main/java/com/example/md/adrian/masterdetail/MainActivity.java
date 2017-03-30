package com.example.md.adrian.masterdetail;

import android.app.Activity;
import android.app.Fragment;
<<<<<<< HEAD
=======
import android.app.FragmentManager;
>>>>>>> 4a6f75d860b2dea1454dcbef1f5d30d4bdc38d8f
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
//        showBasicData();
=======


>>>>>>> 4a6f75d860b2dea1454dcbef1f5d30d4bdc38d8f
    }

    public void showBasicData() {
        DetailFragment detailFragment = getDetailFragment();
        if (detailFragment != null && detailFragment.isInLayout()) {
            detailFragment.showBasicData();
        }
        else {
            Intent intent = new Intent(this, DetailActivity.class);
<<<<<<< HEAD
            intent.putExtra(DetailActivity.TO_SHOW, DetailActivity.BASIC_DATA);
=======
>>>>>>> 4a6f75d860b2dea1454dcbef1f5d30d4bdc38d8f
            startActivity(intent);
        }
    }

    public void showDetailsData() {
        DetailFragment detailFragment = getDetailFragment();
<<<<<<< HEAD
        if(detailFragment != null && detailFragment.isInLayout()) {
            detailFragment.showDetailsData();
        } else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.TO_SHOW, DetailActivity.DETAILS);
            startActivity(intent);
        }
    }

    private DetailFragment getDetailFragment() {
        return (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
=======
        detailFragment.showDetailsData();
    }

    private DetailFragment getDetailFragment() {
        FragmentManager fm = getFragmentManager();
        return (DetailFragment) fm.findFragmentById(R.id.detailFragment);
>>>>>>> 4a6f75d860b2dea1454dcbef1f5d30d4bdc38d8f
    }
}
