package com.example.appmascotas.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appmascotas.Model.Mascota;
import com.example.appmascotas.R;

import java.util.List;

public class MascotaAdapter extends RecyclerView.Adapter<MascotaAdapter.MascotaViewHolder> {

    //Para recorrer mis elementos del Modelo Mascota
    private List<Mascota> mascotaList;

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        public ImageView imagen;
        public TextView nombre;
        public TextView description;

        public MascotaViewHolder(@NonNull View v) {
            super(v);
            imagen = v.findViewById(R.id.imagen);
            nombre = v.findViewById(R.id.nombre);
            description = v.findViewById(R.id.description);
        }
    }

    //Creamos el constructores
    public MascotaAdapter(List<Mascota> mascotas) {
        this.mascotaList = mascotas;
    }


    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.mascota_card, viewGroup, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder viewHolder, int position) {

            //Obtener el elemento de su conjunto de datos en esta posición
        viewHolder.imagen.setImageResource(mascotaList.get(position).getImagen());
        viewHolder.nombre.setText(mascotaList.get(position).getNombre());
        viewHolder.description.setText(mascotaList.get(position).getDescription());
    }

    //Cantidad de elementos a procesar
    @Override
    public int getItemCount() {
        return mascotaList.size();
    }
}
