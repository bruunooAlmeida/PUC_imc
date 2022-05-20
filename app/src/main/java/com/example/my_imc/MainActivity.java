package com.example.my_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1EditText;
    EditText num2EditText;
    EditText resulstadoEditText;
    TextView classEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1EditText = findViewById(R.id.num1EditText);
        num2EditText = findViewById(R.id.num2EditText);
        resulstadoEditText = findViewById(R.id.resultadoEditText);
    }
    protected float getNumFromEditText(int id) {
        String aux;
        if(id == 1){
            aux = num1EditText.getText().toString();
        }else{
            aux = num2EditText.getText().toString();
        }
        return Float.parseFloat(aux);
    }
    public void resultadoButtonOnClick(View v){
        float num1 = getNumFromEditText(1);
        float num2 = getNumFromEditText(2);
        if(num1 <= 0 || num2 <=0 ){
            Toast.makeText(getApplicationContext(),
                            "Dados Errados!",
                            Toast.LENGTH_LONG)
                    .show();
        }
        float result = num2 / (num1 * num1);
        resulstadoEditText.setText(String.valueOf(result));
        if(result >= 30 ){
            Toast.makeText(getApplicationContext(),
                            "Cuidado com a Saúde.",
                            Toast.LENGTH_LONG)
                    .show();
        }

    }

}