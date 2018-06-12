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
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Button home = (Button) findViewById(R.id.button2);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), Main2Activity.class);
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
        SharedPreferences sharedPref1 = getSharedPreferences("data4",MODE_PRIVATE);
        int spinnerValue1 = sharedPref1.getInt("userChoiceSpinner1",-1);
        spinner1.setSelection(spinnerValue1);
        SharedPreferences sharedPref2 = getSharedPreferences("data4",MODE_PRIVATE);
        int spinnerValue2 = sharedPref2.getInt("userChoiceSpinner2",-1);
        spinner2.setSelection(spinnerValue2);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num = keyamount.getText().toString();
                String spinner01 = spinner1.getSelectedItem().toString();
                String spinner02 = spinner2.getSelectedItem().toString();
                int num1 = Integer.parseInt(num);

                if (num1 <= 0) {
                    Toast.makeText(Main6Activity.this, "Invalid Input", Toast.LENGTH_LONG).show();
                } else {
                    if (spinner01.equals("Kilogram") && spinner02.equals("Pound")) {
                        double value = num1 * 2.204;
                        result.setText(value + "lb");
                    }
                    if (spinner01.equals("Kilogram") && spinner02.equals("Gram")) {
                        double value = num1 * 1000;
                        result.setText(value + "g");
                    }
                    if (spinner01.equals("Kilogram") && spinner02.equals("Milligram")) {
                        double value = num1 * 1000000;
                        result.setText(value + "mg");
                    }
                    if (spinner01.equals("Kilogram") && spinner02.equals("Kilogram")) {
                        double value = num1 * 1;
                        result.setText(value + "kg");
                    }
                    if (spinner01.equals("Kilogram") && spinner02.equals("Ounce")) {
                        double value = num1 * 35.27396195;
                        result.setText(value + "oz");
                    }
                    if (spinner01.equals("Kilogram") && spinner02.equals("Tonne")) {
                        double value = num1 / 1000;
                        result.setText(value + "t");
                    }


                    //
                    if (spinner01.equals("Gram") && spinner02.equals("Pound")) {
                        double value = num1 / 453.592 ;
                        result.setText(value + "lb");
                    }
                    if (spinner01.equals("Gram") && spinner02.equals("Gram")) {
                        double value = num1 * 1;
                        result.setText(value + "g");
                    }
                    if (spinner01.equals("Gram") && spinner02.equals("Milligram")) {
                        double value = num1 * 1000;
                        result.setText(value + "mg");
                    }
                    if (spinner01.equals("Gram") && spinner02.equals("Kilogram")) {
                        double value = num1 / 1000;
                        result.setText(value + "kg");
                    }
                    if (spinner01.equals("Gram") && spinner02.equals("Ounce")) {
                        double value = num1 / 28.349;
                        result.setText(value + "oz");
                    }
                    if (spinner01.equals("Gram") && spinner02.equals("Tonne")) {
                        double value = num1 * 0.00000100;
                        result.setText(value + "t");
                    }

                    //
                    if (spinner01.equals("Milligram") && spinner02.equals("Pound")) {
                        double value = num1 * 0.000002204622622 ;
                        result.setText(value + "lb");
                    }
                    if (spinner01.equals("Milligram") && spinner02.equals("Gram")) {
                        double value = num1 / 1000;
                        result.setText(value + "g");
                    }
                    if (spinner01.equals("Milligram") && spinner02.equals("Milligram")) {
                        double value = num1 * 1;
                        result.setText(value + "mg");
                    }
                    if (spinner01.equals("Milligram") && spinner02.equals("Kilogram")) {
                        double value = num1 / 1000000;
                        result.setText(value + "kg");
                    }
                    if (spinner01.equals("Milligram") && spinner02.equals("Ounce")) {
                        double value = num1 * 0.000035274;
                        result.setText(value + "oz");
                    }
                    if (spinner01.equals("Milligram") && spinner02.equals("Tonne")) {
                        double value = num1 * 1.0E-9 ;
                        result.setText(value + "t");
                    }

                    //
                    if (spinner01.equals("Pound") && spinner02.equals("Pound")) {
                        double value = num1 * 1 ;
                        result.setText(value + "lb");
                    }
                    if (spinner01.equals("Pound") && spinner02.equals("Gram")) {
                        double value = num1 * 453.59237 ;
                        result.setText(value + "g");
                    }
                    if (spinner01.equals("Pound") && spinner02.equals("Milligram")) {
                        double value = num1 * 453592;
                        result.setText(value + "mg");
                    }
                    if (spinner01.equals("Pound") && spinner02.equals("Kilogram")) {
                        double value = num1 * 0.45359237;
                        result.setText(value + "kg");
                    }
                    if (spinner01.equals("Pound") && spinner02.equals("Ounce")) {
                        double value = num1 * 16;
                        result.setText(value + "oz");
                    }
                    if (spinner01.equals("Pound") && spinner02.equals("Tonne")) {
                        double value = num1 * 0.00045359237 ;
                        result.setText(value + "t");
                    }

                    //
                    if (spinner01.equals("Ounce") && spinner02.equals("Pound")) {
                        double value = num1 / 16 ;
                        result.setText(value + "lb");
                    }
                    if (spinner01.equals("Ounce") && spinner02.equals("Gram")) {
                        double value = num1 * 28.34952 ;
                        result.setText(value + "g");
                    }
                    if (spinner01.equals("Ounce") && spinner02.equals("Milligram")) {
                        double value = num1 * 28349.5;
                        result.setText(value + "mg");
                    }
                    if (spinner01.equals("Ounce") && spinner02.equals("Kilogram")) {
                        double value = num1 * 0.02834952;
                        result.setText(value + "kg");
                    }
                    if (spinner01.equals("Ounce") && spinner02.equals("Ounce")) {
                        double value = num1 * 1;
                        result.setText(value + "oz");
                    }
                    if (spinner01.equals("Ounce") && spinner02.equals("Tonne")) {
                        double value = num1 * 0.0000283495 ;
                        result.setText(value + "t");
                    }


                    //
                    if (spinner01.equals("Tonne") && spinner02.equals("Pound")) {
                        double value = num1 / 0.00045359237 ;
                        result.setText(value + "lb");
                    }
                    if (spinner01.equals("Tonne") && spinner02.equals("Gram")) {
                        double value = num1 * 1000000 ;
                        result.setText(value + "g");
                    }
                    if (spinner01.equals("Tonne") && spinner02.equals("Milligram")) {
                        double value = num1 * 0.0000000010000;
                        result.setText(value + "mg");
                    }
                    if (spinner01.equals("Tonne") && spinner02.equals("Kilogram")) {
                        double value = num1 * 1000;
                        result.setText(value + "kg");
                    }
                    if (spinner01.equals("Tonne") && spinner02.equals("Ounce")) {
                        double value = num1 * 32000;
                        result.setText(value + "oz");
                    }
                    if (spinner01.equals("Tonne") && spinner02.equals("Tonne")) {
                        double value = num1 * 1 ;
                        result.setText(value + "t");
                    }

                }

                //save
                int choice1 = spinner1.getSelectedItemPosition();
                SharedPreferences sharedPref1 = getSharedPreferences("data4",0);
                SharedPreferences.Editor prefEditor1 = sharedPref1.edit();
                prefEditor1.putInt("userChoiceSpinner1",choice1);
                prefEditor1.apply();
                int choice2 = spinner2.getSelectedItemPosition();
                SharedPreferences sharedPref2 = getSharedPreferences("data4",0);
                SharedPreferences.Editor prefEditor2 = sharedPref1.edit();
                prefEditor2.putInt("userChoiceSpinner2",choice2);
                prefEditor2.apply();




            }






        });




    }
}
