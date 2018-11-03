package in.vaaraahi.cityrents;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.GridView;

public class Navigation extends AppCompatActivity {
    NavigationView a;


    GridView gridView;
    int[] image={R.drawable.land,R.drawable.vhouse,R.drawable.ghouse,
            R.drawable.lh};

    String[] name={"Owners","Tenents","Rented homes","Buying & Selling"};

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle mToggle;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation);

        a=findViewById(R.id.nav);
       a.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
               int id=menuItem.getItemId();
               switch (id){
                   case R.id.home:
                       Intent intent=new Intent(Navigation.this,Navigation.class);
                       startActivity(intent);
                       finish();
                       break;

                   case R.id.land:
                       Intent nav=new Intent(Navigation.this,MainActivity.class);
                       startActivity(nav);
                       finish();
                       break;
                   case R.id.tenants:
                       Intent nav1=new Intent(Navigation.this,Tenants.class);
                       startActivity(nav1);
                       finish();
                       break;

                   case R.id.rentals:
                       Intent nav2=new Intent(Navigation.this,Rent.class);
                       startActivity(nav2);
                       finish();
                       break;

                   case R.id.sellings:
                       Intent nav3=new Intent(Navigation.this,Rent.class);
                       startActivity(nav3);
                       finish();
                       break;


                 /*  case R.id.land:
                       Intent landlords = new Intent(Navigation.this,)*/
               }
               return false;
           }
       });


       drawerLayout=findViewById(R.id.drawer);

        mToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        gridView=findViewById(R.id.grid);

        CustomGrid customGrid=new CustomGrid(this,image,name);
        gridView.setAdapter(customGrid);


        }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {

            return true;
        }

        return super.onOptionsItemSelected(item);

        }

        }


