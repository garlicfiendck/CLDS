package com.example.stl.clds;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import static android.net.Uri.parse;

public class LindaActivity extends AppCompatActivity {

    TextView bioText;
    ImageView bioImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);
        bioText = findViewById(R.id.bio_group);
        bioText.setText(R.string.bio_linda);

        bioImage = findViewById(R.id.photo_group);
        bioImage.setImageResource(R.drawable.linda);

        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.template_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.project1:
                goToWeb();
                break;
            case R.id.project2:
                goToWeb2();
                break;
            case R.id.project3:
                goToWeb3();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private void goToWeb() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/lindapokorny/IntelliJProjects/tree/master/Pathfinder"));
        startActivity(intent);
    }

    private void goToWeb3() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/lindapokorny/Story_App_HW_POKORNY_LINDA"));
        startActivity(intent);
    }

    private void goToWeb2() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/lindapokorny/CYOA_Pursuit_HW_Pokorny_Linda"));
        startActivity(intent);
    }

}