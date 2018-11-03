package in.vaaraahi.cityrents;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class LoginActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    EditText editText1,editText2;
    Button reg,login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




        mAuth = FirebaseAuth.getInstance();
        editText1=findViewById(R.id.et1);
        editText2=findViewById(R.id.et2);
        reg=findViewById(R.id.registering);
        login=findViewById(R.id.login);


        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regist=new Intent(LoginActivity.this,Register.class);
                startActivity(regist);


            }
        });


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              Intent nav = new Intent(LoginActivity.this,Navigation.class);
              startActivity(nav);
              finish();
                //  Intent sam = new Intent(LoginActivity.this, Homepagetemp.class);
                //  startActivity(sam);

                String email = editText1.getText().toString();
                final String password = editText2.getText().toString();


                if (email.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Please enter valid email", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Please enter vaild password", Toast.LENGTH_SHORT).show();
                    return;

                }
                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(Task<AuthResult> task) {

                                if (!task.isSuccessful()) {
                                    // there was an error
                                    if (password.length() < 6) {
                                        editText2.setError("min 6 digit");
                                    } else {
                                        Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_LONG).show();
                                    }
                                } else {
                                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                                    startActivity(intent);
                                    finish();
                                }
                            }
                        });


            }
        });
    }
}
