package com.example.mallplans.Object;

public class
Dashboard {

    private String dashboard_title;
    private int dashboard_icon;

    public Dashboard(String dashboard_title, int dashboard_icon) {
        this.dashboard_title = dashboard_title;
        this.dashboard_icon = dashboard_icon;
    }

    public String getDashboard_title() {
        return dashboard_title;
    }

    public int getDashboard_icon() {
        return dashboard_icon;
    }

}
