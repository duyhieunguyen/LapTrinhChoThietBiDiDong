package com.example.lap5_textview_edittext_button;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.TextView;

public class CongTruNhanChia extends AppCompatActivity {

    Button btnCong, btnTru, btnNhan, btnChia;
    EditText editSoA, editSoB;
    TextView txtKq;

    View.OnClickListener myClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()){
                case R.id.button_cong:
                    String sa = editSoA.getText()+toString();
                    String sb = editSoB.getText().toString();
                    int a = Integer.parseInt(sa);
                    int b = Integer.parseInt(sb);
                    txtKq.setText(a + " + " + b + " = "+(a+b));
                    break;
                case R.id.button_tru:
                    break;
                case R.id.button_nhan:
                    break;
                case R.id.button_chia:
                    break;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cong_tru_nhan_chia);
        btnCong = findViewById(R.id.button_cong);
        btnNhan = findViewById(R.id.button_nhan);
        btnTru = findViewById(R.id.button_tru);
        btnChia = findViewById(R.id.button_chia);

        editSoA = findViewById(R.id.editText_soA);
        editSoB = findViewById(R.id.editText_soB);

        txtKq = findViewById(R.id.textView_ketqua);

        btnCong.setOnClickListener(myClick);



    }

}
