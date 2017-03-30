package com.example.fragmentexample.rent.advancedmasterdetailapp;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCurrencyCalculator();

//        FragmentTransaction transaction = getFragmentManager().beginTransaction();
//        transaction.replace(R.id.fragmentFrame, new CurrencyCalculatorFragment());
//        transaction.commit();
    }

    public void showCurrencyCalculator() {

        fragmentParameter(new CurrencyCalculatorFragment());

//        DetailFragment detailFragment = getDetailFragment();
//        if (detailFragment != null && detailFragment.isInLayout()) {
//            detailFragment.showBasicData();
//        }
//        else {
//            Intent intent = new Intent(this, DetailActivity.class);
//            intent.putExtra(DetailActivity.TO_SHOW, DetailActivity.BASIC_DATA);
//            startActivity(intent);
//        }
    }



    public void showInvestmentButton() {
        fragmentParameter(new InvestmentFragment());
    }

    private void fragmentParameter(Fragment fragmentParam) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentFrame, fragmentParam);
        transaction.commit();
    }


//    public void showBasicData() {
//        DetailFragment detailFragment = getDetailFragment();
//        if (detailFragment != null && detailFragment.isInLayout()) {
//            detailFragment.showBasicData();
//        }
//        else {
//            Intent intent = new Intent(this, DetailActivity.class);
//            intent.putExtra(DetailActivity.TO_SHOW, DetailActivity.BASIC_DATA);
//            startActivity(intent);
//        }
//    }
}
