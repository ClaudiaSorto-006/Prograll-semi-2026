package com.example.miprimeraapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
TextView tempVal;

Button btn;

RadioGroup radioGroup;
RadioButton opt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnCalcular);
        btn.setOnClickListener(v -> calcular());

    }

    private void calcular() {
        tempVal = findViewById(R.id.txtNum1);
        Double Num1 = Double.parseDouble(tempVal.getText().toString());

        tempVal = findViewById(R.id.txtNum2);
        Double Num2 = Double.parseDouble(tempVal.getText().toString());

        double respuesta = 0;

        radioGroup = findViewById(R.id.optOpciones);

        tempVal = findViewById(R.id.lblRespuesta);

        switch (radioGroup.getCheckedRadioButtonId()){
            case R.id.optSuma:
                 respuesta = Num1 + Num2;
                 break;
            case  R.id.optResta:
                respuesta = Num1 - Num2;
                case  R.id.optMultiplicar:
                    respuesta = Num1 * Num2;
                    break;
            case  R.id.optDividir:
                respuesta = Num1 / Num2;
                break;
             case  R.id.optMultiplicar:
                respuesta = Num1 * Num2;
                break;
            case  R.id.optPorcentaje:
                respuesta = Num1 * Num2/ 100;
                break;
            case  R.id.optFactorial:
                double factNum1 = factorial(Num1);
                double factNum2 = factorial(Num2);
                tempVal.setText("el facotiral de:" + Num1 + "es " +factNum1 +
                                "\nFactorial de " + Num2 + "es " +factNum2);
                return;
                break;
            case  R.id.optExponenciacion:
                respuesta =  Num1 / Num2;
                break;
            case  R.id.optRaiz:
                respuesta =  Num1 / Num2;
                break;



        }



        tempVal.setText("Respuesta:" + respuesta);
    }
    public double factorial(double numero){
        double resultado = 1;
        for (int i = 1; i <= numero; i++){
            resultado *= i;
        }
        return resultado;
    }
};
