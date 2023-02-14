import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LuasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas);

        TextView hasilLuas;

        hasilLuas=findViewById(R.id.hasilLuas);

        Bundle terimaData=getIntent().getExtras();
        Double panjang=terimaData.getDouble("panjang");
        Double lebar=terimaData.getDouble("lebar");

        Double totalLuas=panjang*lebar;

        hasilLuas.setText(Double.toString(totalLuas));
    }
}