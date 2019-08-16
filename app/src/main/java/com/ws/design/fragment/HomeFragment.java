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

import com.ws.design.Adapter.ServiceRecycleAdapter;
import com.ws.design.ModelClass.ServiceMocelClass;
import com.ws.design.myapplication.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {


   private View view;

    /*profession data is here*/

    private ArrayList<ServiceMocelClass> serviceMocelClasses;
    private RecyclerView recyclerViewLike;
    private ServiceRecycleAdapter bAdapterLike;

    private Integer image[] = {R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};
    private String title[] = {"Amazon","Flipcart","Myntra","Jabong","Snapdeal"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);

        /*profession recyclerview code is here*/

        recyclerViewLike = view.findViewById(R.id.services_recyclerview);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(getActivity());
        recyclerViewLike.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        recyclerViewLike.setItemAnimator(new DefaultItemAnimator());

        serviceMocelClasses = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            ServiceMocelClass mycreditList = new ServiceMocelClass(image[i],title[i]);
            serviceMocelClasses.add(mycreditList);
        }
        bAdapterLike = new ServiceRecycleAdapter(getActivity(),serviceMocelClasses);
        recyclerViewLike.setAdapter(bAdapterLike);

        return  view;
    }


}
