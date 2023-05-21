package com.example.loginpageproject;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyrecycAdaptor extends RecyclerView.Adapter<MyrecycAdaptor.Myholder> {
    private ArrayList<Bayram> bayramlar;

    public MyrecycAdaptor(ArrayList<Bayram> bayrams) {
        this.bayramlar=bayrams;
    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bayram_item,parent,false);
        return new Myholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int position) {
        holder.txtbayram.setText(bayramlar.get(position).getBayram());
        holder.txtaciklama.setText(bayramlar.get(position).getBayramAciklama());
        holder.resim.setImageResource(bayramlar.get(position).getResim());
    }

    @Override
    public int getItemCount() {
        return bayramlar.size();
    }

    public class Myholder extends RecyclerView.ViewHolder{
        TextView txtbayram,txtaciklama;
        ImageView resim;

        public Myholder(@NonNull View itemView) {
            super(itemView);
            txtbayram=itemView.findViewById(R.id.textView_bayramadi);
            txtaciklama=itemView.findViewById(R.id.textView_aciklama);
            resim=itemView.findViewById(R.id.imageView_resim);
        }
    }
}
