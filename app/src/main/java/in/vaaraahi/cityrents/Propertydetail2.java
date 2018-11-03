package in.vaaraahi.cityrents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Propertydetail2 extends AppCompatActivity {
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propertydetail2);

        b2 = findViewById(R.id.contact2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Propertydetail2.this,Credentials.class);
                startActivity(i);
            }
        });

    }
}
