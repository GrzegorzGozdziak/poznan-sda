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

    private TextView headerTextView;
    private TextView detailsTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detail_layout, container);
        headerTextView = (TextView) view.findViewById(R.id.headerTextView);
        detailsTextView = (TextView) view.findViewById(R.id.detailTextView);
        return view;
    }

    public void showBasicData() {
        headerTextView.setText("Dane Podstawowe");
        detailsTextView.setText("Greg Goz\n");
    }

    public void showDetailsData() {
        headerTextView.setText("Adres");
        detailsTextView.setText("55-555 P-ń\nAl. Niepodległości 123");
    }
}
