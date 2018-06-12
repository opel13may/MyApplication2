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

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

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
        SharedPreferences sharedPref1 = getSharedPreferences("data2",MODE_PRIVATE);
        int spinnerValue1 = sharedPref1.getInt("userChoiceSpinner1",-1);
        spinner1.setSelection(spinnerValue1);
        SharedPreferences sharedPref2 = getSharedPreferences("data2",MODE_PRIVATE);
        int spinnerValue2 = sharedPref2.getInt("userChoiceSpinner2",-1);
        spinner2.setSelection(spinnerValue2);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num = keyamount.getText().toString();
                String spinner01 = spinner1.getSelectedItem().toString();
                String spinner02 = spinner2.getSelectedItem().toString();
                int num1 = Integer.parseInt(num);


                if (num1 <= 0){
                    Toast.makeText(Main4Activity.this,"Invalid Input",Toast.LENGTH_LONG).show();
                }

                //1
                else{
                    if(spinner01.equals("Kilometer") && spinner02.equals("Kilometer")){
                        double value = num1 * 1;
                        result.setText(value+"KM");
                    }
                    if(spinner01.equals("Kilometer") && spinner02.equals("Meter")){
                        double value = num1 * 1000;
                        result.setText(value+"M");
                    }
                    if(spinner01.equals("Kilometer") && spinner02.equals("Centimeter")){
                        double value = num1 * 100000;
                        result.setText(value+"CM");
                    }
                    if(spinner01.equals("Kilometer") && spinner02.equals("Millimeter")){
                        double value = num1 * 1000000;
                        result.setText(value+"MM");
                    }
                    if(spinner01.equals("Kilometer") && spinner02.equals("Mile")){
                        double value = num1 * 0.62137;
                        result.setText(value+"mile");
                    }
                    if(spinner01.equals("Kilometer") && spinner02.equals("Feet")){
                        double value = num1 * 3280.84;
                        result.setText(value+"Feet");
                    }
                    if(spinner01.equals("Kilometer") && spinner02.equals("Inch")){
                        double value = num1 * 39370.07874 ;
                        result.setText(value+"inch");
                    }


                    //2


                    if(spinner01.equals("Meter") && spinner02.equals("Kilometer")){
                        double value = num1 * 0.001;
                        result.setText(value+"KM");
                    }
                    if(spinner01.equals("Meter") && spinner02.equals("Meter")){
                        double value = num1 * 1;
                        result.setText(value+"M");
                    }
                    if(spinner01.equals("Meter") && spinner02.equals("Centimeter")){
                        double value = num1 * 100;
                        result.setText(value+"CM");
                    }
                    if(spinner01.equals("Meter") && spinner02.equals("Millimeter")){
                        double value = num1 * 1000;
                        result.setText(value+"MM");
                    }
                    if(spinner01.equals("Meter") && spinner02.equals("Mile")){
                        double value = num1 * 0.00062137 ;
                        result.setText(value+"mile");
                    }
                    if(spinner01.equals("Meter") && spinner02.equals("Feet")){
                        double value = num1 * 3.2808 ;
                        result.setText(value+"Feet");
                    }
                    if(spinner01.equals("Meter") && spinner02.equals("Inch")){
                        double value = num1 * 39.370;
                        result.setText(value+"inch");
                    }


                    //3


                    if(spinner01.equals("Centimeter") && spinner02.equals("Kilometer")){
                        double value = num1 * 0.000010;
                        result.setText(value+"KM");
                    }
                    if(spinner01.equals("Centimeter") && spinner02.equals("Meter")){
                        double value = num1 * 0.01;
                        result.setText(value+"M");
                    }
                    if(spinner01.equals("Centimeter") && spinner02.equals("Centimeter")){
                        double value = num1 * 1;
                        result.setText(value+"CM");
                    }
                    if(spinner01.equals("Centimeter") && spinner02.equals("Millimeter")){
                        double value = num1 * 10;
                        result.setText(value+"MM");
                    }
                    if(spinner01.equals("Centimeter") && spinner02.equals("Mile")){
                        double value = num1 * 0.000006213711922;
                        result.setText(value+"mile");
                    }
                    if(spinner01.equals("Centimeter") && spinner02.equals("Feet")){
                        double value = num1 * 0.03280839895;
                        result.setText(value+"Feet");
                    }
                    if(spinner01.equals("Centimeter") && spinner02.equals("Inch")){
                        double value = num1 * 0.39 ;
                        result.setText(value+"inch");
                    }


                    //4


                    if(spinner01.equals("Millimeter") && spinner02.equals("Kilometer")){
                        double value = num1 * 0.000001;
                        result.setText(value+"KM");
                    }
                    if(spinner01.equals("Millimeter") && spinner02.equals("Meter")){
                        double value = num1 * 0.001;
                        result.setText(value+"M");
                    }
                    if(spinner01.equals("Millimeter") && spinner02.equals("Centimeter")){
                        double value = num1 * 0.1;
                        result.setText(value+"CM");
                    }
                    if(spinner01.equals("Millimeter") && spinner02.equals("Millimeter")){
                        double value = num1 * 1;
                        result.setText(value+"MM");
                    }
                    if(spinner01.equals("Millimeter") && spinner02.equals("Mile")){
                        double value = num1 * 0.000000621371;
                        result.setText(value+"mile");
                    }
                    if(spinner01.equals("Millimeter") && spinner02.equals("Feet")){
                        double value = num1 * 0.00328084;
                        result.setText(value+"Feet");
                    }
                    if(spinner01.equals("Millimeter") && spinner02.equals("Inch")){
                        double value = num1 * 0.0393701;
                        result.setText(value+"inch");
                    }


                    //5


                    if(spinner01.equals("Mile") && spinner02.equals("Kilometer")){
                        double value = num1 * 1.609344;
                        result.setText(value+"KM");
                    }
                    if(spinner01.equals("Mile") && spinner02.equals("Meter")){
                        double value = num1 * 1609.344;
                        result.setText(value+"M");
                    }
                    if(spinner01.equals("Mile") && spinner02.equals("Centimeter")){
                        double value = num1 * 160934.4;
                        result.setText(value+"CM");
                    }
                    if(spinner01.equals("Mile") && spinner02.equals("Millimeter")){
                        double value = num1 * 1609344;
                        result.setText(value+"MM");
                    }
                    if(spinner01.equals("Mile") && spinner02.equals("Mile")){
                        double value = num1 * 1;
                        result.setText(value+"mile");
                    }
                    if(spinner01.equals("Mile") && spinner02.equals("Feet")){
                        double value = num1 * 5280 ;
                        result.setText(value+"Feet");
                    }
                    if(spinner01.equals("Mile") && spinner02.equals("Inch")){
                        double value = num1 * 63360;
                        result.setText(value+"inch");
                    }


                    //6


                    if(spinner01.equals("Feet") && spinner02.equals("Kilometer")){
                        double value = num1 * 0.0003048;
                        result.setText(value+"KM");
                    }
                    if(spinner01.equals("Feet") && spinner02.equals("Meter")){
                        double value = num1 * 0.3048;
                        result.setText(value+"M");
                    }
                    if(spinner01.equals("Feet") && spinner02.equals("Centimeter")){
                        double value = num1 * 30.48;
                        result.setText(value+"CM");
                    }
                    if(spinner01.equals("Feet") && spinner02.equals("Millimeter")){
                        double value = num1 * 304.8;
                        result.setText(value+"MM");
                    }
                    if(spinner01.equals("Feet") && spinner02.equals("Mile")){
                        double value = num1 * 0.000189394;
                        result.setText(value+"mile");
                    }
                    if(spinner01.equals("Feet") && spinner02.equals("Feet")){
                        double value = num1 * 1;
                        result.setText(value+"Feet");
                    }
                    if(spinner01.equals("Feet") && spinner02.equals("Inch")){
                        double value = num1 * 12 ;
                        result.setText(value+"inch");
                    }

                    //7


                    if(spinner01.equals("Inch") && spinner02.equals("Kilometer")){
                        double value = num1 * 0.0000254;
                        result.setText(value+"KM");
                    }
                    if(spinner01.equals("Inch") && spinner02.equals("Meter")){
                        double value = num1 * 0.0254;
                        result.setText(value+"M");
                    }
                    if(spinner01.equals("Inch") && spinner02.equals("Centimeter")){
                        double value = num1 * 2.54 ;
                        result.setText(value+"CM");
                    }
                    if(spinner01.equals("Inch") && spinner02.equals("Millimeter")){
                        double value = num1 * 25.4;
                        result.setText(value+"MM");
                    }
                    if(spinner01.equals("Inch") && spinner02.equals("Mile")){
                        double value = num1 * 0.0000157828 ;
                        result.setText(value+"mile");
                    }
                    if(spinner01.equals("Inch") && spinner02.equals("Feet")){
                        double value = num1 * 0.0833333 ;
                        result.setText(value+"Feet");
                    }
                    if(spinner01.equals("Inch") && spinner02.equals("Inch")){
                        double value = num1 * 1;
                        result.setText(value+"inch");
                    }


                }



                //save
                int choice1 = spinner1.getSelectedItemPosition();
                SharedPreferences sharedPref1 = getSharedPreferences("data2",0);
                SharedPreferences.Editor prefEditor1 = sharedPref1.edit();
                prefEditor1.putInt("userChoiceSpinner1",choice1);
                prefEditor1.apply();
                int choice2 = spinner2.getSelectedItemPosition();
                SharedPreferences sharedPref2 = getSharedPreferences("data2",0);
                SharedPreferences.Editor prefEditor2 = sharedPref1.edit();
                prefEditor2.putInt("userChoiceSpinner2",choice2);
                prefEditor2.apply();





            }
        });











    }
}
