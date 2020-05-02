package com.example.mallplans;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class RegisterActivity extends AppCompatActivity {

    Button button;
    private EditText editText3,editText4,editText6,editText7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        button=findViewById(R.id.button);
        editText3=findViewById(R.id.username);
        editText4=findViewById(R.id.email);
        editText6=findViewById(R.id.password);
        editText7=findViewById(R.id.cpassword);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(RegisterActivity.this,DashboardActivity.class);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name= editText3.getText().toString().trim();
                String Email= editText4.getText().toString().trim();
                String Phone_number= editText6.getText().toString().trim();
                String Password = editText7.getText().toString().trim();

                if (Name.isEmpty()&& Email.isEmpty()&&Phone_number.isEmpty()
                        &&Password.isEmpty()) {
                    Toast.makeText(RegisterActivity.this,
                            "Please enter your name", Toast.LENGTH_SHORT).show();
                }else if (Email.isEmpty()){
                    Toast.makeText(RegisterActivity.this,"Please enter your " +
                            "email",Toast.LENGTH_SHORT).show();
                }else if(Phone_number.isEmpty()){
                    Toast.makeText(RegisterActivity.this, "Please enter your phonenumber", Toast.LENGTH_SHORT).show();

                }else if (Password.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "Enter your passworrd",
                            Toast.LENGTH_SHORT).show();
                }else{

                    Intent intent= new Intent(RegisterActivity.this, LogInActivity.class);
                    startActivity(intent);
                }
            }
        });

    }

}