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

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //set home button go back to page2
        Button home = (Button) findViewById(R.id.button2);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(),Main2Activity.class);
                finish();
                startActivity(startintent);
            }
        });

        //set name to all edit text and spinner
        final EditText keyamount = (EditText) findViewById(R.id.keyamount);
        final Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        final Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        Button convert = (Button) findViewById(R.id.button1);
        final TextView result = (TextView) findViewById(R.id.textView);


        //load shared preference to spinner1&2
        SharedPreferences sharedPref1 = getSharedPreferences("data1",MODE_PRIVATE);
        int spinnerValue1 = sharedPref1.getInt("userChoiceSpinner1",-1);
        spinner1.setSelection(spinnerValue1);
        SharedPreferences sharedPref2 = getSharedPreferences("data1",MODE_PRIVATE);
        int spinnerValue2 = sharedPref2.getInt("userChoiceSpinner2",-1);
        spinner2.setSelection(spinnerValue2);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change edit text to string
                String num = keyamount.getText().toString();
                //change string to int
                int num1 = Integer.parseInt(num);
                String spinner01 = spinner1.getSelectedItem().toString();
                String spinner02 = spinner2.getSelectedItem().toString();

                //toast msg when user key invalid number
                if (num1 <= 0){
                    Toast.makeText(Main3Activity.this,"Invalid Input",Toast.LENGTH_LONG).show();
                }
                //SGD part exchange rate
                else{
                    if(spinner01.equals("Singapore Dollar") && spinner02.equals("US Dollar")){
                        double value = num1 * 0.747;
                        result.setText("$"+value);
                    }
                    if(spinner01.equals("Singapore Dollar") && spinner02.equals("Malaysia Ringgit")){
                        double value = num1 * 2.978;
                        result.setText("RM"+value);
                    }
                    if(spinner01.equals("Singapore Dollar") && spinner02.equals("Singapore Dollar")){
                        double value = num1 * 1;
                        result.setText("S$"+value);
                    }
                    if(spinner01.equals("Singapore Dollar") && spinner02.equals("British pound")){
                        double value = num1 * 0.559;
                        result.setText("£"+value);
                    }
                    if(spinner01.equals("Singapore Dollar") && spinner02.equals("Euro")){
                        double value = num1 * 0.639;
                        result.setText("€"+value);
                    }
                    if(spinner01.equals("Singapore Dollar") && spinner02.equals("Japanese Yen")){
                        double value = num1 * 81.800;
                        result.setText("¥"+value);
                    }
                    if(spinner01.equals("Singapore Dollar") && spinner02.equals("Thai Baht")){
                        double value = num1 * 23.928114;
                        result.setText("฿"+value);
                    }


                    //ringgit part
                    if(spinner01.equals("Malaysia Ringgit") && spinner02.equals("US Dollar")){
                        double value = num1 * 0.250;
                        result.setText("$"+value);
                    }
                    if(spinner01.equals("Malaysia Ringgit") && spinner02.equals("Malaysia Ringgit")){
                        double value = num1 * 1;
                        result.setText("RM"+value);
                    }
                    if(spinner01.equals("Malaysia Ringgit") && spinner02.equals("Singapore Dollar")){
                        double value = num1 * 0.335;
                        result.setText("S$"+value);
                    }
                    if(spinner01.equals("Malaysia Ringgit") && spinner02.equals("British pound")){
                        double value = num1 * 0.187	;
                        result.setText("£"+value);
                    }
                    if(spinner01.equals("Malaysia Ringgit") && spinner02.equals("Euro")){
                        double value = num1 * 0.214	;
                        result.setText("€"+value);
                    }
                    if(spinner01.equals("Malaysia Ringgit") && spinner02.equals("Japanese Yen")){
                        double value = num1 * 27.461	;
                        result.setText("¥"+value);
                    }
                    if(spinner01.equals("Malaysia Ringgit") && spinner02.equals("Thai Baht")) {
                        double value = num1 * 8.032;
                        result.setText("฿" + value);
                    }


                    //US Dollar part
                    if(spinner01.equals("US Dollar") && spinner02.equals("US Dollar")){
                        double value = num1 * 1	;
                        result.setText("$"+value);
                    }
                    if(spinner01.equals("US Dollar") && spinner02.equals("Malaysia Ringgit")){
                        double value = num1 * 3.987	;
                        result.setText("RM"+value);
                    }
                    if(spinner01.equals("US Dollar") && spinner02.equals("Singapore Dollar")){
                        double value = num1 * 1.338	;
                        result.setText("S$"+value);
                    }
                    if(spinner01.equals("US Dollar") && spinner02.equals("British pound")){
                        double value = num1 * 0.749	;
                        result.setText("£"+value);
                    }
                    if(spinner01.equals("US Dollar") && spinner02.equals("Euro")){
                        double value = num1 * 0.857	;
                        result.setText("€"+value);
                    }
                    if(spinner01.equals("US Dollar") && spinner02.equals("Japanese Yen")){
                        double value = num1 * 109.493;
                        result.setText("¥"+value);
                    }
                    if(spinner01.equals("US Dollar") && spinner02.equals("Thai Baht")) {
                        double value = num1 * 32.021;
                        result.setText("฿" + value);
                    }


                    //British pound part
                    if(spinner01.equals("British pound") && spinner02.equals("US Dollar")){
                        double value = num1 * 1.335;
                        result.setText("$"+value);
                    }
                    if(spinner01.equals("British pound") && spinner02.equals("Malaysia Ringgit")){
                        double value = num1 * 5.324;
                        result.setText("RM"+value);
                    }
                    if(spinner01.equals("British pound") && spinner02.equals("Singapore Dollar")){
                        double value = num1 * 1.786;
                        result.setText("$"+value);
                    }
                    if(spinner01.equals("British pound") && spinner02.equals("British pound")){
                        double value = num1 * 1;
                        result.setText("£"+value);
                    }
                    if(spinner01.equals("British pound") && spinner02.equals("Euro")){
                        double value = num1 * 1.144;
                        result.setText("€"+value);
                    }
                    if(spinner01.equals("British pound") && spinner02.equals("Japanese Yen")){
                        double value = num1 * 146.175;
                        result.setText("¥"+value);
                    }
                    if(spinner01.equals("British pound") && spinner02.equals("Thai Baht")) {
                        double value = num1 * 42.740;
                        result.setText("฿" + value);
                    }



                    //Euro part
                    if(spinner01.equals("Euro") && spinner02.equals("US Dollar")){
                        double value = num1 * 1.166;
                        result.setText("$"+value);
                    }
                    if(spinner01.equals("Euro") && spinner02.equals("Malaysia Ringgit")){
                        double value = num1 * 4.652;
                        result.setText("RM"+value);
                    }
                    if(spinner01.equals("Euro") && spinner02.equals("Singapore Dollar")){
                        double value = num1 * 1.561;
                        result.setText("S$"+value);
                    }
                    if(spinner01.equals("Euro") && spinner02.equals("British pound")){
                        double value = num1 * 0.873;
                        result.setText("£"+value);
                    }
                    if(spinner01.equals("Euro") && spinner02.equals("Euro")){
                        double value = num1 * 1;
                        result.setText("€"+value);
                    }
                    if(spinner01.equals("Euro") && spinner02.equals("Japanese Yen")){
                        double value = num1 * 127.730075;
                        result.setText("¥"+value);
                    }
                    if(spinner01.equals("Euro") && spinner02.equals("Thai Baht")) {
                        double value = num1 * 37.355;
                        result.setText("฿" + value);
                    }


                    //Japanese Yen part
                    if(spinner01.equals("Japanese Yen") && spinner02.equals("US Dollar")){
                        double value = num1 * 0.009 ;
                        result.setText("$"+value);
                    }
                    if(spinner01.equals("Japanese Yen") && spinner02.equals("Malaysia Ringgit")){
                        double value = num1 * 0.036 ;
                        result.setText("RM"+value);
                    }
                    if(spinner01.equals("Japanese Yen") && spinner02.equals("Singapore Dollar")){
                        double value = num1 * 0.012;
                        result.setText("S$"+value);
                    }
                    if(spinner01.equals("Japanese Yen") && spinner02.equals("British pound")){
                        double value = num1 * 0.006;
                        result.setText("£"+value);
                    }
                    if(spinner01.equals("Japanese Yen") && spinner02.equals("Euro")){
                        double value = num1 * 0.007;
                        result.setText("€"+value);
                    }
                    if(spinner01.equals("Japanese Yen") && spinner02.equals("Japanese Yen")){
                        double value = num1 * 1;
                        result.setText("¥"+value);
                    }
                    if(spinner01.equals("Japanese Yen") && spinner02.equals("Thai Baht")) {
                        double value = num1 * 0.292;
                        result.setText("฿" + value);
                    }


                    //thai baht part
                    if(spinner01.equals("Thai Baht") && spinner02.equals("US Dollar")) {
                        double value = num1 * 0.031;
                        result.setText("$" + value);
                    }
                    if(spinner01.equals("Thai Baht") && spinner02.equals("Malaysia Ringgit")) {
                        double value = num1 * 0.124;
                        result.setText("RM" + value);
                    }
                    if(spinner01.equals("Thai Baht") && spinner02.equals("Singapore Dollar")) {
                        double value = num1 * 0.041;
                        result.setText("S$" + value);
                    }
                    if(spinner01.equals("Thai Baht") && spinner02.equals("British pound")) {
                        double value = num1 * 0.023;
                        result.setText("£" + value);
                    }
                    if(spinner01.equals("Thai Baht") && spinner02.equals("Euro")) {
                        double value = num1 * 0.026 ;
                        result.setText("€" + value);
                    }
                    if(spinner01.equals("Thai Baht") && spinner02.equals("Japanese Yen")) {
                        double value = num1 * 3.419;
                        result.setText("¥" + value);
                    }
                    if(spinner01.equals("Thai Baht") && spinner02.equals("Thai Baht")) {
                        double value = num1 * 1;
                        result.setText("฿" + value);
                    }

                }

                //save user selected spinner position
                int choice1 = spinner1.getSelectedItemPosition();
                SharedPreferences sharedPref1 = getSharedPreferences("data1",0);
                SharedPreferences.Editor prefEditor1 = sharedPref1.edit();
                prefEditor1.putInt("userChoiceSpinner1",choice1);
                prefEditor1.apply();
                int choice2 = spinner2.getSelectedItemPosition();
                SharedPreferences sharedPref2 = getSharedPreferences("data1",0);
                SharedPreferences.Editor prefEditor2 = sharedPref1.edit();
                prefEditor2.putInt("userChoiceSpinner2",choice2);
                prefEditor2.apply();







            }
        });






    }
}
