package com.ws.design.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ws.design.Adapter.EShoppingListRecycleAdapter;
import com.ws.design.ModelClass.EShoppingModelClass;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private ArrayList<EShoppingModelClass> eShoppingModelClasses;
    private RecyclerView recyclerView;
    private EShoppingListRecycleAdapter bAdapter;

    private String txt[]=  {"Add Bank Account","HomePAge","Upload Documents","Bank Account Detail","Loan Payment","VerificationActivity",
    "AccountBanking"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        /*recyclerview code is here*/


        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ListActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        eShoppingModelClasses = new ArrayList<>();

        for (int i = 0; i < txt.length; i++) {
            EShoppingModelClass beanClassForRecyclerView_contacts = new EShoppingModelClass(txt[i]);
            eShoppingModelClasses.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new EShoppingListRecycleAdapter(ListActivity.this,eShoppingModelClasses);
        recyclerView.setAdapter(bAdapter);
    }
}
