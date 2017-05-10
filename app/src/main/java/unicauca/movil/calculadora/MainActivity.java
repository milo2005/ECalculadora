package unicauca.movil.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView resultado;
    EditText num1, num2;
    Button btnSum, btnRest, btnDiv, btnMul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.numero1);
        num2 = (EditText) findViewById(R.id.numero2);
        btnSum = (Button) findViewById(R.id.btnSumar);
        btnRest = (Button) findViewById(R.id.btnRest);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        resultado = (TextView) findViewById(R.id.rta);

        btnSum.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnRest.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String n1S =  "0"+num1.getText().toString();
        String n2S = "0"+num2.getText().toString();

        int n1 = Integer.parseInt(n1S);
        int n2 = Integer.parseInt(n2S);
        int result = 0;

        switch (v.getId()){
            case R.id.btnSumar:
                result = n1 + n2;
                break;
            case R.id.btnRest:
                result = n1 - n2;
                break;
            case R.id.btnMul:
                result = n1 * n2;
                break;
            case R.id.btnDiv:
                result = n1 / n2;
                break;
        }

        resultado.setText(""+result);

    }
}
