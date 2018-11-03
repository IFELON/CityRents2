package in.vaaraahi.cityrents;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

public class Home extends AppCompatActivity {

    GridView gridView;

    int[] image={R.drawable.land,R.drawable.vhouse,R.drawable.ghouse,
            R.drawable.lh};

    String[] name={"Owners","Tenents","Rented homes","Buying & Selling"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        gridView=findViewById(R.id.grid);

        CustomGrid customGrid=new CustomGrid(this,image,name);
        gridView.setAdapter(customGrid);



    }
}
