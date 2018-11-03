package in.vaaraahi.cityrents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Credentials extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    Button b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credentials);

        e1 = findViewById(R.id.tfn);
        e2 = findViewById(R.id.tln);
        e3 = findViewById(R.id.tem);
        e4 = findViewById(R.id.tphn);
        b5 = findViewById(R.id.tsbm);
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent submit = new Intent(getApplicationContext(),Submittedform.class);
                        Bundle b6 = new Bundle();
                        b6.putString("FirstName",e1.getText().toString());
                        b6.putString("Lastname",e2.getText().toString());
                        b6.putString("email",e3.getText().toString());
                        b6.putString("phone",e4.getText().toString());

                        submit.putExtras(b6);
                        startActivity(submit);

                        }

                });
    }
}
