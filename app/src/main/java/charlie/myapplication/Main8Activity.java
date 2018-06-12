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

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

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
                    Toast.makeText(Main8Activity.this, "Invalid Input", Toast.LENGTH_LONG).show();
                }else {

                    //
                    if (spinner01.equals("Bit") && spinner02.equals("Bit")) {
                        double value = num1 * 1;
                        result.setText(value + "Bit");
                    }
                    if (spinner01.equals("Bit") && spinner02.equals("Byte")) {
                        double value = num1 *  0.125;
                        result.setText(value + "B");
                    }
                    if (spinner01.equals("Bit") && spinner02.equals("Kilobyte")) {
                        double value = num1 * 0.000125;
                        result.setText(value + "KB");
                    }
                    if (spinner01.equals("Bit") && spinner02.equals("Megabyte")) {
                        double value = num1 * 0.000000125;
                        result.setText(value + "MB");
                    }
                    if (spinner01.equals("Bit") && spinner02.equals("Gigabyte")) {
                        double value = num1 * 0.000000000125;
                        result.setText(value + "GB");
                    }
                    if (spinner01.equals("Bit") && spinner02.equals("Terabyte")) {
                        double value = num1 * 0.000000000000125;
                        result.setText(value + "TB");
                    }


                    //
                    if (spinner01.equals("Byte") && spinner02.equals("Bit")) {
                        double value = num1 *  8;
                        result.setText(value + "Bit");
                    }
                    if (spinner01.equals("Byte") && spinner02.equals("Byte")) {
                        double value = num1 * 1;
                        result.setText(value + "B");
                    }
                    if (spinner01.equals("Byte") && spinner02.equals("Kilobyte")) {
                        double value = num1 * 0.001 ;
                        result.setText(value + "KB");
                    }
                    if (spinner01.equals("Byte") && spinner02.equals("Megabyte")) {
                        double value = num1 * 0.000001;
                        result.setText(value + "MB");
                    }
                    if (spinner01.equals("Byte") && spinner02.equals("Gigabyte")) {
                        double value = num1 * 0.000000001;
                        result.setText(value + "GB");
                    }
                    if (spinner01.equals("Byte") && spinner02.equals("Terabyte")) {
                        double value = num1 * 0.000000000001;
                        result.setText(value + "TB");
                    }


                    //
                    if (spinner01.equals("Kilobyte") && spinner02.equals("Bit")) {
                        double value = num1 *  8000;
                        result.setText(value + "Bit");
                    }
                    if (spinner01.equals("Kilobyte") && spinner02.equals("Byte")) {
                        double value = num1 * 1000;
                        result.setText(value + "B");
                    }
                    if (spinner01.equals("Kilobyte") && spinner02.equals("Kilobyte")) {
                        double value = num1 * 1;
                        result.setText(value + "KB");
                    }
                    if (spinner01.equals("Kilobyte") && spinner02.equals("Megabyte")) {
                        double value = num1 * 0.001;
                        result.setText(value + "MB");
                    }
                    if (spinner01.equals("Kilobyte") && spinner02.equals("Gigabyte")) {
                        double value = num1 * 0.000001;
                        result.setText(value + "GB");
                    }
                    if (spinner01.equals("Kilobyte") && spinner02.equals("Terabyte")) {
                        double value = num1 * 0.000000001;
                        result.setText(value + "TB");
                    }


                    //
                    if (spinner01.equals("Megabyte") && spinner02.equals("Bit")) {
                        double value = num1 *  8000000;
                        result.setText(value + "Bit");
                    }
                    if (spinner01.equals("Megabyte") && spinner02.equals("Byte")) {
                        double value = num1 * 1000000;
                        result.setText(value + "B");
                    }
                    if (spinner01.equals("Megabyte") && spinner02.equals("Kilobyte")) {
                        double value = num1 * 1000;
                        result.setText(value + "KB");
                    }
                    if (spinner01.equals("Megabyte") && spinner02.equals("Megabyte")) {
                        double value = num1 * 1;
                        result.setText(value + "MB");
                    }
                    if (spinner01.equals("Megabyte") && spinner02.equals("Gigabyte")) {
                        double value = num1 * 0.001;
                        result.setText(value + "GB");
                    }
                    if (spinner01.equals("Megabyte") && spinner02.equals("Terabyte")) {
                        double value = num1 * 0.000001;
                        result.setText(value + "TB");
                    }


                    //
                    if (spinner01.equals("Gigabyte") && spinner02.equals("Bit")) {
                        double value = num1 * 0 ;
                        result.setText("Invalid Calculation");
                    }
                    if (spinner01.equals("Gigabyte") && spinner02.equals("Byte")) {
                        double value = num1 * 1073741824;
                        result.setText(value + "B");
                    }
                    if (spinner01.equals("Gigabyte") && spinner02.equals("Kilobyte")) {
                        double value = num1 * 1048576;
                        result.setText(value + "KB");
                    }
                    if (spinner01.equals("Gigabyte") && spinner02.equals("Megabyte")) {
                        double value = num1 * 1024;
                        result.setText(value + "MB");
                    }
                    if (spinner01.equals("Gigabyte") && spinner02.equals("Gigabyte")) {
                        double value = num1 * 1;
                        result.setText(value + "GB");
                    }
                    if (spinner01.equals("Gigabyte") && spinner02.equals("Terabyte")) {
                        double value = num1 * 0.0009765625;
                        result.setText(value + "TB");
                    }


                    //
                    if (spinner01.equals("Terabyte") && spinner02.equals("Bit")) {
                        double value = num1 * 0;
                        result.setText("Invalid Calculation");
                    }
                    if (spinner01.equals("Terabyte") && spinner02.equals("Byte")) {
                        double value = num1 * 0;
                        result.setText("Invalid Calculation");
                    }
                    if (spinner01.equals("Terabyte") && spinner02.equals("Kilobyte")) {
                        double value = num1 * 1073741824 ;
                        result.setText(value + "KB");
                    }
                    if (spinner01.equals("Terabyte") && spinner02.equals("Megabyte")) {
                        double value = num1 * 1048576 ;
                        result.setText(value + "MB");
                    }
                    if (spinner01.equals("Terabyte") && spinner02.equals("Gigabyte")) {
                        double value = num1 * 1024;
                        result.setText(value + "GB");
                    }
                    if (spinner01.equals("Terabyte") && spinner02.equals("Terabyte")) {
                        double value = num1 * 1;
                        result.setText(value + "TB");
                    }
                }
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
