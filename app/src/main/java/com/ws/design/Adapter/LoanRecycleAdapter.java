package com.ws.design.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ws.design.ModelClass.LoanModelClass;
import com.ws.design.ModelClass.ServiceMocelClass;
import com.ws.design.myapplication.R;

import java.util.List;


public class LoanRecycleAdapter extends RecyclerView.Adapter<LoanRecycleAdapter.MyViewHolder> {

    Context context;


    private List<LoanModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView image;
        TextView title,sub_title;
        LinearLayout linear;
        View view_line;


        public MyViewHolder(View view) {
            super(view);

            image = (ImageView) view.findViewById(R.id.image);
            title = (TextView) view.findViewById(R.id.title);
            sub_title = (TextView) view.findViewById(R.id.sub_title);
            view_line = (View) view.findViewById(R.id.view_line);



        }

    }


    public LoanRecycleAdapter(Context context, List<LoanModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public LoanRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_loans_lists, parent, false);


        return new LoanRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        final LoanModelClass lists = OfferList.get(position);
        holder.image.setImageResource(lists.getImage());
        holder.title.setText(lists.getTitle());
        holder.sub_title.setText(lists.getSub_title());



        if(position==4){

            holder.view_line.setVisibility(View.GONE);
        }

    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


