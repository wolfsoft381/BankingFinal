package com.ws.design.myapplication;

import android.graphics.Typeface;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ws.design.Adapter.CategoryPagerAdapterLoan;
import com.ws.design.Adapter.WrapContentHeightViewPager;

public class LoanTabActivity extends AppCompatActivity {


    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_tab);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);



        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.addTab(tabLayout.newTab().setText("ACTIVE"));
        tabLayout.addTab(tabLayout.newTab().setText("PENDING"));
        tabLayout.addTab(tabLayout.newTab().setText("Awaiting Action"));
        tabLayout.addTab(tabLayout.newTab().setText("Complete"));
        tabLayout.addTab(tabLayout.newTab().setText("Cancel"));




        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        final ViewPager viewPager1 = (WrapContentHeightViewPager) findViewById(R.id.pager);
        CategoryPagerAdapterLoan adapter = new CategoryPagerAdapterLoan(getSupportFragmentManager(), 5);
        viewPager1.setAdapter(adapter);
        viewPager1.setOffscreenPageLimit(1);
        viewPager1.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager1.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });


    }
}
