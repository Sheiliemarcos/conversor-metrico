package com.example.conversormetrico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btn_convert);
        button.setOnClickListener(v -> {
            EditText jardas = findViewById(R.id.input_jardas);
            TextView result = (TextView)findViewById(R.id.txtViewResult);

            if (jardas != null) {
                double valor = Double.parseDouble(jardas.getText().toString());
                valor = (valor * 91.44);
                String message = String.format(Locale.getDefault(),"São %.2f centimetros.", valor );

                result.setText(message);
            } else {
                CharSequence text = "Deve inserir um valor válido!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(), text, duration).show();
            }
        });
    }
}