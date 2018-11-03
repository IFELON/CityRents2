package in.vaaraahi.cityrents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Propertydetail3 extends AppCompatActivity {
    Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propertydetail3);

        b3 = findViewById(R.id.contact3);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Propertydetail3.this,Credentials.class);
                startActivity(intent);
            }
        });

    }
}
