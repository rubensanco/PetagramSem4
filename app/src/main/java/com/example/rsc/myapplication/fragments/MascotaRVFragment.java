package com.example.rsc.myapplication.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rsc.myapplication.R;
import com.example.rsc.myapplication.activities.MainActivity;
import com.example.rsc.myapplication.adapters.MascotaAdapter;
import com.example.rsc.myapplication.pojo.Mascota;

import java.util.ArrayList;


public class MascotaRVFragment extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_mascota_rv, container, false);
        listaMascotas = (RecyclerView) v.findViewById(R.id.reciclador);
        LinearLayoutManager llm =new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        MainActivity ma = (MainActivity) getActivity();
        mascotas =ma.mascotas;
        /*mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Rocky",R.drawable.perro_02,7,true));
        mascotas.add(new Mascota("Aquiles",R.drawable.perro_01,5,true));
        mascotas.add(new Mascota("Mike",R.drawable.perro_03,6,true));
        mascotas.add(new Mascota("Mateo", R.drawable.perro_04, 2, true));
        mascotas.add(new Mascota("Bolillo", R.drawable.perro_05, 1, true));*/

        MascotaAdapter adaptador = new MascotaAdapter(mascotas);
        listaMascotas.setAdapter(adaptador);


        return v;
    }

}
