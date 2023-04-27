package com.bca6sem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.bca6sem.DisplayActivity;

public class LoginUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_up);

        TextView signUpTv =(TextView)  findViewById(R.id.signUpTb);
        EditText emailEt=(EditText) findViewById(R.id.emailEt);
        EditText passwordEt=(EditText) findViewById(R.id.passwordEt);
        Button loginBtn = (Button) findViewById(R.id.loginBtn);

          loginBtn.setOnClickListener(v->{
                Intent i =new Intent(LoginUpActivity.this, DisplayActivity.class);
      i.putExtra("EmailId",emailEt.getText().toString());
      i.putExtra( "passwordId",passwordEt.getText().toString());
      startActivityForResult(i,2);
      });





        signUpTv.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                startActivity(new Intent(LoginUpActivity.this,SignUpActivity.class));
                return true;
            }
        });
//        loginBtn.setOnClickListener(view -> {
//            startActivity(new Intent(LoginUpActivity.this,SignUpActivity.class));
//        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        EditText email=(EditText) findViewById(R.id.emailEt);

        if(requestCode==2)
        {
            String message=data.getStringExtra("message");
            email.setText(message);
        }
    }
}