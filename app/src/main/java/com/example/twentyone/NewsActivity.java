package com.example.twentyone;

import android.content.Intent;
import android.os.Bundle;

import com.example.twentyone.News.News_item;
import com.example.twentyone.News.RVAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    LinearLayout newsScrollLinLayout;

    private List<News_item> newsList;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);


        LinearLayout.LayoutParams lpView = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        //скролл для новостей
       // newsScrollLinLayout = findViewById(R.id.newsScrollLinLayout);
        rv=(RecyclerView)findViewById(R.id.rv1);




      /*  TextView tv1 = new TextView(this);
        tv1.setText("pidorrrrr");
        tv1.setLayoutParams(lpView);
        newsScrollLinLayout.addView(tv1);
*/
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);



        initializeData();
        initializeAdapter();
    }

    private void initializeData(){
        newsList = new ArrayList<>();
        newsList.add(new News_item(
                "Title1",
                "User1",
                new Date().toString(),
                "Description1Description1Description1Description1Description1Description1Description1",
                R.drawable.logo,
                R.drawable.ava_1));
        newsList.add(new News_item(
                "Title2",
                "User2",
                new Date().toString(),
                "324324324sdfdddfjbdfhjbsdnkjsnfkjshfbfgerhueru3i82733",
                R.drawable.coin,
                R.drawable.ava_3));
        newsList.add(new News_item(
                "Title3",
                "User3",
                new Date().toString(),
                "Description1Defdgfdgn1Description1Description1Description1",
                R.drawable.logo,
                R.drawable.ava_2));
    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(newsList);
        rv.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.news, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if(id == R.id.nav_rating)
        {
            Intent intent = new Intent (this, RatingActivity.class);
            startActivity(intent);
        } else if(id == R.id.nav_start_game){
            Intent intent = new Intent(this, StartGameActivity.class);
            startActivity(intent);
        } else if(id == R.id.nav_profile){
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
        } else if(id == R.id.nav_friend){
            Intent intent = new Intent(this, FriendActivity.class);
            startActivity(intent);
        } else if(id == R.id.nav_send_coins){
            Intent intent = new Intent(this, GetMonetActivity.class);
            startActivity(intent);
        } else if(id == R.id.nav_rules){
            Intent intent = new Intent(this, RulesActivity.class);
            startActivity(intent);
        } else if(id == R.id.nav_tournament){
            Intent intent = new Intent(this, TournamentActivity.class);
            startActivity(intent);
        }
/*
        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }
*/
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
