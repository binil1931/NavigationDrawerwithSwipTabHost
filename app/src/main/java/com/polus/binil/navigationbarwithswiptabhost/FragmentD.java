package com.polus.binil.navigationbarwithswiptabhost;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 */
public class FragmentD extends SherlockFragment {

    public FragmentD() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_d, container, false);
    }


}