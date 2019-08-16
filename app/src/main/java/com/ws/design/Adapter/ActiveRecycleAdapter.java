package com.ws.design.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ws.design.ModelClass.ActiveModelClass;
import com.ws.design.ModelClass.EShoppingModelClass;
import com.ws.design.myapplication.BankAccountDetailActivity;
import com.ws.design.myapplication.HomepageActivity;
import com.ws.design.myapplication.LoanTabActivity;
import com.ws.design.myapplication.R;
import com.ws.design.myapplication.SecondActivity;
import com.ws.design.myapplication.UploadDocActivity;

import java.util.List;


public class ActiveRecycleAdapter extends RecyclerView.Adapter<ActiveRecycleAdapter.MyViewHolder> {

    Context context;


    private List<ActiveModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView title;


        public MyViewHolder(View view) {
            super(view);

            title = (TextView) view.findViewById(R.id.title);


        }

    }


    public ActiveRecycleAdapter(Context context, List<ActiveModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public ActiveRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_tab_loan_list, parent, false);


        return new ActiveRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        ActiveModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());




    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


