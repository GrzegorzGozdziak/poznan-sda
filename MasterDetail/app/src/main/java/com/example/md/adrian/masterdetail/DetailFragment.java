package com.example.md.adrian.masterdetail;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Adrian on 2017-03-28.
 */

public class DetailFragment extends Fragment {

<<<<<<< HEAD
    private TextView headerTextView;
=======
    private TextView titleTextView;
>>>>>>> 4a6f75d860b2dea1454dcbef1f5d30d4bdc38d8f
    private TextView detailsTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detail_layout, container);
<<<<<<< HEAD
        headerTextView = (TextView) view.findViewById(R.id.headerTextView);
        detailsTextView = (TextView) view.findViewById(R.id.detailTextView);
=======

        titleTextView = (TextView) view.findViewById(R.id.titleTextView);
        detailsTextView = (TextView) view.findViewById(R.id.detailsTextView);

>>>>>>> 4a6f75d860b2dea1454dcbef1f5d30d4bdc38d8f
        return view;
    }

    public void showBasicData() {
<<<<<<< HEAD
        headerTextView.setText("Dane Podstawowe");
        detailsTextView.setText("Greg Goz\n");
    }

    public void showDetailsData() {
        headerTextView.setText("Adres");
        detailsTextView.setText("55-555 P-ń\nAl. Niepodległości 123");
=======
        titleTextView.setText("Dane podstawowe");
        detailsTextView.setText("Jan Kowalski");
    }

    public void showDetailsData() {

        titleTextView.setText("Szczegóły");
        detailsTextView.setText("Lat 26, wzrost 175cm");
>>>>>>> 4a6f75d860b2dea1454dcbef1f5d30d4bdc38d8f
    }
}
