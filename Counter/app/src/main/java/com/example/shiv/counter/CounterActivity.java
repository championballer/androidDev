package com.example.shiv.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {

    private TextView text;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        text = findViewById(R.id.Counter);
        button = findViewById(R.id.Increment);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int current = Integer.parseInt((String)text.getText());
                current++;
                String toSet = current+"";
                text.setText(toSet);
            }
        };

        button.setOnClickListener(listener);






    }
}
