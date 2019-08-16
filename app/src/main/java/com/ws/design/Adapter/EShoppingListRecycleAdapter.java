package com.ws.design.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ws.design.ModelClass.EShoppingModelClass;
import com.ws.design.myapplication.AboutBankingActivity;
import com.ws.design.myapplication.BankAccountDetailActivity;
import com.ws.design.myapplication.HomepageActivity;
import com.ws.design.myapplication.LoanTabActivity;
import com.ws.design.myapplication.R;
import com.ws.design.myapplication.SecondActivity;
import com.ws.design.myapplication.UploadDocActivity;
import com.ws.design.myapplication.VerificationActivity;

import java.util.List;




public class EShoppingListRecycleAdapter extends RecyclerView.Adapter<EShoppingListRecycleAdapter.MyViewHolder> {

    Context context;


    private List<EShoppingModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView title;


        public MyViewHolder(View view) {
            super(view);

            title = (TextView) view.findViewById(R.id.title);


        }

    }


    public EShoppingListRecycleAdapter(Context context, List<EShoppingModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public EShoppingListRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);


        return new EShoppingListRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        EShoppingModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0) {
                    Intent i = new Intent(context, SecondActivity.class);
                    context.startActivity(i);
                }else if(position == 1) {
                    Intent i = new Intent(context, HomepageActivity.class);
                    context.startActivity(i);
                }else if(position == 2) {
                    Intent i = new Intent(context, UploadDocActivity.class);
                    context.startActivity(i);
                }else if(position == 3) {
                    Intent i = new Intent(context, BankAccountDetailActivity.class);
                    context.startActivity(i);
                } else if(position == 4) {
                    Intent i = new Intent(context, LoanTabActivity.class);
                    context.startActivity(i);
                }else if(position == 5) {
                    Intent i = new Intent(context, VerificationActivity.class);
                    context.startActivity(i);
                }else if(position == 6) {
                    Intent i = new Intent(context, AboutBankingActivity.class);
                    context.startActivity(i);
                }
            }

        });


    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


