package com.example.exactionbuttons;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Toolbar myToolbar = findViewById(R.id.toolBar);
        setSupportActionBar(myToolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.act_camera){
            Toast.makeText(this, R.string.act_camera, Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.act_call){
            Toast.makeText(this, R.string.act_call, Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.act_rotate){
            Toast.makeText(this, R.string.act_rotate, Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.act_help){
            Toast.makeText(this, R.string.act_help, Toast.LENGTH_SHORT).show();
        }
        
        return super.onOptionsItemSelected(item);
    }
}