package com.example.appmascotas;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.appmascotas.Fragmentos.FavoritesFragment;
import com.example.appmascotas.Fragmentos.HomeFragment;
import com.example.appmascotas.Fragmentos.InformationFragment;
import com.example.appmascotas.Fragmentos.NotificacionesFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);

        //Personalizando el color del Menu, sobreescribiendo a Blanco
        String primary = "#ffffff";
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor(primary)));

        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Implementando el Fragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.body_container, new HomeFragment()).commit();

        //La vista que carga por defecto en mi BottomNavigation
        bottomNavigationView.setSelectedItemId(R.id.home);


        //Recorriendo el item seleccionado en mi BottomNavigation
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment =  null;
                switch (item.getItemId()){
                    case R.id.home:
                        fragment = new HomeFragment();
                        break;
                    case R.id.config:
                        fragment = new InformationFragment();
                        break;
                    case R.id.favorito:
                        fragment = new FavoritesFragment();
                        break;
                    case R.id.notificacion:
                        fragment = new NotificacionesFragment();

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.body_container, fragment).commit();
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_inicio_sesison, menu);
        return true;
    }




}