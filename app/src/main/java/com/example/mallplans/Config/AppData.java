package com.example.mallplans.Config;


import com.example.mallplans.Object.Dashboard;
import com.example.mallplans.R;

public class AppData {

    //stores data for the dashboard data for the gridview
    public static Dashboard[] dashboardData(){
        Dashboard [] d = {

                new Dashboard("Food places\n",R.mipmap.food),
                new Dashboard("Salons",R.mipmap.salon),
                new Dashboard("Barbershops",R.mipmap.barbershop),
                new Dashboard("Games Arcade",R.mipmap.arcade)
        };
        return d;
    }
}
