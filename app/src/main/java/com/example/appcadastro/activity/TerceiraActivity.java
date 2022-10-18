package com.example.appcadastro.activity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.appcadastro.R;
import com.example.appcadastro.fragmento.CadastroProdutoFragment;
import com.example.appcadastro.fragmento.ProdutoListaFragment;

public class TerceiraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);
        setResult(80);

        ProdutoListaFragment lista = new ProdutoListaFragment(); //cria fragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction(); //cria transação

        transaction.add(R.id.idframe, lista); //add fragmento
        transaction.commit();//valida adição

    }
    public void primeiraTela(View view){
        getSupportFragmentManager().beginTransaction().//cria transacao
                replace(R.id.idframe,new ProdutoListaFragment())//add fragmento
                .commit();//valida a adição
    }
    public void segundaTela(View view){
        getSupportFragmentManager().beginTransaction().//cria transacao
                replace(R.id.idframe,new CadastroProdutoFragment())//add fragmento
                .commit();//valida a adição
    }
}