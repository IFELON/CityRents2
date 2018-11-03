package in.vaaraahi.cityrents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Image view onclick



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.popupmenu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /*if (item.getItemId()==R.id.item1){
            Toast.makeText(this,"you selected item1",Toast.LENGTH_SHORT).show();
            }
        if (item.getItemId()==R.id.item2){
            Toast.makeText(this,"you selected item1",Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId()==R.id.item3) {
            Toast.makeText(this, "you selected item1", Toast.LENGTH_SHORT).show();
        }*/

        switch (item.getItemId()){
            case R.id.add:
                Toast.makeText(this,"you clicked on add button",Toast.LENGTH_SHORT).show();
                Intent mn=new Intent(MainActivity.this,User.class);
                startActivity(mn);
                break;
            case R.id.item1:
                Toast.makeText(this,"you selected item1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(this,"you selected item2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(this,"you selected item3",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item4:
                Toast.makeText(this,"you selected item4",Toast.LENGTH_SHORT).show();
                break;


        }
        return super.onOptionsItemSelected(item);
    }


}
