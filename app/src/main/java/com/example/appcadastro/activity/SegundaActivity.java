package com.example.appcadastro.activity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.appcadastro.R;
import com.example.appcadastro.fragmento.CadastroClienteFragment;
import com.example.appcadastro.fragmento.ClienteListaFragment;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        setResult(80);

        ClienteListaFragment lista = new ClienteListaFragment(); //cria fragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction(); //cria transação

        transaction.add(R.id.idframe, lista); //add fragmento
        transaction.commit();//valida adição

    }
    public void primeiraTela(View view){
        getSupportFragmentManager().beginTransaction().//cria transacao
                replace(R.id.idframe,new ClienteListaFragment())//add fragmento
                .commit();//valida a adição
    }
    public void segundaTela(View view){
        getSupportFragmentManager().beginTransaction().//cria transacao
                replace(R.id.idframe,new CadastroClienteFragment())//add fragmento
                .commit();//valida a adição
    }
}