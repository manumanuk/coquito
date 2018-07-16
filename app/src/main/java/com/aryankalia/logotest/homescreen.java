package com.aryankalia.logotest;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.gms.common.api.Result;

import java.util.List;

/**
 * Created by Aryan Kalia on 2018-03-21.
 */

public class homescreen extends AppCompatActivity /**implements NavigationView.OnNavigationItemSelectedListener**/ {

    ListView listView;

    private DrawerLayout homeDrawer;
    private ActionBarDrawerToggle homeToggle;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);
        //homeDrawer =(DrawerLayout) findViewById(R.id.drawer);
        //homeToggle = new ActionBarDrawerToggle(this, homeDrawer, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        //homeDrawer.addDrawerListener(homeToggle);
        //homeToggle.syncState();
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //NavigationView navigationView=(NavigationView)findViewById(R.id.drawer);
        //navigationView.setNavigationItemSelectedListener(this);
        listView = (ListView) findViewById(R.id.listview);
        final String [] values = new String[] {"Featured", "American Cuisine", "International Cuisine", "Vegetarian", "Desserts", "Custom Order", "Messaging", "Log Out"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.activity_list_item, android.R.id.text1, values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                //Toast.makeText(homescreen.this, values[position], Toast.LENGTH_SHORT).show();
                if (position==0) {
                    Intent getNextScreen = new Intent(view.getContext(), featured.class);
                    startActivityForResult(getNextScreen,0);
                }
                if (position==1) {
                    Intent getNextScreen = new Intent(view.getContext(), american.class);
                    startActivityForResult(getNextScreen,1);
                }
                if (position==2) {
                    Intent getNextScreen = new Intent(view.getContext(), international.class);
                    startActivityForResult(getNextScreen,2);
                }
                if (position==3) {
                    Intent getNextScreen = new Intent(view.getContext(), veg.class);
                    startActivityForResult(getNextScreen,3);
                }
                if (position==4) {
                    Intent getNextScreen = new Intent(view.getContext(), dessert.class);
                    startActivityForResult(getNextScreen,4);
                }
                if (position==5) {
                    Intent getNextScreen = new Intent(view.getContext(), cheflisting.class);
                    startActivityForResult(getNextScreen,5);
                }
                if (position==6) {
                    Intent getNextScreen = new Intent(view.getContext(), messaging.class);
                    startActivityForResult(getNextScreen,6);
                }
                if (position==7) {
                    Intent getNextScreen = new Intent(view.getContext(), MainActivity.class);
                    startActivityForResult(getNextScreen,7);
                }

            }
        });
    }

/**    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(homeToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.myorders) {

             Intent messaging = new Intent(this, messaging.class);

             final int result = 1;
             startActivity(messaging);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }
 **/
}
