package mx.pepivsky.tareasemana4recyclerview.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import mx.pepivsky.tareasemana4recyclerview.Adapter.MascotaAdaptador;
import mx.pepivsky.tareasemana4recyclerview.Pojo.Mascota;
import mx.pepivsky.tareasemana4recyclerview.R;

/**
 * Created by noisecontrollers on 24/08/2016.
 */
public class RecyclerViewFragment extends Fragment {
   private ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        listaMascotas = (RecyclerView)v.findViewById(R.id.rvMascotas);


        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        InicializarListaMascotas();
        inicializarAdpatador();

        return v;
    }

    public void InicializarListaMascotas(){ //Método que inicializa la  lista
        mascotas = new ArrayList<Mascota>();
        //llenado de la lista

        mascotas.add(new Mascota(R.drawable.aves_exoticas_del_amazonas_y_del_mundo,"Juancho"));
        mascotas.add(new Mascota(R.drawable.perro_carlino_485x300,"Firulais"));
        mascotas.add(new Mascota(R.drawable.descarga,"Manchas"));
        mascotas.add(new Mascota(R.drawable.oveja,"Dolly"));
        mascotas.add(new Mascota(R.drawable.images,"Ernestin"));

    }

    public void inicializarAdpatador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,getActivity());
        listaMascotas.setAdapter(adaptador);
    }

}
