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

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

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
                    Toast.makeText(Main7Activity.this, "Invalid Input", Toast.LENGTH_LONG).show();
                }else{


                    //
                    if (spinner01.equals("Century") && spinner02.equals("Century")) {
                        double value = num1 * 1 ;
                        result.setText(value + "C");
                    }
                    if (spinner01.equals("Century") && spinner02.equals("Calender Year")) {
                        double value = num1 * 100;
                        result.setText(value + "Year");
                    }
                    if (spinner01.equals("Century") && spinner02.equals("Month")) {
                        double value = num1 * 1200;
                        result.setText(value + "Month");
                    }
                    if (spinner01.equals("Century") && spinner02.equals("Week")) {
                        double value = num1 * 5214.29;
                        result.setText(value + "Week");
                    }
                    if (spinner01.equals("Century") && spinner02.equals("Day")) {
                        double value = num1 * 36500;
                        result.setText(value + "Day");
                    }
                    if (spinner01.equals("Century") && spinner02.equals("Hour")) {
                        double value = num1 * 876000;
                        result.setText(value + "Hour");
                    }
                    if (spinner01.equals("Century") && spinner02.equals("Minute")) {
                        double value = num1 * 52594920;
                        result.setText(value + "Minute");
                    }
                    if (spinner01.equals("Century") && spinner02.equals("Second")) {
                        double value = num1 * 0;
                        result.setText("Invalid Calculation");
                    }
                    if (spinner01.equals("Century") && spinner02.equals("Millisecond")) {
                        double value = num1 * 0;
                        result.setText("Invalid Calculation");
                    }

                    //

                    if (spinner01.equals("Calender Year") && spinner02.equals("Century")) {
                        double value = num1 * 0.01;
                        result.setText(value + "C");
                    }
                    if (spinner01.equals("Calender Year") && spinner02.equals("Calender Year")) {
                        double value = num1 * 1 ;
                        result.setText(value + "Year");
                    }
                    if (spinner01.equals("Calender Year") && spinner02.equals("Month")) {
                        double value = num1 * 12;
                        result.setText(value + "Month");
                    }
                    if (spinner01.equals("Calender Year") && spinner02.equals("Week")) {
                        double value = num1 * 52.1775;
                        result.setText(value + "Week");
                    }
                    if (spinner01.equals("Calender Year") && spinner02.equals("Day")) {
                        double value = num1 * 365;
                        result.setText(value + "Day");
                    }
                    if (spinner01.equals("Calender Year") && spinner02.equals("Hour")) {
                        double value = num1 * 8765.82;
                        result.setText(value + "Hour");
                    }
                    if (spinner01.equals("Calender Year") && spinner02.equals("Minute")) {
                        double value = num1 * 525949.2 ;
                        result.setText(value + "Minute");
                    }
                    if (spinner01.equals("Calender Year") && spinner02.equals("Second")) {
                        double value = num1 * 31556952;
                        result.setText(value + "Second");
                    }
                    if (spinner01.equals("Calender Year") && spinner02.equals("Millisecond")) {
                        double value = num1 * 0 ;
                        result.setText(value + "Invalid Calculation");
                    }


                    //
                    if (spinner01.equals("Month") && spinner02.equals("Century")) {
                        double value = num1 * 0.000833333;
                        result.setText(value + "C");
                    }
                    if (spinner01.equals("Month") && spinner02.equals("Calender Year")) {
                        double value = num1 * 0.0833333;
                        result.setText(value + "Year");
                    }
                    if (spinner01.equals("Month") && spinner02.equals("Month")) {
                        double value = num1 * 1 ;
                        result.setText(value + "Month");
                    }
                    if (spinner01.equals("Month") && spinner02.equals("Week")) {
                        double value = num1 * 4.348125;
                        result.setText(value + "Week");
                    }
                    if (spinner01.equals("Month") && spinner02.equals("Day")) {
                        double value = num1 * 30.436875;
                        result.setText(value + "Day");
                    }
                    if (spinner01.equals("Month") && spinner02.equals("Hour")) {
                        double value = num1 * 730.485;
                        result.setText(value + "Hour");
                    }
                    if (spinner01.equals("Month") && spinner02.equals("Minute")) {
                        double value = num1 * 43829.1;
                        result.setText(value + "Minute");
                    }
                    if (spinner01.equals("Month") && spinner02.equals("Second")) {
                        double value = num1 * 2629746 ;
                        result.setText(value + "Second");
                    }
                    if (spinner01.equals("Month") && spinner02.equals("Millisecond")) {
                        double value = num1 * 0;
                        result.setText("Invalid Calculation");
                    }


                    //
                    if (spinner01.equals("Week") && spinner02.equals("Century")) {
                        double value = num1 * 0.000191653;
                        result.setText(value + "C");
                    }
                    if (spinner01.equals("Week") && spinner02.equals("Calender Year")) {
                        double value = num1 * 0.0191653;
                        result.setText(value + "Year");
                    }
                    if (spinner01.equals("Week") && spinner02.equals("Month")) {
                        double value = num1 * 0.229984 ;
                        result.setText(value + "Month");
                    }
                    if (spinner01.equals("Week") && spinner02.equals("Week")) {
                        double value = num1 * 1;
                        result.setText(value + "Week");
                    }
                    if (spinner01.equals("Week") && spinner02.equals("Day")) {
                        double value = num1 * 7;
                        result.setText(value + "Day");
                    }
                    if (spinner01.equals("Week") && spinner02.equals("Hour")) {
                        double value = num1 * 168;
                        result.setText(value + "Hour");
                    }
                    if (spinner01.equals("Week") && spinner02.equals("Minute")) {
                        double value = num1 * 10080;
                        result.setText(value + "Minute");
                    }
                    if (spinner01.equals("Week") && spinner02.equals("Second")) {
                        double value = num1 * 604800;
                        result.setText(value + "Second");
                    }
                    if (spinner01.equals("Week") && spinner02.equals("Millisecond")) {
                        double value = num1 * 604800000;
                        result.setText(value + "Ms");
                    }


                    //
                    if (spinner01.equals("Day") && spinner02.equals("Century")) {
                        double value = num1 * 0.0000273791 ;
                        result.setText(value + "C");
                    }
                    if (spinner01.equals("Day") && spinner02.equals("Calender Year")) {
                        double value = num1 * 0.00273791 ;
                        result.setText(value + "Year");
                    }
                    if (spinner01.equals("Day") && spinner02.equals("Month")) {
                        double value = num1 * 0.0328549;
                        result.setText(value + "Month");
                    }
                    if (spinner01.equals("Day") && spinner02.equals("Week")) {
                        double value = num1 * 0.142857 ;
                        result.setText(value + "Week");
                    }
                    if (spinner01.equals("Day") && spinner02.equals("Day")) {
                        double value = num1 * 1;
                        result.setText(value + "Day");
                    }
                    if (spinner01.equals("Day") && spinner02.equals("Hour")) {
                        double value = num1 * 24;
                        result.setText(value + "Hour");
                    }
                    if (spinner01.equals("Day") && spinner02.equals("Minute")) {
                        double value = num1 * 1440;
                        result.setText(value + "Minute");
                    }
                    if (spinner01.equals("Day") && spinner02.equals("Second")) {
                        double value = num1 * 86400;
                        result.setText(value + "Second");
                    }
                    if (spinner01.equals("Day") && spinner02.equals("Millisecond")) {
                        double value = num1 * 86400000;
                        result.setText(value + "Ms");
                    }


                    //
                    if (spinner01.equals("Hour") && spinner02.equals("Century")) {
                        double value = num1 * 0.00000114079 ;
                        result.setText(value + "C");
                    }
                    if (spinner01.equals("Hour") && spinner02.equals("Calender Year")) {
                        double value = num1 * 0.000114079;
                        result.setText(value + "Year");
                    }
                    if (spinner01.equals("Hour") && spinner02.equals("Month")) {
                        double value = num1 * 0.00136895;
                        result.setText(value + "Month");
                    }
                    if (spinner01.equals("Hour") && spinner02.equals("Week")) {
                        double value = num1 * 0.00595238;
                        result.setText(value + "Week");
                    }
                    if (spinner01.equals("Hour") && spinner02.equals("Day")) {
                        double value = num1 * 0.0416667 ;
                        result.setText(value + "Day");
                    }
                    if (spinner01.equals("Hour") && spinner02.equals("Hour")) {
                        double value = num1 * 1;
                        result.setText(value + "Hour");
                    }
                    if (spinner01.equals("Hour") && spinner02.equals("Minute")) {
                        double value = num1 * 60;
                        result.setText(value + "Minute");
                    }
                    if (spinner01.equals("Hour") && spinner02.equals("Second")) {
                        double value = num1 * 3600 ;
                        result.setText(value + "Second");
                    }
                    if (spinner01.equals("Hour") && spinner02.equals("Millisecond")) {
                        double value = num1 * 3600000;
                        result.setText(value + "Ms");
                    }


                    //
                    if (spinner01.equals("Minute") && spinner02.equals("Century")) {
                        double value = num1 * 0.0000000190132;
                        result.setText(value + "C");
                    }
                    if (spinner01.equals("Minute") && spinner02.equals("Calender Year")) {
                        double value = num1 * 0.00000190132;
                        result.setText(value + "Year");
                    }
                    if (spinner01.equals("Minute") && spinner02.equals("Month")) {
                        double value = num1 * 0.0000228159;
                        result.setText(value + "Month");
                    }
                    if (spinner01.equals("Minute") && spinner02.equals("Week")) {
                        double value = num1 * 0.0000992063;
                        result.setText(value + "Week");
                    }
                    if (spinner01.equals("Minute") && spinner02.equals("Day")) {
                        double value = num1 * 0.000694444;
                        result.setText(value + "Day");
                    }
                    if (spinner01.equals("Minute") && spinner02.equals("Hour")) {
                        double value = num1 * 0.0166667 ;
                        result.setText(value + "Hour");
                    }
                    if (spinner01.equals("Minute") && spinner02.equals("Minute")) {
                        double value = num1 * 1;
                        result.setText(value + "Minute");
                    }
                    if (spinner01.equals("Minute") && spinner02.equals("Second")) {
                        double value = num1 * 60;
                        result.setText(value + "Second");
                    }
                    if (spinner01.equals("Minute") && spinner02.equals("Millisecond")) {
                        double value = num1 * 60000;
                        result.setText(value + "Ms");
                    }


                    //
                    if (spinner01.equals("Second") && spinner02.equals("Century")) {
                        double value = num1 * 0.000000000316887 ;
                        result.setText(value + "C");
                    }
                    if (spinner01.equals("Second") && spinner02.equals("Calender Year")) {
                        double value = num1 * 0.0000000316887;
                        result.setText(value + "Year");
                    }
                    if (spinner01.equals("Second") && spinner02.equals("Month")) {
                        double value = num1 * 0.000000380265;
                        result.setText(value + "Month");
                    }
                    if (spinner01.equals("Second") && spinner02.equals("Week")) {
                        double value = num1 * 0.00000165344;
                        result.setText(value + "Week");
                    }
                    if (spinner01.equals("Second") && spinner02.equals("Day")) {
                        double value = num1 * 0.0000115741;
                        result.setText(value + "Day");
                    }
                    if (spinner01.equals("Second") && spinner02.equals("Hour")) {
                        double value = num1 * 0.000277778;
                        result.setText(value + "Hour");
                    }
                    if (spinner01.equals("Second") && spinner02.equals("Minute")) {
                        double value = num1 * 0.0166667;
                        result.setText(value + "Minute");
                    }
                    if (spinner01.equals("Second") && spinner02.equals("Second")) {
                        double value = num1 * 1;
                        result.setText(value + "Second");
                    }
                    if (spinner01.equals("Second") && spinner02.equals("Millisecond")) {
                        double value = num1 * 1000;
                        result.setText(value + "Ms");
                    }



                    //
                    if (spinner01.equals("Millisecond") && spinner02.equals("Century")) {
                        double value = num1 * 0.000000000000316887;
                        result.setText(value + "C");
                    }
                    if (spinner01.equals("Millisecond") && spinner02.equals("Calender Year")) {
                        double value = num1 * 0.0000000000316887;
                        result.setText(value + "Year");
                    }
                    if (spinner01.equals("Millisecond") && spinner02.equals("Month")) {
                        double value = num1 * 0.000000000380265;
                        result.setText(value + "Month");
                    }
                    if (spinner01.equals("Millisecond") && spinner02.equals("Week")) {
                        double value = num1 * 0.00000000165344;
                        result.setText(value + "Week");
                    }
                    if (spinner01.equals("Millisecond") && spinner02.equals("Day")) {
                        double value = num1 * 0.0000000115741;
                        result.setText(value + "Day");
                    }
                    if (spinner01.equals("Millisecond") && spinner02.equals("Hour")) {
                        double value = num1 * 0.000000277778;
                        result.setText(value + "Hour");
                    }
                    if (spinner01.equals("Millisecond") && spinner02.equals("Minute")) {
                        double value = num1 * 0.0000166667;
                        result.setText(value + "Minute");
                    }
                    if (spinner01.equals("Millisecond") && spinner02.equals("Second")) {
                        double value = num1 * 0.001 ;
                        result.setText(value + "Second");
                    }
                    if (spinner01.equals("Millisecond") && spinner02.equals("Millisecond")) {
                        double value = num1 * 1;
                        result.setText(value + "Ms");
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
