package charlie.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startintent1 = new Intent(getApplicationContext(),Main3Activity.class);
                finish();
                startActivity(startintent1); }
        });


        ImageButton b5 = (ImageButton) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startintent2 = new Intent(getApplicationContext(),Main3Activity.class);
                finish();
                startActivity(startintent2);
            }
        });





        //length converter
        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent startintent3 = new Intent(getApplicationContext(),Main4Activity.class);
                finish();
                startActivity(startintent3);
            }
        });
        ImageButton b6 = (ImageButton) findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startintent4 = new Intent(getApplicationContext(),Main4Activity.class);
                finish();
                startActivity(startintent4);
            }
        });





        //temperature converter
        Button b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent startintent5 = new Intent(getApplicationContext(),Main5Activity.class);
                finish();
                startActivity(startintent5);
            }
        });
        ImageButton b7 = (ImageButton) findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startintent6 = new Intent(getApplicationContext(),Main5Activity.class);
                finish();
                startActivity(startintent6);
            }
        });






        //weight converter

        Button b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent startintent7 = new Intent(getApplicationContext(),Main6Activity.class);
                finish();
                startActivity(startintent7);
            }
        });
        ImageButton b8 = (ImageButton) findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent startintent8 = new Intent(getApplicationContext(),Main6Activity.class);
                finish();
                startActivity(startintent8);
            }
        });






        //time converter

        Button b9 = (Button) findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent startintent9 = new Intent(getApplicationContext(),Main7Activity.class);
                finish();
                startActivity(startintent9);
            }
        });
        ImageButton b10 = (ImageButton) findViewById(R.id.button10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent startintent10 = new Intent(getApplicationContext(),Main7Activity.class);
                finish();
                startActivity(startintent10);
            }
        });



        Button b11 = (Button) findViewById(R.id.button11);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent startintent11 = new Intent(getApplicationContext(),Main8Activity.class);
                finish();
                startActivity(startintent11);
            }
        });
        ImageButton b12 = (ImageButton) findViewById(R.id.button12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent startintent12 = new Intent(getApplicationContext(),Main8Activity.class);
                finish();
                startActivity(startintent12);
            }
        });





    }
}
