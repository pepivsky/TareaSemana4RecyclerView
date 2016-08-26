package mx.pepivsky.tareasemana4recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import java.util.ArrayList;

import mx.pepivsky.tareasemana4recyclerview.Adapter.MascotaAdaptador;
import mx.pepivsky.tareasemana4recyclerview.Pojo.Mascota;

public class DetalleMascota extends AppCompatActivity {
ImageView imgRaiting;
    ArrayList mascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_mascota);
        Toolbar miActionBar= (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        imgRaiting=((ImageView)findViewById(R.id.imgRaiting));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        mascotas = new ArrayList<Mascota>();
        //llenado de la lista

        mascotas.add(new Mascota(R.drawable.aves_exoticas_del_amazonas_y_del_mundo,"Juancho"));
        mascotas.add(new Mascota(R.drawable.perro_carlino_485x300,"Firulais"));
        mascotas.add(new Mascota(R.drawable.descarga,"Manchas"));
        mascotas.add(new Mascota(R.drawable.oveja,"Dolly"));
        mascotas.add(new Mascota(R.drawable.images,"Ernestin"));


        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rvRanking);



        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);

        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,this);
        recyclerView.setAdapter(adaptador);


    }


}
