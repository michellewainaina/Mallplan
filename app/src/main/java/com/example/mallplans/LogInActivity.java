package com.example.mallplans;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class LogInActivity extends Activity {
    Button button;
    private EditText editText,editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        button=findViewById(R.id.button);
        editText=findViewById(R.id.email);
        editText2=findViewById(R.id.password);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchDashboard();

                Intent intent = new Intent(LogInActivity.this, DashboardActivity.class);
                startActivity(intent); }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editText.getText().toString().trim();
                String password = editText2.getText().toString().trim();

                if (username.isEmpty()&& password.isEmpty()) {
                    Toast.makeText(LogInActivity.this,
                            "Please enter your Username", Toast.LENGTH_SHORT).show();
                } else if (username.isEmpty()) {
                    Toast.makeText(LogInActivity.this,
                            "Please enter your Password", Toast.LENGTH_SHORT).show();

                } else if (password.isEmpty()) {
                    Toast.makeText(LogInActivity.this,
                            "Please enter your Password", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent= new Intent(LogInActivity.this,DashboardActivity.class);
                    startActivity(intent);
                }
            }
        });

           }
    void launchDashboard(){
        Intent intent = new Intent(LogInActivity.this,
                Spinners.class);
        startActivity(intent);
    }



}
