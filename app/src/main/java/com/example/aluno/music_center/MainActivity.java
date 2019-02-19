package com.example.aluno.music_center;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText opcao;
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        opcao = findViewById(R.id.editText);
        botao = findViewById(R.id.botao);

    }

    public void Clicar(View view) {

        String resposta = opcao.getText().toString();

        if ((resposta.equals("cordas")) || (resposta.equals("Cordas")))
            setContentView(R.layout.activity_cordas);

        if ((resposta.equals("Sopro")) || (resposta.equals("sopro")))
            setContentView(R.layout.activity_sopro);

        if ((resposta.equals("teclas")) || (resposta.equals("Teclas")))
            setContentView(R.layout.activity_teclas);


        if (((!resposta.equals("cordas")) && (!resposta.equals("Cordas"))) && ((!resposta.equals("Teclas")) && (!resposta.equals("teclas"))) && ((!resposta.equals("sopro")) && (!resposta.equals("Sopro"))))
            Toast.makeText(getApplicationContext(), "Você não digitou sua opção corretamente!", Toast.LENGTH_LONG).show();
    }
}