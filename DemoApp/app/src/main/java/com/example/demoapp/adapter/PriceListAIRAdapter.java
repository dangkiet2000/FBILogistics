package com.example.demoapp.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demoapp.R;
import com.example.demoapp.constant.Constant;
import com.example.demoapp.model.Air;
import com.example.demoapp.model.Fcl;
import com.example.demoapp.view.detail.FragmentAirDetail;
import com.example.demoapp.view.detail.FragmentLogDetail;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import retrofit2.http.PUT;

public class PriceListAIRAdapter extends RecyclerView.Adapter<PriceListAIRAdapter.PriceAirViewHolder> {
    private Context context;
    private List<Air> listAIRS;

    public PriceListAIRAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public PriceAirViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_pricelist_air, parent, false);

        return new PriceAirViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PriceAirViewHolder holder, int position) {
            Air air = listAIRS.get(position);
        if (listAIRS != null && listAIRS.size() > 0) {


            holder.tvstt.setText(air.getStt());
            holder.tvaol.setText(air.getAol());
            holder.tvaod.setText(air.getAod());
            holder.tvdim.setText(air.getDim());
            holder.tvgross.setText(air.getGrossweight());
            holder.tvtype.setText(air.getTypeofcargo());
            holder.tvairfreight.setText(air.getAirfreight());
            holder.tvsurcharge.setText(air.getSurcharge());
            holder.tvairlines.setText(air.getAirlines());
            holder.tvschedule.setText(air.getSchedule());
            holder.tvtransittime.setText(air.getTransittime());
            holder.tvvalid.setText(air.getValid());
            holder.tvnote.setText(air.getNote());


        }else{
            return;
        }
        holder.airCarView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            goToDetail(air);
        }
    });
    }

    private void goToDetail(Air air) {
        FragmentActivity activity = (FragmentActivity) context;
        FragmentManager fm = activity.getSupportFragmentManager();
//        DialogFragment dialogFragment = FragmentAirDetail.getInstance();

        Bundle bundle = new Bundle();
        bundle.putSerializable(Constant.AIR_OBJECT, air);
//        dialogFragment.setArguments(bundle);
//        dialogFragment.show( fm,"DetailAir");
    }

    @Override
    public int getItemCount() {
        if (listAIRS != null) {
            return listAIRS.size();
        }
        return 0;
    }

    public void setDataAir(List<Air> mListDetailAir) {
        this.listAIRS = mListDetailAir;
        notifyDataSetChanged();
    }


    public class PriceAirViewHolder extends RecyclerView.ViewHolder {
        TextView tvstt, tvaol, tvaod, tvdim, tvgross, tvtype, tvairfreight, tvsurcharge, tvairlines,
                tvschedule, tvtransittime, tvvalid, tvnote;
        private ConstraintLayout airCarView;

        public PriceAirViewHolder(@NonNull View itemView) {
            super(itemView);
            airCarView = itemView.findViewById(R.id.row_cv_air);
            tvstt = itemView.findViewById(R.id.tv_row_price_asia_air_stt);
            tvaol = itemView.findViewById(R.id.tv_row_price_asia_air_aol);
            tvaod = itemView.findViewById(R.id.tv_row_price_asia_air_aod);
            tvdim = itemView.findViewById(R.id.tv_row_price_asia_air_dim);
            tvgross = itemView.findViewById(R.id.tv_row_price_asia_air_grossweight);
            tvtype = itemView.findViewById(R.id.tv_row_price_asia_air_typeofcargo);
            tvairfreight = itemView.findViewById(R.id.tv_row_price_asia_air_freight);
            tvsurcharge = itemView.findViewById(R.id.tv_row_price_asia_air_surcharge);
            tvairlines = itemView.findViewById(R.id.tv_row_price_asia_air_airlines);
            tvschedule = itemView.findViewById(R.id.tv_row_price_asia_air_schedule);
            tvtransittime = itemView.findViewById(R.id.tv_row_price_asia_air_transittime);
            tvvalid = itemView.findViewById(R.id.tv_row_price_asia_air_valid);
            tvnote = itemView.findViewById(R.id.tv_row_price_asia_air_note);
        }

    }
}