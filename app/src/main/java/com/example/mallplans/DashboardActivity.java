package com.example.mallplans;

import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mallplans.Adapters.DashBoardAdapter;
import com.example.mallplans.Config.AppData;


public class DashboardActivity extends AppCompatActivity {

    GridView gridView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        gridView = findViewById(R.id.dashboard_grid);
        //calling our adapter class to the method
        DashBoardAdapter adapter = new DashBoardAdapter(
                getApplicationContext(),
                new AppData().dashboardData()
        );

        //Adding OnClick Listeners on the images passed from the adapter

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String string= ((TextView) view.findViewById(R.id.dashboard_title))
                        .getText().toString();
                ImageView imageView = (ImageView) view.findViewById(R.id.dashboard_img);
                imageView.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {

                        Toast.makeText(DashboardActivity.this, "Working",
                                Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(DashboardActivity.
                                this, Stores.class);
                        startActivity(intent);

                    }
                });
            }
        });
        gridView.setAdapter(adapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.dashboard,menu);
        return true;

    }
}

