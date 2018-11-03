package in.vaaraahi.cityrents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Rent extends AppCompatActivity implements View.OnClickListener {

    ImageView img1,img2,img3,img4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent);

        img1 = findViewById(R.id.r1);
        img2 = findViewById(R.id.r2);
        img3 = findViewById(R.id.r3);
        img4 = findViewById(R.id.r4);

        //Property details Intents
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);

    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.r1:
            Intent intent = new Intent(Rent.this,Propertydetails.class);
            startActivity(intent);
        break;
            case R.id.r2:
                Intent intent1 = new Intent(Rent.this,Propertydetail2.class);
                startActivity(intent1);
                break;


            case R.id.r3:
                Intent intent2 = new Intent(Rent.this,Propertydetail3.class);
                startActivity(intent2);
                break;

            case R.id.r4:
                Intent intent3 = new Intent(Rent.this,Propertydetail4.class);
                startActivity(intent3);
                break;
        }
    }


}
