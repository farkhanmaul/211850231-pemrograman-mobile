import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class KelilingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling);

        TextView hasilKeliling;

        hasilKeliling=findViewById(R.id.hasilKeliling);

        Bundle terimaData=getIntent().getExtras();
        Double panjang=terimaData.getDouble("panjang");
        Double lebar=terimaData.getDouble("lebar");

        Double totalKeliling=panjang+lebar+panjang+lebar;

        hasilKeliling.setText(Double.toString(totalKeliling));

    }
}