package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListaInicioActivity extends AppCompatActivity {

    RecyclerView idListaLabubu;
    List<Labubu> lstLabubu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.lista_inicio_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        lstLabubu = new ArrayList<Labubu>();
        lstLabubu.add(new Labubu("labubu fofa", R.drawable.labubu1));
        lstLabubu.add(new Labubu("labubu pescador", R.drawable.labubu2));
        lstLabubu.add(new Labubu("labubu luffy", R.drawable.labubu3));
        lstLabubu.add(new Labubu("labubu halloween", R.drawable.labubu4));
        lstLabubu.add(new Labubu("labubu demôniaco", R.drawable.labubu5));

    }
}