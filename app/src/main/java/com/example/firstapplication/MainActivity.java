package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);
        editText=(EditText)findViewById(R.id.edit_text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.button:
                        String inputText=editText.getText().toString();
                        Toast.makeText(MainActivity.this,inputText,
                                Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });
    }
}