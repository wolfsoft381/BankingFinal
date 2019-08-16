package com.ws.design.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ws.design.fragment.Active_fragment;




/**
 * Created by wolfsoft5 on 7/4/18.
 */

public class CategoryPagerAdapterLoan extends FragmentPagerAdapter {

        int mNoOfTabs;

        public CategoryPagerAdapterLoan(FragmentManager fm, int NumberOfTabs)

        {
                super(fm);
                this.mNoOfTabs = NumberOfTabs;
        }

        @Override
        public Fragment getItem(int position) {
                switch (position) {

                        case 0:
                                Active_fragment tab1 = new Active_fragment();
                                return tab1;
                        case 1:
                                Active_fragment tab2 = new Active_fragment();
                                return tab2;
                        case 2:
                                Active_fragment tab3 = new Active_fragment();
                                return tab3;

                        case 3:
                                Active_fragment tab4 = new Active_fragment();
                                return tab4;


                        case 4:
                                Active_fragment tab5 = new Active_fragment();
                                return tab5;


                        default:
                                return null;

                }
        }

        @Override
        public int getCount() {
                return mNoOfTabs;

        }
}

