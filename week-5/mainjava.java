package com.example.prak5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.view.MenuItem;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void back1(View view){
        setContentView(R.layout.activity_main);
    }

    public void back2(View view){
        setContentView(R.layout.setting);
    }

    public void profil(View view){
        setContentView(R.layout.profil);
    }

    public void setting(){
        Toast.makeText(this,"Menu selected", Toast.LENGTH_LONG).show();
        setContentView(R.layout.setting);
    }

    public void profil(){
        Toast.makeText(this,"Profil  selected", Toast.LENGTH_LONG).show();
        setContentView(R.layout.profil);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.Setting:
                setting();
                return true;

            case R.id.logout:
                onDestroy();
                onStop();
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
