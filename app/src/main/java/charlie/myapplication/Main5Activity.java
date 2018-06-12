package charlie.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button home = (Button) findViewById(R.id.button2);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(),Main2Activity.class);
                finish();
                startActivity(startintent);

            }
        });

        final EditText keyamount = (EditText) findViewById(R.id.keyamount);
        final Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        final Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        Button convert = (Button) findViewById(R.id.button1);
        final TextView result = (TextView) findViewById(R.id.textView);


        //load
        SharedPreferences sharedPref1 = getSharedPreferences("data3",MODE_PRIVATE);
        int spinnerValue1 = sharedPref1.getInt("userChoiceSpinner1",-1);
        spinner1.setSelection(spinnerValue1);
        SharedPreferences sharedPref2 = getSharedPreferences("data3",MODE_PRIVATE);
        int spinnerValue2 = sharedPref2.getInt("userChoiceSpinner2",-1);
        spinner2.setSelection(spinnerValue2);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num = keyamount.getText().toString();
                String spinner01 = spinner1.getSelectedItem().toString();
                String spinner02 = spinner2.getSelectedItem().toString();
                int num1 = Integer.parseInt(num);


                if (spinner01.equals("Celsius") && spinner02.equals("Celsius")) {
                    double value = num1 * 1;
                    result.setText(value + "℃");
                }
                if (spinner01.equals("Celsius") && spinner02.equals("Fahrenheit")) {
                    double value = num1 * 1.8 + 32;
                    result.setText(value + "°F");
                }
                if (spinner01.equals("Celsius") && spinner02.equals("Kelvin")) {
                    double value = num1 +  273.15;
                    result.setText(value + "K");
                }


                //2
                if (spinner01.equals("Fahrenheit") && spinner02.equals("Celsius")) {
                    double value = num1-32;
                    double value2 = value * 0.5556;
                    result.setText(value2 + "℃ ");
                }
                if (spinner01.equals("Fahrenheit") && spinner02.equals("Fahrenheit")) {
                    double value = num1 * 1;
                    result.setText(value + "°F");
                }
                if (spinner01.equals("Fahrenheit") && spinner02.equals("Kelvin")) {
                    double value = num1+459.67 ;
                    double value2 = value*5;
                    double value3 = value2 / 9;
                    result.setText(value3+ "K");
                }


                //3
                if (spinner01.equals("Kelvin") && spinner02.equals("Celsius")) {
                    double value = num1 - 273.15;
                    result.setText(value + "℃ ");
                }
                if (spinner01.equals("Kelvin") && spinner02.equals("Fahrenheit")) {
                    double value = num1 - 273;
                    double value2 = 1.8 * value ;
                    double value3 = value2 + 32 ;
                    result.setText(value3 + "°F");
                }
                if (spinner01.equals("Kelvin") && spinner02.equals("Kelvin")) {
                    double value = num1 * 1;
                    result.setText(value + "K");
                }

                //save
                int choice1 = spinner1.getSelectedItemPosition();
                SharedPreferences sharedPref1 = getSharedPreferences("data3",0);
                SharedPreferences.Editor prefEditor1 = sharedPref1.edit();
                prefEditor1.putInt("userChoiceSpinner1",choice1);
                prefEditor1.apply();
                int choice2 = spinner2.getSelectedItemPosition();
                SharedPreferences sharedPref2 = getSharedPreferences("data3",0);
                SharedPreferences.Editor prefEditor2 = sharedPref1.edit();
                prefEditor2.putInt("userChoiceSpinner2",choice2);
                prefEditor2.apply();











            }









        });




    }
}
