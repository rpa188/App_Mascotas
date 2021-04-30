package com.example.appmascotas.Fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.appmascotas.Adapter.MascotaAdapter;
import com.example.appmascotas.Model.Mascota;
import com.example.appmascotas.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager lManager;

    List<Mascota> items = new ArrayList<>();


    public HomeFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        items.add(new Mascota(R.drawable.dog,"PerroUno","Machito", "Perrito de 5 años"));
        items.add(new Mascota(R.drawable.dog,"PerroUno","Machito", "Perrito de 5 años"));
        items.add(new Mascota(R.drawable.dog,"PerroUno","Machito", "Perrito de 5 años"));
        items.add(new Mascota(R.drawable.dog,"PerroUno","Machito", "Perrito de 5 años"));
        items.add(new Mascota(R.drawable.dog,"PerroUno","Machito", "Perrito de 5 años"));
        items.add(new Mascota(R.drawable.dog,"PerroUno","Machito", "Perrito de 5 años"));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);
        //Obtener recycler
        recyclerView = view.findViewById(R.id.recyclerPrincipal);
        //Mejorar rendimiento
        recyclerView.setHasFixedSize(true);
        //Usar un administrador para Linear Layout
        lManager = new LinearLayoutManager(getContext());
        int numberOfColumns=2;
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), numberOfColumns));
        //Crea un nuevo adaptador
        adapter = new MascotaAdapter(items);
        recyclerView.setAdapter(adapter);
        return view;
    }
}