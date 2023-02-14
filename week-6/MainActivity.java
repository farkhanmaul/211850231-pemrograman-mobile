import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button luas,keliling;
        EditText panjang,lebar;

        luas=findViewById(R.id.hitungLuas);
        keliling=findViewById(R.id.hitungKeliling);

        panjang=findViewById(R.id.panjang);
        lebar=findViewById(R.id.lebar);



        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hitungLuas = new Intent(MainActivity.this,LuasActivity.class);
                Double sisipanjang=Double.parseDouble(panjang.getText().toString());
                Double sisilebar=Double.parseDouble(lebar.getText().toString());

                hitungLuas.putExtra("panjang",sisipanjang);
                hitungLuas.putExtra("lebar",sisilebar);

                startActivity(hitungLuas);
            }
        });

        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hitungKeliling = new Intent(MainActivity.this,KelilingActivity.class);
                Double sisipanjang=Double.parseDouble(panjang.getText().toString());
                Double sisilebar=Double.parseDouble(lebar.getText().toString());

                hitungKeliling.putExtra("panjang",sisipanjang);
                hitungKeliling.putExtra("lebar",sisilebar);

                startActivity(hitungKeliling);
            }
        });

    }
}