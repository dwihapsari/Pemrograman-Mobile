package com.hapsari.dramakorea;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardDrakorAdapter extends RecyclerView.Adapter<CardDrakorAdapter.ListViewHolder> {
    private ArrayList<Drakor> listDrakor;
    private Context context;

    public CardDrakorAdapter(Context context, ArrayList<Drakor> listDrakor){
        this.listDrakor = listDrakor;
        this.context    = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_drakor,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final Drakor drakor = listDrakor.get(position);
        Glide.with(holder.itemView.getContext())
                .load(drakor.getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(holder.imgPhoto);
        holder.tvName.setText(drakor.getName());
        holder.tvDesc.setText(drakor.getDescription());

        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent detailDrakor = new Intent(context, DetailListDrakor.class);
                detailDrakor.putExtra("drakor_id", drakor.getId());
                context.startActivity(detailDrakor);
            }
        });

    }

    @Override
    public int getItemCount() { return listDrakor.size(); }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        CardView cv;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_drakor_list);
            tvName   = itemView.findViewById(R.id.name_drakor_list);
            tvDesc   = itemView.findViewById(R.id.desc_drakor_list);
            cv       = itemView.findViewById(R.id.cardview_item);
        }
    }
}
