package in.vaaraahi.cityrents;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class User extends AppCompatActivity {
    ImageView a;
    ImageView b;
    EditText nt;
    Button r1,s2;

    private static final int REQUEST_IMAGE_FOR_SELECT = 100;
    private static final int REQUEST_IMAGE_FOR_SELECT1 = 200;
    private static final String TAG = "MainActivity";
    Uri outPutfileUri;
    ImageView galleryimage=null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        a = findViewById(R.id.images);
        b = findViewById(R.id.images1);
        nt = findViewById(R.id.note);
        s2 = findViewById(R.id.sell);
        r1 = findViewById(R.id.rent);

        a.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     Intent cameras1=new Intent();
                                     cameras1.setType("image/*");
                                     cameras1.setAction(Intent.ACTION_GET_CONTENT);
                                     startActivityForResult(Intent.createChooser(cameras1,"select iamge"),REQUEST_IMAGE_FOR_SELECT);
                                 }
        });
        b.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     Intent cameras2=new Intent();
                                     cameras2.setType("image/*");
                                     cameras2.setAction(Intent.ACTION_GET_CONTENT);
                                     startActivityForResult(Intent.createChooser(cameras2,"select iamge"),REQUEST_IMAGE_FOR_SELECT1);
                                 }
        });

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User.this,Rent.class);
                startActivity(intent);
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User.this,Buyingselling.class);
                startActivity(intent);
            }
        });


    }

  /*  private void selectPicture() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Select image from device");
        final CharSequence[] Items = {"Select from gallery", "Cancel"};

        builder.setItems(Items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                *//*if (Items[i].equals("Take a photo")) {
                    Intent camera = new Intent();
                    camera.setType("img/*");
                    camera.setAction(MediaStore.ACTION_IMAGE_CAPTURE_SECURE);
                    startActivityForResult(camera, 100);


                }*//*
                if (Items[i].equals("Select from gallery")) {

                    Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                    intent.addCategory(Intent.CATEGORY_OPENABLE);
                    intent.setType("image/*");
                    startActivityForResult(Intent.createChooser(intent, "Select Picture"), REQUEST_GET_SINGLE_FILE);
                } else if (Items[i].equals("Cancel")) {
                    dialogInterface.dismiss();

                }
            }
        });

        builder.show();}*/

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case REQUEST_IMAGE_FOR_SELECT:
                if (resultCode==RESULT_OK){
                    outPutfileUri=data.getData();
                    try {
                        Bitmap bitmap=MediaStore.Images.Media.getBitmap(getContentResolver(),outPutfileUri);
                        a.setImageBitmap(bitmap);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                break;

            case REQUEST_IMAGE_FOR_SELECT1:
                if (resultCode==RESULT_OK){
                    outPutfileUri=data.getData();
                    try {
                        Bitmap bitmap1=MediaStore.Images.Media.getBitmap(getContentResolver(),outPutfileUri);
                        b.setImageBitmap(bitmap1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                break;

            default:
                Toast.makeText(getApplicationContext(),"something went wrong",Toast.LENGTH_SHORT).show();

        }
    }
}
