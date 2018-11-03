package in.vaaraahi.cityrents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Buyingselling extends AppCompatActivity implements View.OnClickListener {
    ImageView img6,img7,img8,img9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyingselling);

        img6=findViewById(R.id.bs1);
        img7= findViewById(R.id.bs2);
        img8= findViewById(R.id.bs3);
        img9 = findViewById(R.id.bs4);


        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);

    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.bs1:
                Intent i8 = new Intent(Buyingselling.this,Rent1Activity.class);
                startActivity(i8);
                break;

            case R.id.bs2:
                Intent i2 = new Intent(Buyingselling.this,Rent2Activity.class);
                startActivity(i2);

            case R.id.bs3:
                Intent i3 = new Intent(Buyingselling.this,Rent3Activity.class);
                startActivity(i3);

            case R.id.bs4:
                Intent i4 = new Intent(Buyingselling.this,Rent4Activity.class);
                startActivity(i4);
        }
    }
}
