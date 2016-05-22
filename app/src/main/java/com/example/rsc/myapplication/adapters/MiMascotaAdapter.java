package com.example.rsc.myapplication.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rsc.myapplication.R;
import com.example.rsc.myapplication.pojo.Mascota;

import java.util.ArrayList;


public class MiMascotaAdapter extends RecyclerView.Adapter<MiMascotaAdapter.MiMascotaViewHolder> {

    private ArrayList<Mascota> mimascota;

    public static class MiMascotaViewHolder extends RecyclerView.ViewHolder{

        public ImageView imagen;
        public TextView numero;



        public MiMascotaViewHolder(View itemView) {
            super(itemView);
            imagen = (ImageView) itemView.findViewById(R.id.imagen_mimascota_card);
            numero = (TextView) itemView.findViewById(R.id.numero_mimascota_card);

        }
    }

    public MiMascotaAdapter(ArrayList<Mascota> mimascota) {
        this.mimascota = mimascota;
    }

    @Override
    public MiMascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.mimascota_card,parent,false);
        return new MiMascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MiMascotaViewHolder holder, int i) {
        holder.imagen.setImageResource(mimascota.get(i).getImagen());
        holder.numero.setText(String.valueOf(mimascota.get(i).getLikes()));

    }

    @Override
    public int getItemCount() {
        return mimascota.size();
    }
}
