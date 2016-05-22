package com.example.rsc.myapplication.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rsc.myapplication.R;
import com.example.rsc.myapplication.adapters.MiMascotaAdapter;
import com.example.rsc.myapplication.pojo.Mascota;

import java.util.ArrayList;



public class PerfilMascotaFragment extends Fragment {

    ArrayList<Mascota> miMascota;
    private RecyclerView gridMiMascota;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil_mascota,container,false);
        gridMiMascota = (RecyclerView) v.findViewById(R.id.reciclador_mimascota);
        GridLayoutManager glm = new GridLayoutManager(getActivity(),3);
        gridMiMascota.setLayoutManager(glm);
        miMascota = new ArrayList<Mascota>();
        miMascota.add(new Mascota("Rocky",R.drawable.perro_02,7));
        miMascota.add(new Mascota("Rocky",R.drawable.perro_02,4));
        miMascota.add(new Mascota("Rocky",R.drawable.perro_02,3));
        miMascota.add(new Mascota("Rocky",R.drawable.perro_02,8));
        miMascota.add(new Mascota("Rocky",R.drawable.perro_02,0));
        miMascota.add(new Mascota("Rocky",R.drawable.perro_02,1));
        miMascota.add(new Mascota("Rocky",R.drawable.perro_02,9));
        miMascota.add(new Mascota("Rocky",R.drawable.perro_02,5));
        miMascota.add(new Mascota("Rocky",R.drawable.perro_02,2));
        miMascota.add(new Mascota("Rocky",R.drawable.perro_02,6));

        MiMascotaAdapter adaptador = new MiMascotaAdapter(miMascota);
        gridMiMascota.setAdapter(adaptador);

        return v;
    }

}
