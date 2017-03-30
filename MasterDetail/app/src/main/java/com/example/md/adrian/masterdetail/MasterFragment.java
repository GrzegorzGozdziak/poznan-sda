package com.example.md.adrian.masterdetail;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Adrian on 2017-03-28.
 */

public class MasterFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

<<<<<<< HEAD


//        Button button = new Button(getActivity());
//        button.setText("Dane podstawowe");
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                MainActivity activity = (MainActivity) getActivity();
////                activity.showToast();
//            }
//        });
        final MainActivity activity = (MainActivity) getActivity();
        View view = inflater.inflate(R.layout.master_layout, container);
        View vievDetails = inflater.inflate(R.layout.detail_layout, container);

        View basicDataButton = (Button) view.findViewById(R.id.basicInfoButton);
        basicDataButton.setOnClickListener(new View.OnClickListener(){
=======
        final MainActivity activity = (MainActivity) getActivity();
        View view = inflater.inflate(R.layout.master_layout, container);
        Button basicDataButton = (Button) view.findViewById(R.id.basicDataButton);
        Button detailsButton = (Button) view.findViewById(R.id.detailsButton);
        basicDataButton.setOnClickListener(new View.OnClickListener() {
>>>>>>> 4a6f75d860b2dea1454dcbef1f5d30d4bdc38d8f
            @Override
            public void onClick(View v) {
                activity.showBasicData();
            }
        });

<<<<<<< HEAD
        View detailsButton = (Button) view.findViewById(R.id.addressButton);
        detailsButton.setOnClickListener(new View.OnClickListener(){
=======
        detailsButton.setOnClickListener(new View.OnClickListener() {
>>>>>>> 4a6f75d860b2dea1454dcbef1f5d30d4bdc38d8f
            @Override
            public void onClick(View v) {
                activity.showDetailsData();
            }
        });
<<<<<<< HEAD

=======
>>>>>>> 4a6f75d860b2dea1454dcbef1f5d30d4bdc38d8f
        return view;
    }
}
