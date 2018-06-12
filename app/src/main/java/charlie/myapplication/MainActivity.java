package charlie.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //EditText name = (EditText) findViewById(R.id.edit1);
                //String user = name.getText().toString();
                // SharedPreferences share1 = getSharedPreferences("savadata1", Context.MODE_PRIVATE);
                //SharedPreferences.Editor editor = share1.edit();
                // editor.putString("value",name.getText().toString());
                // editor.apply();

                Intent startintent = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(startintent);
            }
        });
    }
}
