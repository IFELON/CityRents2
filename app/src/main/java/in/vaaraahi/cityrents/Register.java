package in.vaaraahi.cityrents;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {

    private FirebaseAuth auth;
        Button log;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register);
            auth = FirebaseAuth.getInstance();
            log=findViewById(R.id.login1);
            Button register=findViewById(R.id.registering1);
            final EditText name=findViewById(R.id.name);
            final EditText inputEmail=findViewById(R.id.email);
            final EditText inputPassword=findViewById(R.id.password);
            final EditText confirmPassword=findViewById(R.id.confrom);
            register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String email = inputEmail.getText().toString().trim();
                    String password = inputPassword.getText().toString().trim();
                    if (TextUtils.isEmpty(email)){
                        Toast.makeText(getApplicationContext(),"Plz enter your mail ID",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if (TextUtils.isEmpty(password)){
                        Toast.makeText(getApplicationContext(),"Plz enter your password",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if (password.length() < 6) {
                        Toast.makeText(getApplicationContext(), "Password too short, enter minimum 6 characters!", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(Register.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                       if (task.isSuccessful())
                       {
                           Toast.makeText(getApplicationContext(),"Registered successfully",Toast.LENGTH_SHORT).show();
                           startActivity(new Intent(Register.this,LoginActivity.class));
                        }
                        else {
                           Toast.makeText(getApplicationContext(),"not Registered successfully",Toast.LENGTH_SHORT).show();
                       }


                        }
                    });
                }
            });

            log.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent sam = new Intent(Register.this, LoginActivity.class);
                    startActivity(sam);
                }
            });




    }
}
