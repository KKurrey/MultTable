package com.example.multtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    EditText editText;
    Button button;
    int mul = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer buffer = new StringBuffer();
                int num = Integer.parseInt(editText.getText().toString());
                for (int i = 1; i <= 10; i++){
                    mul = num * i;
                    buffer.append(num + "   X   " + i + "   =   " + mul + "\n\n\n");
                }
                text.setText(buffer);
            }
        });
    }
}