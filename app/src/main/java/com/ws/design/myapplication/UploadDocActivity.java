package com.ws.design.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ws.design.Adapter.ServiceRecycleAdapter;
import com.ws.design.Adapter.UploadDocRecycleAdapter;
import com.ws.design.ModelClass.ServiceMocelClass;

import java.util.ArrayList;

public class UploadDocActivity extends AppCompatActivity {

    /*profession data is here*/

    private ArrayList<ServiceMocelClass> serviceMocelClasses;
    private RecyclerView recyclerViewLike;
    private UploadDocRecycleAdapter bAdapterLike;

    private Integer image[] = {R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};
    private String title[] = {"Selfie with Agent","Agreement Form","Selfie with Agent"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_doc);

        /*profession recyclerview code is here*/

        recyclerViewLike = findViewById(R.id.upload_doc_recyclerview);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(UploadDocActivity.this);
        recyclerViewLike.setLayoutManager(layoutManager1);
        recyclerViewLike.setLayoutManager(new LinearLayoutManager(UploadDocActivity.this));

        recyclerViewLike.setItemAnimator(new DefaultItemAnimator());

        serviceMocelClasses = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            ServiceMocelClass mycreditList = new ServiceMocelClass(image[i],title[i]);
            serviceMocelClasses.add(mycreditList);
        }
        bAdapterLike = new UploadDocRecycleAdapter(UploadDocActivity.this,serviceMocelClasses);
        recyclerViewLike.setAdapter(bAdapterLike);
    }
}
