package com.example.android.horizontalpaging;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Anton on 2.4.2015.
 */
public class TyotehtavatFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_tyotehtavat, container, false);
        ListView lv = (ListView) rootView.findViewById(R.id.tyotehtavat);
        ArrayList<String> kohteet = new ArrayList<>();
        for (int i = 0;i < 15;i++){
            kohteet.add("LUT"+i);
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                kohteet);
        lv.setAdapter(arrayAdapter);
        return rootView;
    }
}