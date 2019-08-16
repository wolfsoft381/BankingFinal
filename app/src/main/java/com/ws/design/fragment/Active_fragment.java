package com.ws.design.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ws.design.Adapter.ActiveRecycleAdapter;
import com.ws.design.Adapter.ServiceRecycleAdapter;
import com.ws.design.ModelClass.ActiveModelClass;
import com.ws.design.ModelClass.ServiceMocelClass;
import com.ws.design.myapplication.R;

import java.util.ArrayList;

public class Active_fragment extends Fragment {

    private View view;

    /*profession data is here*/

    private ArrayList<ActiveModelClass> activeModelClasses;
    private RecyclerView recyclerViewLike;
    private ActiveRecycleAdapter bAdapterLike;

    private String title[] = {"Cash Loan","Cash Loan"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_active_fragment, container, false);

        /*profession recyclerview code is here*/

        recyclerViewLike = view.findViewById(R.id.active_recyclerview);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(getActivity());
        recyclerViewLike.setLayoutManager(new LinearLayoutManager(getActivity()));

        recyclerViewLike.setItemAnimator(new DefaultItemAnimator());

        activeModelClasses = new ArrayList<>();

        for (int i = 0; i < title.length; i++) {
            ActiveModelClass mycreditList = new ActiveModelClass(title[i]);
            activeModelClasses.add(mycreditList);
        }
        bAdapterLike = new ActiveRecycleAdapter(getActivity(),activeModelClasses);
        recyclerViewLike.setAdapter(bAdapterLike);

        return  view;
    }


}
