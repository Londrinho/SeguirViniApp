package br.digitalhouse.seguirviniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button botaoSeguir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoSeguir = findViewById(R.id.botao_seguir);

        botaoSeguir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Agora você está seguindo Vinícius!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
