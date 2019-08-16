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

import com.ws.design.Adapter.LoanRecycleAdapter;
import com.ws.design.Adapter.ServiceRecycleAdapter;
import com.ws.design.Adapter.UploadDocRecycleAdapter;
import com.ws.design.ModelClass.LoanModelClass;
import com.ws.design.ModelClass.ServiceMocelClass;
import com.ws.design.myapplication.R;

import java.util.ArrayList;


public class CardFragment extends Fragment {


    private  View view;

    /*profession data is here*/

    private ArrayList<LoanModelClass> loanModelClasses;
    private RecyclerView recyclerViewLike;
    private LoanRecycleAdapter bAdapterLike;

    private Integer image[] = {R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};
    private String title[] = {"Smart Card","Active Loans","Pending Loans","Awaiting Loans","Completed Loans"};
    private String sub_title[] = {"Check Card Balance and Loan","Payment dues and balance","Pending Loans",
    "Awaiting Loans","Completed Loans"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_card, container, false);

        recyclerViewLike = view.findViewById(R.id.LoanRecyclcerview);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(getActivity());
        recyclerViewLike.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerViewLike.setItemAnimator(new DefaultItemAnimator());

        loanModelClasses = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            LoanModelClass mycreditList = new LoanModelClass(image[i],title[i],sub_title[i]);
            loanModelClasses.add(mycreditList);
        }
        bAdapterLike = new LoanRecycleAdapter(getActivity(),loanModelClasses);
        recyclerViewLike.setAdapter(bAdapterLike);


        return  view;
    }


}
