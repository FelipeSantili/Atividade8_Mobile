package com.example.atividade7;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.act_add) {
            Toast.makeText(this, R.string.act_add, Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.act_edit) {
            Toast.makeText(this, R.string.act_edit, Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.act_remove) {
            Toast.makeText(this, R.string.act_remove, Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.act_help) {
            Toast.makeText(this, R.string.act_help, Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}