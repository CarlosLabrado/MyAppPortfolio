package com.nablab.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        /**toolBar **/
        setUpToolBar();

        Button buttonSpotify = (Button) findViewById(R.id.button);
        Button buttonScores = (Button) findViewById(R.id.button2);
        Button buttonLibrary = (Button) findViewById(R.id.button3);
        Button buttonBuild = (Button) findViewById(R.id.button4);
        Button buttonXYZ = (Button) findViewById(R.id.button5);
        Button buttonCapstone = (Button) findViewById(R.id.button6);

        buttonSpotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Spotify app!", Toast.LENGTH_SHORT).show();
            }
        });

        buttonScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Scores app!", Toast.LENGTH_SHORT).show();
            }
        });
        buttonLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Library app!", Toast.LENGTH_SHORT).show();
            }
        });
        buttonBuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Build it bigger app!", Toast.LENGTH_SHORT).show();
            }
        });
        buttonXYZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my XYZ reader app!", Toast.LENGTH_SHORT).show();
            }
        });
        buttonCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my Capstone app!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    /**
     * sets up the top bar
     */
    private void setUpToolBar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(getString(R.string.app_toolbar_title));
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        // enabling action bar app icon and behaving it as toggle button
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
