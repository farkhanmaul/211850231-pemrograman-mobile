import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText Nama;
    private EditText NIM;
    private EditText Kelas;
    private RadioGroup jnskelamin;
    private RadioButton Lakilaki;
    private RadioButton perempuan;
    private CheckBox setuju;
    private TextView TampilNama;
    private TextView TampilSetuju;
    private TextView TampilJenisKelamin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nama=(EditText) findViewById(R.id.isinama);
        jnskelamin=(RadioGroup) findViewById(R.id.radiogrup);
        Lakilaki=(RadioButton) findViewById(R.id.rdb1);
        perempuan=(RadioButton) findViewById(R.id.rdb2);
        setuju=(CheckBox) findViewById(R.id.checkAgree);
    }

    public void hasil(View view) {
        setContentView(R.layout.hasil);
        TampilNama=(TextView) findViewById(R.id.tampilNama);
        TampilNama.setTextColor(Color.WHITE);
        TampilNama.setBackgroundColor(Color.BLUE);
        TampilNama.setText(Nama.getText());

        TampilJenisKelamin=(TextView)findViewById(R.id.tampilJenisKelamin);
        TampilJenisKelamin.setTextColor(Color.WHITE);
        if (Lakilaki.isChecked()){
            TampilJenisKelamin.setBackgroundColor(Color.GRAY);
            TampilJenisKelamin.setText("Laki-Laki");
        }
        if (perempuan.isChecked()){
            TampilJenisKelamin.setBackgroundColor(Color.MAGENTA);
            TampilJenisKelamin.setText("Perempuan");
        }

        TampilSetuju=(TextView) findViewById(R.id.tampilSetuju);
        TampilSetuju.setTextColor(Color.WHITE);

        if(setuju.isChecked()){
            TampilSetuju.setBackgroundColor(Color.GREEN);
            TampilSetuju.setText("Semua Yang di Isikan Benar");
        }
        else{
            TampilSetuju.setBackgroundColor(Color.RED);
            TampilSetuju.setText("Ada yang salah");
        }
    }
}