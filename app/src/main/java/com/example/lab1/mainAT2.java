package com.example.lab1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainAT2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_at2); // Define o layout para a atividade

        // Configura o botão para fechar a atividade atual e voltar para a anterior
        Button btnGoBack = findViewById(R.id.closeButton);
        btnGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Fecha a atividade AT2
            }
        });
    }
}
