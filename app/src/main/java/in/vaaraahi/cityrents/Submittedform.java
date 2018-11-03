package in.vaaraahi.cityrents;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Submittedform extends AppCompatActivity {

    TextView txt1,txt2,txt3,txt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submittedform);

        Bundle b8 = getIntent().getExtras();
        txt1 = findViewById(R.id.st1);
        txt2 = findViewById(R.id.st2);
        txt3 = findViewById(R.id.st3);
        txt4 = findViewById(R.id.st4);

        txt1.setText(b8.getString("FirstName"));
        txt2.setText(b8.getString("Lastname"));
        txt3.setText(b8.getString("email"));
        txt4.setText(b8.getString("phone"));


    }
}
