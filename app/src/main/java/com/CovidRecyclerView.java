package com;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.covidtracker.R;

import java.util.ArrayList;

public class CovidRecyclerView extends RecyclerView.Adapter<CovidRecyclerView.ViewHolder> {
private ArrayList<Covid>covidList;
private Context context;

public CovidRecyclerView(ArrayList<Covid>covidList,Context context){
    this.covidList=covidList;
    this.context=context;
}
    @NonNull
    @Override
    public CovidRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
    View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_main,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CovidRecyclerView.ViewHolder viewHolder, int i) {
    viewHolder.tvContryName.setText(covidList.get(i).getCountryName());
    viewHolder.tvcs.setText(covidList.get(i).getCases());
    viewHolder.tvrc.setText(covidList.get(i).getRecovered());


    }

    @Override
    public int getItemCount() {
        return covidList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvContryName,tvTotalCases,tvRecoveredCases,tvcs,tvrc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
           tvContryName=itemView.findViewById(R.id.tvCountryName);
           tvcs=itemView.findViewById(R.id.tvcs);
           tvrc=itemView.findViewById(R.id.tvrc);

        }
    }
}
