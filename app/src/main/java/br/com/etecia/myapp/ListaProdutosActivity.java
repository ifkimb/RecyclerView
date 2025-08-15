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

public class ListaProdutosActivity extends AppCompatActivity {

    RecyclerView idListaProdutos;
    List<Produtos> lstProdutos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.lista_produtos_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //criando um array que vai carregar a lista de produtos
        lstProdutos = new ArrayList<>();
        lstProdutos.add(new Produtos("alexa", R.drawable.alexa));
        lstProdutos.add(new Produtos("câmera", R.drawable.camera));
        lstProdutos.add(new Produtos("caneta", R.drawable.caneta));
        lstProdutos.add(new Produtos("fone", R.drawable.fone));
        lstProdutos.add(new Produtos("meia", R.drawable.meia));
        lstProdutos.add(new Produtos("nintendo", R.drawable.nintendo));
        lstProdutos.add(new Produtos("sabonete", R.drawable.sabonete));
        lstProdutos.add(new Produtos("spiderman jogo", R.drawable.spiderman_game));
        lstProdutos.add(new Produtos("zelda jogo", R.drawable.zelda));
        lstProdutos.add(new Produtos("notebook", R.drawable.notebook));

        idListaProdutos = findViewById(R.id.idListaProdutos);
    }
}