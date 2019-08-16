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

import com.ws.design.ModelClass.ServiceMocelClass;
import com.ws.design.myapplication.R;

import java.util.List;


public class IncomeProofRecycleAdapter extends RecyclerView.Adapter<IncomeProofRecycleAdapter.MyViewHolder> {

    Context context;


    private List<ServiceMocelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView image;
        TextView title;
        LinearLayout linear;


        public MyViewHolder(View view) {
            super(view);

            image = (ImageView) view.findViewById(R.id.image);
            title = (TextView) view.findViewById(R.id.title);



        }

    }


    public IncomeProofRecycleAdapter(Context context, List<ServiceMocelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public IncomeProofRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_incom_proof_list, parent, false);


        return new IncomeProofRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        final ServiceMocelClass lists = OfferList.get(position);
        holder.image.setImageResource(lists.getImage());
        holder.title.setText(lists.getTitle());



    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


