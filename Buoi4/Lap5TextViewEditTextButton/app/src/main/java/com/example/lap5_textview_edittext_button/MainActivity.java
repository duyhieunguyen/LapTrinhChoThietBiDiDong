package com.example.lap5_textview_edittext_button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtNhapTen;
    EditText editTen;
    Button btnLayTen;
    Button btnLayTenEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNhapTen = findViewById(R.id.textView1);
        txtNhapTen.setText("Hello Hiếu");

        btnLayTen = findViewById(R.id.button_nhapten);
        btnLayTenEditText = findViewById(R.id.button_editText2);

        editTen = (EditText)findViewById(R.id.editText2);


        final String msg = txtNhapTen.getText().toString();
        final String msg2 = editTen.getText().toString();

        btnLayTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });

        btnLayTenEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, msg2, Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    Intent intent;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        intent = new Intent(this, CongTruNhanChia.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}
