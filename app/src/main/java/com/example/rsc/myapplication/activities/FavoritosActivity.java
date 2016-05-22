package com.example.rsc.myapplication.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.rsc.myapplication.pojo.Mascota;
import com.example.rsc.myapplication.adapters.MascotaAdapterFav;
import com.example.rsc.myapplication.R;

import java.util.ArrayList;

public class FavoritosActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;
    ArrayList<Mascota> mascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mascotas = new ArrayList<Mascota>();
//        Bundle parametros = getIntent().getExtras();
        mascotas = (ArrayList) getIntent().getSerializableExtra("mascotas");
        ArrayList<Mascota> favoritos =  extraeFavoritos(mascotas);
        recycler = (RecyclerView) findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

        adapter = new MascotaAdapterFav(favoritos);
        recycler.setAdapter(adapter);


    }

    private ArrayList<Mascota> extraeFavoritos(ArrayList<Mascota> mascotas) {
        ArrayList<Mascota> favoritos= new ArrayList<Mascota>();
        for (Mascota mascota: mascotas){
            if (mascota.isFavorito()) {
                favoritos.add(mascota);
            }

        }
        return favoritos;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
